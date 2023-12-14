package com.maggiver.elements

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maggiver.elements.ui.inputs_m3.InputsCustom
import com.maggiver.elements.ui.inputs_m3.InputsCustomOneline
import com.maggiver.elements.ui.inputs_m3.InputsDefault
import com.maggiver.elements.ui.login.coursera.LoginCoursera
import com.maggiver.elements.ui.login.coursera.NavigationCoursera
import com.maggiver.elements.ui.login.graphics_guruji_2.NavigationGraphicsWhite
import com.maggiver.elements.ui.rentalcar.NavigationRentalCarBlack
import com.maggiver.elements.ui.theme.ElementsTheme

class MainActivity : ComponentActivity() {


    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
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


                    NavigationRentalCarBlack()

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