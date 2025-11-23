package com.blue.convention

import org.gradle.api.Project
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.project

fun DependencyHandlerScope.addUILayerDependencies(project: Project) {

    // 디자인시스템 모듈
    add("implementation", project(":core:designsystem"))

    // Compose bundle
    add("implementation", project.libs.findBundle("compose").get())

    // Compose Debug bundle
    add("debugImplementation", project.libs.findBundle("compose.debug").get())

    // Compose UI Test
    add("androidTestImplementation", project.libs.findLibrary("androidx.compose.ui.test.junit4").get())
}