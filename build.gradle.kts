plugins {
    java
    id("org.springframework.boot") version "4.0.3" apply false
    id("io.spring.dependency-management") version "1.1.7" apply false
    id("com.gorylenko.gradle-git-properties") version "2.5.4" apply false
}

//springBoot {
//    buildInfo()
//}
//
//version = "0.0.1-SNAPSHOT"
//description = "catalog-service"

//java {
//    toolchain {
//        languageVersion = JavaLanguageVersion.of(25)
//    }
//}

//dependencyManagement {
//    imports {
//        mavenBom("org.testcontainers:testcontainers-bom:1.20.4")
//    }
//}

//dependencies {
//    implementation("org.springframework.boot:spring-boot-starter")
//    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//    implementation("org.springframework.boot:spring-boot-starter-webmvc")
//    implementation("org.springframework.boot:spring-boot-starter-actuator")
//    testImplementation("org.springframework.boot:spring-boot-starter-test")
//    runtimeOnly("org.postgresql:postgresql")
//
//    testImplementation("org.springframework.boot:spring-boot-testcontainers")
//    testImplementation("org.testcontainers:postgresql")
//    testImplementation("org.postgresql:postgresql")
//    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
//}
subprojects {

}