import com.blue.convention.addUILayerDependencies
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidPresentationUIConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.pluginManager.apply("multi.module.android.library.compose")

        target.dependencies {
            addUILayerDependencies(target)
        }
    }
}