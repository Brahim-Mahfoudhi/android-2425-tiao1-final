// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.7.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id("com.google.devtools.ksp") version "1.9.10-1.0.13" apply false
    id ("com.google.dagger.hilt.android") version "2.48.1" apply false
}

buildscript {
    dependencies {
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.48.1")
        classpath ("org.jetbrains.dokka:dokka-gradle-plugin:1.9.10")
        classpath("com.github.jk1:gradle-license-report:1.16")
    }
}