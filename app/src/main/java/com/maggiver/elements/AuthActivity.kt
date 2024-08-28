package com.maggiver.elements

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.maggiver.elements.ui.rentalcar.navigation.NavigationGraphAuth
import com.maggiver.elements.ui.rentalcar.navigation.NavigationGraphMasterApp
import com.maggiver.elements.ui.rentalcar.navigation.routes.RootGraph
import com.maggiver.elements.ui.theme.ElementsTheme
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

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

        val date1 = Date()
        Log.i("dateFECHA", "date1 = ${date1.toString()}")

        //val dateFormat: DateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.getDefault())
        val dateFormat: DateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.getDefault())
        val date2 = dateFormat.format(Date())
        Log.i("dateFECHA", "date2 = ${date2.toString()}")

        val locale = Locale("es", "CO")
        val dateFormat3 = DateFormat.getDateInstance(DateFormat.DEFAULT, locale)
        val date3 = dateFormat3.format(Date())
        Log.i("dateFECHA", "date3 = ${date3.toString()}")

        val locale4 = Locale("es", "CO")
        val dateFormat4 = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale4)
        val date4 = dateFormat4.format(Date())
        Log.i("dateFECHA", "date4 = ${date4.toString()}")

        val pattern = "dd-MM-yyyy - HH:mm:ss z"
        val simpleDateFormat1: SimpleDateFormat = SimpleDateFormat(pattern, Locale.getDefault())
        val date5 = simpleDateFormat1.format(Date())
        Log.i("dateFECHA", "date5 = ${date5.toString()}")

        val simpleDateFormat2 = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss z", Locale.getDefault())
        simpleDateFormat2.timeZone = TimeZone.getTimeZone("UTC") // This line converts the given date into UTC time zone
        val date6: String = simpleDateFormat2.format(Date())
        val date7: Date? = simpleDateFormat2.parse(date6)

        Log.i("dateFECHA", "date6 = ${date6}")
        Log.i("dateFECHA", "date6 UTC = ${date7}")

    }
}
