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
import com.maggiver.elements.ui.rentalcar.navigation.NavigationGraphMasterApp
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

                val contextLocal = LocalContext.current
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = RootGraph.ROOT_DESTINATION_AUTH,
                    route = RootGraph.ROOT_ROUTE_AUTH
                ) {

                    NavigationGraphAuth(navController = navController, contextLocal = contextLocal)

                    composable(route = RootGraph.ROOT_ROUTE_MAIN) {
                        NavigationGraphMasterApp()
                    }

                }

            }
        }
    }
}
