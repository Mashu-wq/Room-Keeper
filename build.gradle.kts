buildscript {
    dependencies {
//        classpath(libs.google.services)
        classpath("com.google.gms:google-services:4.4.1")
        classpath("com.android.tools.build:gradle:3.6.4")
    }

    repositories {
        google()       // here
        mavenCentral()
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
//    alias(libs.plugins.androidApplication) apply false
    id("com.android.application") version "8.1.0" apply false
}





//repositories {
//    google()
//    mavenCentral()
//
//}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins {
//    alias(libs.plugins.androidApplication) apply false
//    id("com.google.gms.google-services") version "4.4.1" apply false
//}