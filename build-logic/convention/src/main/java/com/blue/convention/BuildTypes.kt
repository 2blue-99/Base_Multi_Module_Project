package com.blue.convention

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.CommonExtension
import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties
import com.android.build.api.dsl.BuildType
import com.android.build.gradle.LibraryExtension
import org.gradle.api.Project

internal enum class ExtensionType {
    APPLICATION,
    LIBRARY
}

internal fun Project.configureBuildTypes(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
    extensionType: ExtensionType
) {
    commonExtension.apply {

        // BuildConfig 활성화
        buildFeatures {
            buildConfig = true
        }

        // local.properties에서 API_KEY 가져오기
        val apiKey = gradleLocalProperties(rootDir, providers)
            .getProperty("API_KEY")

        when (extensionType) {

            ExtensionType.APPLICATION -> {
                extensions.configure(ApplicationExtension::class.java) {
                    buildTypes {

                        getByName("debug") {
                            configureDebugBuildType(apiKey)
                        }

                        maybeCreate("staging").apply {
                            configureStagingBuildType(apiKey)
                        }

                        getByName("release") {
                            configureReleaseBuildType(commonExtension, apiKey)
                        }
                    }
                }
            }

            ExtensionType.LIBRARY -> {
                extensions.configure(LibraryExtension::class.java) {
                    buildTypes {

                        getByName("debug") {
                            configureDebugBuildType(apiKey)
                        }

                        maybeCreate("staging").apply {
                            configureStagingBuildType(apiKey)
                        }

                        getByName("release") {
                            configureReleaseBuildType(commonExtension, apiKey)
                        }
                    }
                }
            }
        }
    }
}

private fun BuildType.configureDebugBuildType(apiKey: String) {
    buildConfigField("String", "API_KEY", "\"$apiKey\"")
    buildConfigField("String", "BASE_URL", "\"DEBUG_API_URL\"")
}

private fun BuildType.configureStagingBuildType(apiKey: String) {
    buildConfigField("String", "API_KEY", "\"$apiKey\"")
    buildConfigField("String", "BASE_URL", "\"STAGING_API_URL\"")
}

private fun BuildType.configureReleaseBuildType(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
    apiKey: String
) {
    buildConfigField("String", "API_KEY", "\"$apiKey\"")
    buildConfigField("String", "BASE_URL", "\"RELEASE_API_URL\"")

    isMinifyEnabled = true
    proguardFiles(
        commonExtension.getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro"
    )
}
