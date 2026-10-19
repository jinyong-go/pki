plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "pki"

include(
    "backend:common",
    "backend:ra-server",
    "backend:ca-server",
    "backend:tsa-server",
)

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}
