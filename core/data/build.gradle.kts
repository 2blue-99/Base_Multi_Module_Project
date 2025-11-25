plugins {
    alias(libs.plugins.multi.module.android.library)
}

android {
    namespace = "com.blue.data"
}

dependencies {
    implementation(projects.domain)
    implementation(projects.core.database)
    implementation(projects.core.datastore)
    implementation(projects.core.firebase)
}