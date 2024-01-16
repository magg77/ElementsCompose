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
import com.maggiver.elements.ui.rentalcar.navigation.RootGraphAuth
import com.maggiver.elements.ui.rentalcar.navigation.RoutesAuth
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
                    AuthApp(navController = rememberNavController())
                }
            }
        }
    }
}

@Composable
fun AuthApp(navController: NavHostController) {

    val contextLocal = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = RoutesAuth.AuthStartRoute.route,
        route = RootGraphAuth.ROOT_NAVIGATION_GRAPH
    ) {

        navigation(
            startDestination = RoutesAuth.LoginRoute.route, route = RoutesAuth.AuthStartRoute.route
        ) {

            composable(RoutesAuth.LoginRoute.route) {
                LoginScreen(
                    navController = navController,
                    onClickLogin = {
                        contextLocal.startActivity(
                            Intent(contextLocal, MainActivity::class.java)
                        )
                        (contextLocal as ComponentActivity).finish()
                    },
                    navigateToRegister = {
                        navController.navigate(RoutesAuth.RegisterRoute.route)
                    },
                    navigateToForgotPassword = {
                        navController.navigate(RoutesAuth.ForgotPasswordRoute.route)
                    }
                )
            }

            composable(RoutesAuth.RegisterRoute.route) {
                RegisterScreen(
                    navController = navController,
                    onClickRegister = {
                        contextLocal.startActivity(
                            Intent(contextLocal, MainActivity::class.java)
                        )
                        (contextLocal as ComponentActivity).finish()
                    },
                    navigateToLogin = {
                        /*navController.navigate(
                            route = RootGraphAuth.ROOT_NAVIGATION_GRAPH,
                            navOptions = NavOptions.Builder()
                            .setPopUpTo(RoutesAuth.AuthStartRoute.route, true).build()
                        )*/
                        navController.navigate(route = RoutesAuth.LoginRoute.route)
                    }
                )
            }

            composable(RoutesAuth.ForgotPasswordRoute.route) {
                ForgetPasswordScreen(
                    navController = navController,
                    onClickForgotPassword = {
                        contextLocal.startActivity(Intent(contextLocal, MainActivity::class.java))
                        (contextLocal as ComponentActivity).finish()
                    },
                    navigateToLogin = {
                        navController.navigate(
                            route = RootGraphAuth.ROOT_NAVIGATION_GRAPH,
                            navOptions = NavOptions.Builder()
                                .setPopUpTo(RoutesAuth.AuthStartRoute.route, true).build()
                        )
                    }
                )
            }
        }
    }
}