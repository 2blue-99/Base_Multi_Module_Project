import com.android.build.gradle.LibraryExtension
import com.blue.convention.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

/**
 * 화면 없음, Compose 관련 모듈 플로그인
 */
class AndroidLibraryComposeConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.pluginManager.run {
            apply("multi.module.android.library")
            apply("org.jetbrains.kotlin.plugin.compose")
        }

        val extension = target.extensions.getByType<LibraryExtension>()
        target.configureAndroidCompose(extension)
    }
}