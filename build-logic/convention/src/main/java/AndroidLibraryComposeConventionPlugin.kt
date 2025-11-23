import com.android.build.gradle.LibraryExtension
import com.blue.convention.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidLibraryComposeConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.pluginManager.apply("multi.module.android.library")

        val extension = target.extensions.getByType<LibraryExtension>()
        target.configureAndroidCompose(extension)
    }
}