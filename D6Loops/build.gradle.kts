plugins {
    java
    application
    kotlin("jvm")
}

application {
    mainClassName = "samples.WhenWithEnumsKt"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit", "junit", "4.12")
}
