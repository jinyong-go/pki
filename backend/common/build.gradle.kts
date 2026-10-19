plugins {
    `java-library`
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.spring)
}

dependencies {
    api(platform(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES))
    api("org.springframework.boot:spring-boot-starter-webmvc")
    api("org.springframework.boot:spring-boot-starter-validation")
    api("org.springframework.boot:spring-boot-starter-actuator")
    api("org.jetbrains.kotlin:kotlin-reflect")
    api("tools.jackson.module:jackson-module-kotlin")
    api(libs.bouncycastle.prov)
    api(libs.bouncycastle.pkix)
    api(libs.springdoc.webmvc.ui)
}
