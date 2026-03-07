plugins {
    java
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    id("com.gorylenko.gradle-git-properties")
}

springBoot {
    buildInfo()
}

gitProperties {
    failOnNoGitDirectory = false
    keys = listOf(
        "git.branch",
        "git.build.host",
        "git.build.user.email",
        "git.build.user.name",
        "git.build.version",
        "git.closest.tag.commit.count",
        "git.closest.tag.name",
        "git.commit.id",
        "git.commit.id.abbrev",
        "git.commit.id.describe",
        "git.commit.message.full",
        "git.commit.message.short",
        "git.commit.time",
        "git.commit.user.email",
        "git.commit.user.name",
        "git.dirty",
        "git.remote.origin.url",
        "git.tags",
        "git.total.commit.count"
    )
}

version = "0.0.1-SNAPSHOT"
description = "catalog-service"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

dependencyManagement {
    imports {
        mavenBom("org.testcontainers:testcontainers-bom:1.20.4")
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-webmvc")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    runtimeOnly("org.postgresql:postgresql")

    testImplementation("org.springframework.boot:spring-boot-testcontainers")
    testImplementation("org.testcontainers:postgresql")
    testImplementation("org.postgresql:postgresql")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.register("prepareKotlinBuildScriptModel"){}
