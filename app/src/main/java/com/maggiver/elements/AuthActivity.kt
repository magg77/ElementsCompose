package com.maggiver.elements

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.maggiver.elements.ui.rentalcar.navigation.NavigationGraphAuth
import com.maggiver.elements.ui.rentalcar.navigation.NavigationGraphMasterApp
import com.maggiver.elements.ui.rentalcar.navigation.routes.RootGraph
import com.maggiver.elements.ui.theme.ElementsTheme

class AuthActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ElementsTheme {

                val contextLocal = LocalContext.current
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = RootGraph.ROOT_DESTINATION_AUTH,
                    route = RootGraph.ROOT_ROUTE_AUTH,
                    modifier = Modifier
                ) {

                    NavigationGraphAuth(navController = navController)

                    composable(route = RootGraph.ROOT_ROUTE_MAIN) {
                        NavigationGraphMasterApp()
                    }

                }

            }
        }
    }
}
