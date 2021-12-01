import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    application
}

group = "me.vital"
version = "1.0-SNAPSHOT"



tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "12"
}

application {
    mainClass.set("MainKt")
}