plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    id("androidx.navigation.safeargs.kotlin")
    id("com.google.devtools.ksp")
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.maggiver.elements"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.maggiver.elements"
        minSdk = 23
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            resValue("string", "nameApp", "Elements")
            buildConfigField("String", "API_ELEMENTS_PROD", "\"${rootProject.extra["API_URL_BASE_PROD"]}\"")
        }

        getByName("debug") {
            applicationIdSuffix = ".Login_Sunil"
            isDebuggable = true
            manifestPlaceholders["cleartextTrafficPermitted"] = true
            resValue("string", "nameApp", "Elements[DEBUG]")
            buildConfigField("String", "API_ELEMENTS_DEBUG", "\"${rootProject.extra["API_URL_BASE_DEV"]}\"")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
        buildConfig = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.0"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.8.0")

    //constraintLayout
        implementation ("androidx.constraintlayout:constraintlayout-compose:1.0.1")

    //coroutines
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:${rootProject.extra["coroutines_android"]}")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${rootProject.extra["coroutines_android"]}")

    //Jetpack Compose Integration
    //live-data & view-model & navigation
        implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")      //Optional - Integration with ViewModels
        implementation("androidx.compose.runtime:runtime-livedata")                 // Optional - Integration with LiveData
        implementation("androidx.navigation:navigation-compose:${rootProject.extra["compose_navigation"]}")
        /*implementation("androidx.lifecycle:lifecycle-livedata-ktx:${rootProject.extra["liveData"]}")
        implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:${rootProject.extra["liveData"]}")*/

    //hilt
        implementation("com.google.dagger:hilt-android:${rootProject.extra["hilt_version"]}")
        implementation("androidx.legacy:legacy-support-v4:1.0.0")
        implementation(platform("androidx.compose:compose-bom:2023.03.00"))
        androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
        annotationProcessor("com.google.dagger:hilt-compiler:${rootProject.extra["hilt_version"]}")
        //kapt "com.google.dagger:hilt-compiler:$rootProject.hilt_version"
        ksp("com.google.dagger:hilt-compiler:${rootProject.extra["hilt_version"]}")


    //such as input and measurement/layout
        implementation(platform("androidx.compose:compose-bom:2023.10.01"))
        implementation("androidx.compose.ui:ui")
        implementation("androidx.compose.ui:ui-graphics")
        implementation("androidx.compose.ui:ui-tooling-preview")
        implementation("androidx.compose.ui:ui-util")

    //material
        implementation("androidx.compose.material3:material3")
        implementation("androidx.compose.material3:material3-window-size-class")
        implementation("androidx.compose.material:material-icons-extended-android:1.5.4")
        /*implementation("com.google.android.material:material:${rootProject.extra["materialDesing"]}")*/


    //splash-screen
        implementation("androidx.core:core-splashscreen:1.0.1")
        implementation("com.google.accompanist:accompanist-systemuicontroller:0.33.2-alpha")

    //test
        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("androidx.test.ext:junit:1.1.5")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

        androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
        androidTestImplementation("androidx.compose.ui:ui-test-junit4")
        debugImplementation("androidx.compose.ui:ui-tooling")
        debugImplementation("androidx.compose.ui:ui-test-manifest")
}