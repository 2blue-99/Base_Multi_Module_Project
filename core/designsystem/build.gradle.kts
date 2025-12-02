plugins {
    alias(libs.plugins.multi.module.android.library.compose)
}

android {
    namespace = "com.blue.designsystem"
}

dependencies {
    implementation(projects.domain)
}