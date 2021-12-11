import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    application
}

group = "me.tachikawa"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.github.microutils:kotlin-logging-jvm:2.0.10")
    implementation("ch.qos.logback:logback-classic:1.2.3")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("MainKt")
}

// Gradle が使用する Java のバージョンを指定する
// @see https://docs.gradle.org/current/userguide/toolchains.html
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11)) // Java11 を使用する
        vendor.set(org.gradle.jvm.toolchain.JvmVendorSpec.AMAZON) // Amazon Corretto を使用する
    }
}
