plugins {
    alias(libs.plugins.multi.module.android.application.compose)
}

android {
    namespace = "com.blue.base_multi_module_project"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    implementation(projects.feature.googleMap)
    implementation(projects.feature.login)
    implementation(projects.feature.setting)
}