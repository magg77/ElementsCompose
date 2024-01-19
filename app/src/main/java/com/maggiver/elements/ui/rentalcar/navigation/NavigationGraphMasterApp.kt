package com.maggiver.elements.ui.rentalcar.navigation

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.maggiver.elements.ui.rentalcar.navigation.routes.RootGraph
import com.maggiver.elements.ui.rentalcar.navigation.routes.RoutesMaster
import com.maggiver.elements.ui.rentalcar.screens.main.carShopping.CarScreen
import com.maggiver.elements.ui.rentalcar.screens.main.carShopping.PurchaseCar
import com.maggiver.elements.ui.rentalcar.screens.main.home.DetailRentalCar
import com.maggiver.elements.ui.rentalcar.screens.main.home.HomeRentalCar
import com.maggiver.elements.ui.rentalcar.screens.main.profile.ProfileScreen
import com.maggiver.elements.ui.theme.LightColors


/**
 * Created by
 * @AUTHOR: Daniel Maggiver Acevedo
 * @NICK_NAME: mackgaru
 * @DATE: 16,enero,2024
 * @COMPAN: Juice
 * @EMAIL: dmacevedo00@misena.edu.co
 *
 * Todos los derechos de @AUTHOR y de Propiedad Intelectual, son reservados y protegidos por su creador y se phohibe su reprodución, edición, copias, conservación, divulgación y comercialización sin consentimiento escrito.
 * En caso que un tercero haga uso indebidode esta propiedad intelectual, su @AUTHOR, puede ejercer una acción legal indemnizatoria por el uso indebido de sus obras legitimas.
 * solicitando al juez civil que condene al infractor al pago de perjuicios o, de igual forma, interponga una denuncia por ser víctima del delito de violación a los derechos morales, patrimoniales de autor y demas derechos vulnerados
 *
 *
 * Su @AUTHOR GOZA DE LOS DERECHOS DE:
 * @Derechos_de_AUTHOR: El software por ser una obra literaria goza de protección legal desde el momento de su creación.
 * @Derechos_Morales: prerrogativas irrenunciables e inalienables de las que goza el autor legítimo del software que le permite conservar la obra de forma inédita, divulgarla, oponerse a las posibles modificaciones que tenga o retirarla del mercado cuando así lo considere.
 * @Derechos_Patrimoniales: Prerrogativas de carácter económico que le permiten al autor del software obtener provecho económico de todas las utilidades que genere la reproducción o distribución del software.
 *                         pueden ser transferibles a terceros con la autorización del titular del software en virtud de la autonomía de su voluntad, en cuyo caso, el autor o titular de la obra denominado cedente transmite total o parcialmente sus derechos a un tercero a través de un contrato de cesión de derechos.
 * @Derecho_de_transformacion_distribucion_y_reproduccion_de_la_obra: facultad que tiene el titular o autor de un software de realizar cambios totales o parciales al código de su obra; ponerla a disposición del público o autorizar su difusión.
 */


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationGraphMasterApp(navController: NavHostController) {
    Scaffold(
        modifier = Modifier.background(Color(0xFFFF4242)),
        topBar = {
            /*TopAppBar(title = { Text(text = "HeladoMagg") })*/
        },
        bottomBar = { NavigationBarMaster(navController) }
    ) {
        NavigationGraphMasterApp(navController, it)
    }
}

@Composable
fun NavigationBarMaster(navController: NavHostController) {
    NavigationBar(
        modifier = Modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        var currentDestination = navBackStackEntry?.destination
        var selectedItemIndex by rememberSaveable { mutableStateOf(0) }

        TOP_LEVEL_DESTINATIONS.forEachIndexed { index, item ->

            var selected2 = currentDestination?.hierarchy?.any { it.route == item.route } == true
            Log.i("click", "selected2 = $selected2")

            NavigationBarItem(
                modifier = Modifier,
                selected = selected2,
                onClick = {
                    Log.i("click", "selec = $index")

                    selectedItemIndex = index
                    navController.navigate(item.route) {
                        Log.i("click", "${navController.graph.findStartDestination().id}")
                        popUpTo(
                            navController.graph.findStartDestination().id
                        ) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                label = {
                    Text(text = item.title, color = Color.White)
                },
                alwaysShowLabel = false,
                icon = {
                    BadgedBox(badge = {
                        if (item.badgeCount != null) {
                            Badge(
                                containerColor = Color(0xFFFFE000),
                            ) {
                                Text(text = item.badgeCount.toString(), color = MaterialTheme.colorScheme.surface)
                            }
                        } else if (item.hasNew) {
                            Badge(
                                containerColor = Color(0xFFFFE000),
                            )
                        }
                    }) {
                        Icon(
                            imageVector = if (index == selectedItemIndex) {
                                item.selectedIcon
                            } else item.uselectedIcon,
                            contentDescription = item.title
                        )
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color(0xFF5CC500),
                    unselectedTextColor = LightColors.textGrey,
                    unselectedIconColor = Color.Gray
                )
            )
        }
    }
}

@Composable
fun NavigationGraphMasterApp(navController: NavHostController, paddingValue: PaddingValues) {
    NavHost(
        navController = navController,
        startDestination = RoutesMaster.MasterStartRoute.route,
        route = RootGraph.MASTER_CONTENT_APP
    ) {

        navigation(
            startDestination = RoutesMaster.HomeRoute.route,
            route = RoutesMaster.MasterStartRoute.route
        ) {

            composable(RoutesMaster.HomeRoute.route) {
                HomeRentalCar(navController)
            }
                composable(
                    route = "DetailRentalCar/{typeDataSend}/{carCarouselPosition}",
                    arguments = listOf(
                        navArgument("typeDataSend") { type = NavType.StringType },
                        navArgument("carCarouselPosition") { type = NavType.IntType }
                    )
                ) { backStackEntry ->
                    DetailRentalCar(
                        navController = navController,
                        typeDataSend = backStackEntry.arguments?.getString("typeDataSend") ?: "",
                        carCarouselPosition = backStackEntry.arguments?.getInt("carCarouselPosition") ?: 0
                    )
                }



            composable(RoutesMaster.CartRoute.route) {
                CarScreen(navController = navController)
            }
                composable(
                    route = "PurchaseCar/{carCarouselPosition}",
                    arguments = listOf(
                        navArgument("carCarouselPosition") { type = NavType.IntType }
                    )
                ) { backStackEntry ->
                    PurchaseCar(
                        navController = navController,
                        carCarouselPosition = backStackEntry.arguments?.getInt("carCarouselPosition") ?: 0
                    )
                }



            composable(RoutesMaster.ProfileRoute.route) {
                ProfileScreen(navController = navController)
            }



        }
    }
}

data class BottomNavigationItem(
    val title: String,
    val route: String,
    val selectedIcon: ImageVector,
    val uselectedIcon: ImageVector,
    val hasNew: Boolean,
    val badgeCount: Int? = null
)

val TOP_LEVEL_DESTINATIONS = listOf(
    BottomNavigationItem(
        "Home",
        RoutesMaster.HomeRoute.route,
        Icons.Filled.Home,
        Icons.Filled.Home,
        false,
        null
    ),
    BottomNavigationItem(
        "Cart",
        RoutesMaster.CartRoute.route,
        Icons.Filled.ShoppingCart,
        Icons.Outlined.ShoppingCart,
        true,
        7
    ),
    BottomNavigationItem(
        "Profile",
        RoutesMaster.ProfileRoute.route,
        Icons.Filled.AccountCircle,
        Icons.Outlined.AccountCircle,
        true,
        null
    )
)