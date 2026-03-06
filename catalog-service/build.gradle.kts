plugins {
    java
    id("org.springframework.boot") version "4.0.3"
    id("io.spring.dependency-management") version "1.1.7"
}

version = "0.0.1-SNAPSHOT"
description = "catalog-service"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation(platform("org.testcontainers:testcontainers-bom:2.0.3"))
    testImplementation("org.springframework.boot:spring-boot-testcontainers")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.testcontainers:postgresql")
    testImplementation("org.postgresql:postgresql")
    runtimeOnly("org.postgresql:postgresql")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.register("prepareKotlinBuildScriptModel"){}
