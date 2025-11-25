import com.blue.convention.addUILayerDependencies
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

/**
 * 화면 존재, Compose 관련 모듈 플로그인
 */
class AndroidPresentationUIConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.pluginManager.run {
            apply("multi.module.android.library.compose")
            apply("org.jetbrains.kotlin.plugin.compose")
        }

        target.dependencies {
            addUILayerDependencies(target)
        }
    }
}