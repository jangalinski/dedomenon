plugins {
    kotlin("jvm") version "1.3.21"

    application
}

apply {
    from("${rootProject.rootDir}/gradle/repositories.gradle.kts")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    // Define the main class for the application.
    mainClassName = "com.github.jangalinski.dedomenon.AppKt"
}
