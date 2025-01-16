/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.12/samples
 */

plugins {
    alias(libs.plugins.android.application)
    kotlin("android")
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.activity.ktx)
    implementation(kotlin("stdlib"))
}

android {
    namespace = "org.android.template"
    compileSdk = 35

    defaultConfig {
        applicationId = "org.android.template"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
        }

        getByName("debug") {
            applicationIdSuffix = ".debug"
            isDebuggable = true
        }
    }
}

kotlin {
    jvmToolchain(17)
}
