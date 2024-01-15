package com.maggiver.elements

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.platform.LocalContext
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var statusLoginUser = true

        WindowCompat.setDecorFitsSystemWindows(window, false)
        installSplashScreen().setKeepOnScreenCondition { false }

        setContent {
            val context = LocalContext.current
            if (statusLoginUser) {
                context.startActivity(Intent(context, MainActivity::class.java))
                (context as Activity).finish()
            }
        }
    }
}