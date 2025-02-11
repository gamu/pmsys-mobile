plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin{
    jvm {
        compilations.all {
            kotlinOptions {
                jvmTarget = "11"
            }
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.kotlin.stdlib)
            }
        }
    }
}

tasks.register("clean", Delete::class) {
    delete(buildDir)
}
