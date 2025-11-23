plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)

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

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}