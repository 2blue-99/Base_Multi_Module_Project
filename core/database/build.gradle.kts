plugins {
    alias(libs.plugins.multi.module.android.library)
    alias(libs.plugins.multi.module.android.room)
    alias(libs.plugins.multi.module.android.hilt)
}

android {
    namespace = "com.blue.database"
}

dependencies {
    implementation(projects.domain)
}