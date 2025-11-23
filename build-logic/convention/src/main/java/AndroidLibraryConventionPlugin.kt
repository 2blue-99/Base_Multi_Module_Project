import com.android.build.gradle.LibraryExtension
import com.blue.convention.ExtensionType
import com.blue.convention.configureBuildTypes
import com.blue.convention.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidLibraryConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.pluginManager.apply {
            apply("com.android.library")
            apply("org.jetbrains.kotlin.android")
        }

        target.extensions.configure<LibraryExtension> {

            // Kotlin + Android 기본 설정
            target.configureKotlinAndroid(this)

            // BuildTypes 설정 (APPLICATION / LIBRARY 분기)
            target.configureBuildTypes(
                commonExtension = this,
                extensionType = ExtensionType.LIBRARY
            )

            defaultConfig {
                testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                consumerProguardFiles("consumer-rules.pro")
            }
        }
    }
}