plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    // Use a stable KSP version for Kotlin 1.9.0
    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false
}

buildscript {
    dependencies {
        classpath(libs.androidx.navigation.safe.args.gradle.plugin)
    }
}
