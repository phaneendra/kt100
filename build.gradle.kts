import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    base
    kotlin("jvm") version "1.2.41" apply false
}

allprojects {
    group = "samples"
    version = "1.0"
    repositories {
        mavenCentral()
    }
}

subprojects {
    tasks.withType<KotlinCompile> {
        println("Configuring $name in ${project.name}")
        kotlinOptions.jvmTarget = "1.8"
    }
}

dependencies {
    subprojects.forEach {
        archives(it)
    }
}

