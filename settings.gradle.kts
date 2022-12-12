pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
    }
}

rootProject.name = "KmmCompose"
include(":androidApp")
include(":shared")