plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.multi.module.android.room)
}

android {
    namespace = "com.blue.database"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}