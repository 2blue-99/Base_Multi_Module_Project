plugins {
    alias(libs.plugins.multi.module.android.library)
    alias(libs.plugins.multi.module.android.hilt)
}

android {
    namespace = "com.blue.firebase"

}

dependencies {
    implementation(projects.domain)
}