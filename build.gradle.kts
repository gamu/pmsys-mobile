plugins {
    alias(libs.plugins.kotlin.multiplatform) apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

// Опциональная задача для полного очищения build-директорий
tasks.register("cleanAll", Delete::class) {
    delete(rootProject.buildDir)
    subprojects.forEach { delete(it.buildDir) }
}
