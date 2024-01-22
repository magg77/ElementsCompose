package com.maggiver.elements

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.NavOptions
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.maggiver.elements.ui.rentalcar.navigation.NavigationGraphAuth
import com.maggiver.elements.ui.rentalcar.navigation.routes.RootGraph
import com.maggiver.elements.ui.rentalcar.navigation.routes.RoutesAuth
import com.maggiver.elements.ui.rentalcar.screens.auth.ForgetPasswordScreen
import com.maggiver.elements.ui.rentalcar.screens.auth.LoginScreen
import com.maggiver.elements.ui.rentalcar.screens.auth.RegisterScreen
import com.maggiver.elements.ui.theme.ElementsTheme

class AuthActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ElementsTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    Modifier.fillMaxSize()
                ) {

                    val contextLocal = LocalContext.current
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = RoutesAuth.AUTH_ROOT_ROUTE.route,
                        route = RootGraph.ROOT_NAVIGATION_AUTH
                    ) {
                        NavigationGraphAuth(navController = navController, contextLocal = contextLocal)
                    }
                }
            }
        }
    }
}
