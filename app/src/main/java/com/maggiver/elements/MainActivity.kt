package com.maggiver.elements

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.maggiver.elements.ui.rentalcar.navigation.NavigationGraphMasterApp
import com.maggiver.elements.ui.rentalcar.navigation.NavigationRentalCarBlack
import com.maggiver.elements.ui.theme.ElementsTheme
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale

class MainActivity : ComponentActivity() {


    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ElementsTheme {

                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                ) {

                    /*Column(modifier = Modifier.padding(16.dp)) {
                        InputsDefault()
                        InputsCustom()
                        InputsCustomOneline()
                    }*/


                    /*Screen Layouts ***************************************/
                    /*NavigationCoursera()
                    NavigationGraphics()
                    NavigationGraphicsWhite()*/


                    //NavigationRentalCarBlack()

                    NavigationGraphMasterApp(navController =  rememberNavController())

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

                        val dateFecha = LocalDate.now()
                        Log.i("dateFECHA", "LocalDate.now() = ${dateFecha.toString()}")

                        val dateFecha2 = LocalDateTime.now(ZoneId.systemDefault())
                        Log.i("dateFECHA", "LocalDateTime.now(ZoneId.systemDefault()) = ${dateFecha2.toString()}")

                        val dateFecha3 = ZonedDateTime.of(dateFecha2, ZoneId.systemDefault())
                        Log.i("dateFECHA", " ZonedDateTime.of(dateFecha2, ZoneId.systemDefault()) = ${dateFecha3.toString()}")

                        /*convert to UTC*/
                        var dateUTC = dateFecha3.toInstant().toEpochMilli()
                        Log.i("dateFECHA", "utc : ${dateUTC.toString()}")

                        /*convert to ZonedDateTime*/
                        var zonedDateConvert = ZonedDateTime.ofInstant(Instant.ofEpochMilli(dateUTC), ZoneId.systemDefault())
                        Log.i("dateFECHA", "convert utc :  ${zonedDateConvert.toString()}")

                        /*convert zone horaria sin pasar por utc*/
                        dateFecha3.withZoneSameInstant(ZoneId.of("Australia/Melbourne"))

                        var dateFormatCustom = DateTimeFormatter.ofPattern("d MMM", Locale.getDefault())
                        var formattedString = dateFecha3.format(dateFormatCustom)
                        Log.i("dateFECHA", "date format :  ${formattedString}")

                    } else {

                        val date1 = Date()
                        Log.i("dateFECHA", "Date() = ${date1.toString()}")

                    }




                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ElementsTheme {

    }
}