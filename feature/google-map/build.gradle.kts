plugins {
    alias(libs.plugins.multi.module.android.presentation.ui)
}

android {
    namespace = "com.blue.google_map"
}

dependencies {
    implementation(projects.domain)
    implementation(projects.core.designsystem)
    implementation(projects.core.common)
}