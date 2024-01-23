package com.maggiver.elements.ui.rentalcar.screens.main.home

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.StarBorder
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.maggiver.elements.ui.rentalcar.repo.DataUtils
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale


/**
 * Created by
 * @AUTHOR: Daniel Maggiver Acevedo
 * @NICK_NAME: mackgaru
 * @DATE: 19,diciembre,2023
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


@Preview()
@Composable
fun DetailRentalCarPreview() {
    DetailRentalCar(
        navController = rememberNavController(), typeDataSend = "", carCarouselPosition = 0
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DetailRentalCar(
    navController: NavHostController,
    typeDataSend: String,
    carCarouselPosition: Int
) {

    val dataCarCarousel = DataUtils.carCarouel[carCarouselPosition]
    val stateStart = rememberDatePickerState()
    val stateEnd = rememberDatePickerState()
    var showDialogStart by remember { mutableStateOf(false) }
    var showDialogEnd by remember { mutableStateOf(false) }
    var textLargeClicked = remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .padding(bottom = 0.dp)
            .background(Color(0xFF000000))
            .fillMaxSize()
            .verticalScroll(
                rememberScrollState()
            )
    ) {

        //Header - model - car
        Column(
            modifier = Modifier
                .clip(
                    shape = RoundedCornerShape(
                        topStart = 0.dp, topEnd = 0.dp, bottomStart = 32.dp, bottomEnd = 32.dp
                    )
                )
                .background(Color(0xFF181818))
                .padding(start = 16.dp, end = 16.dp, top = 8.dp)
        ) {

            Column(modifier = Modifier) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    IconButton(
                        onClick = { navController.popBackStack() },
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp),
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.Unspecified,
                            disabledContainerColor = Color(0xFFFFFFFF),
                            disabledContentColor = Color(0xFF222222)
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "back",
                            modifier = Modifier.fillMaxSize(),
                            tint = Color.White
                        )
                    }

                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp),
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.Unspecified,
                            disabledContainerColor = Color(0xFFFFFFFF),
                            disabledContentColor = Color(0xFF222222)
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Filled.StarBorder,
                            contentDescription = "back",
                            modifier = Modifier.fillMaxSize(),
                            tint = Color(0xFF38D900)
                        )
                    }

                }

                Row(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = dataCarCarousel.pathCarModel),
                        contentDescription = "",
                        modifier = Modifier
                            .height(120.dp),
                        alignment = Alignment.Center,
                        contentScale = ContentScale.Crop
                    )
                }
            }

            Text(
                text = dataCarCarousel.modelCar,
                modifier = Modifier,
                color = Color(0xFFE4E4E4),
                textAlign = TextAlign.Start,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            //disponibility
            Column(
                modifier = Modifier
                    .padding(top = 16.dp, bottom = 16.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(24.dp))
                    .background(Color(0xFF303030))
                    .padding(start = 20.dp, end = 20.dp, top = 16.dp, bottom = 20.dp)
            ) {

                Text(
                    text = "Disponibilidad",
                    modifier = Modifier,
                    color = Color(0xFFE4E4E4),
                    textAlign = TextAlign.Start,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp, top = 12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    //fecha start
                    Column(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(16.dp))
                            .background(Color(0xFFDBFF00)),
                    ) {

                        Row(
                            modifier = Modifier
                                .padding(1.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                                .background(Color(0xFF303030))
                                .padding(
                                    start = 2.dp,
                                    end = 14.dp,
                                    top = 4.dp,
                                    bottom = 4.dp
                                ),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            IconButton(
                                onClick = { /*TODO*/ },
                                modifier = Modifier.padding(0.dp),
                                colors = IconButtonDefaults.iconButtonColors(
                                    containerColor = Color.Transparent,
                                    contentColor = Color.Unspecified,
                                    disabledContainerColor = Color(0xFFFFFFFF),
                                    disabledContentColor = Color(0xFF222222)
                                )
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.CalendarMonth,
                                    contentDescription = "date",
                                    modifier = Modifier.padding(0.dp),
                                    tint = Color(0xFFB8C52B)
                                )
                            }

                            val zonedDateTimeFormat =
                                ZonedDateTime.of(LocalDateTime.now(), ZoneId.systemDefault())
                                    .format(
                                        DateTimeFormatter.ofPattern(
                                            "dd MMM",
                                            Locale.getDefault()
                                        )
                                    )
                            var extractDate =
                                zonedDateTimeFormat.substring(0, (zonedDateTimeFormat.length - 1))
                            var splitDate = extractDate.split(" ")


                            Text(
                                text = "${splitDate[0]} ${
                                    splitDate[1].replaceFirstChar {
                                        if (it.isLowerCase()) it.titlecase(
                                            Locale.ROOT
                                        ) else it.toString()
                                    }
                                }",
                                modifier = Modifier.clickable { showDialogStart = true },
                                color = Color(0xFFFFFFFF),
                                textAlign = TextAlign.Start,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )

                            if (showDialogStart) {
                                Surface(
                                    modifier = Modifier
                                        .background(Color(0xFFFF1515)),
                                ) {
                                    DatePickerDialog(
                                        onDismissRequest = { showDialogStart = false },
                                        confirmButton = {
                                            Button(onClick = { showDialogStart = false }) {
                                                Text(text = "Confirmar")
                                            }
                                        },
                                        dismissButton = {
                                            OutlinedButton(onClick = { showDialogStart = false }) {
                                                Text(text = "Cancelar")
                                            }
                                        }
                                    ) {
                                        DatePicker(state = stateStart)
                                    }
                                }
                            }

                            var dateSelected =
                                stateStart.selectedDateMillis?.let {
                                    Instant.ofEpochMilli(it).atZone(ZoneId.of("UTC")).toLocalDate()
                                }
                            if (dateSelected != null) {
                                var dateSeletedStart =
                                    "${dateSelected.dayOfMonth} ${dateSelected.monthValue} ${dateSelected.year}"
                                Log.i("dateSelected", "date selected :  ${dateSeletedStart}")
                            }

                        }
                    }


                    //fecha end
                    Column(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(16.dp))
                            .background(Color(0xFFDBFF00)),
                    ) {

                        Row(
                            modifier = Modifier
                                .padding(1.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                                .background(Color(0xFF303030))
                                .padding(
                                    start = 2.dp,
                                    end = 14.dp,
                                    top = 4.dp,
                                    bottom = 4.dp
                                ),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            IconButton(
                                onClick = { /*TODO*/ },
                                modifier = Modifier.padding(0.dp),
                                colors = IconButtonDefaults.iconButtonColors(
                                    containerColor = Color.Transparent,
                                    contentColor = Color.Unspecified,
                                    disabledContainerColor = Color(0xFFFFFFFF),
                                    disabledContentColor = Color(0xFF222222)
                                )
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.CalendarMonth,
                                    contentDescription = "date",
                                    modifier = Modifier.padding(0.dp),
                                    tint = Color(0xFFB8C52B)
                                )
                            }

                            val today = LocalDateTime.now(ZoneId.systemDefault())
                            val tomorrow = today.plusDays(1)

                            val zonedDateTimeFormat =
                                ZonedDateTime.of(tomorrow, ZoneId.systemDefault())
                                    .format(
                                        DateTimeFormatter.ofPattern(
                                            "dd MMM",
                                            Locale.getDefault()
                                        )
                                    )
                            var extractDate =
                                zonedDateTimeFormat.substring(0, (zonedDateTimeFormat.length - 1))
                            var splitDate = extractDate.split(" ")


                            Text(
                                text = "${splitDate[0]} ${
                                    splitDate[1].replaceFirstChar {
                                        if (it.isLowerCase()) it.titlecase(
                                            Locale.ROOT
                                        ) else it.toString()
                                    }
                                }",
                                modifier = Modifier.clickable { showDialogEnd = true },
                                color = Color(0xFFFFFFFF),
                                textAlign = TextAlign.Start,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )

                            if (showDialogEnd) {
                                Surface(
                                    modifier = Modifier
                                        .background(Color(0xFFFF1515)),
                                ) {
                                    DatePickerDialog(
                                        onDismissRequest = { showDialogEnd = false },
                                        confirmButton = {
                                            Button(onClick = { showDialogEnd = false }) {
                                                Text(text = "Confirmar")
                                            }
                                        },
                                        dismissButton = {
                                            OutlinedButton(onClick = { showDialogEnd = false }) {
                                                Text(text = "Cancelar")
                                            }
                                        }
                                    ) {
                                        DatePicker(state = stateEnd)
                                    }
                                }
                            }

                            var dateSelected =
                                stateEnd.selectedDateMillis?.let {
                                    Instant.ofEpochMilli(it).atZone(ZoneId.of("UTC")).toLocalDate()
                                }
                            if (dateSelected != null) {
                                var dateSeletedStart =
                                    "${dateSelected.dayOfMonth} ${dateSelected.monthValue} ${dateSelected.year}"
                                Log.i("dateSelected", "date selected :  ${dateSeletedStart}")
                            }

                        }
                    }

                }

            }

        }//END: Header - model - car

        //Content - description - actions
        Column(
            modifier = Modifier
                .padding(top = 16.dp, bottom = 16.dp)
                .clip(RoundedCornerShape(32.dp))
                .background(Color(0xFF303030))
            /*.constrainAs(description) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(availability.bottom)
                bottom.linkTo(parent.bottom)
                height = Dimension.fillToConstraints
                width = Dimension.fillToConstraints
            }*/
        ) {

            Column(
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp)
            ) {
                Text(
                    text = dataCarCarousel.hourlyRental,
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(0xFFFFFFFF),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.End,
                )

                Text(
                    text = "Descripción General",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 0.dp),
                    color = Color(0xFFE4E4E4),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Start,
                )

                Text(
                    text = dataCarCarousel.descriptionModel,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp)
                        .clickable {
                            textLargeClicked.value = !textLargeClicked.value
                        },
                    color = Color(0xFFE4E4E4),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Justify,
                    lineHeight = 1.em,
                    maxLines = if (textLargeClicked.value) Int.MAX_VALUE else 6,
                    softWrap = true,
                    overflow = TextOverflow.Ellipsis
                )

                Text(
                    text = "Características",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp),
                    color = Color(0xFFE4E4E4),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Start,
                )

                Row(
                    modifier = Modifier
                        .padding(top = 24.dp, bottom = 8.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        modifier = Modifier
                            .border(
                                1.dp,
                                Color(0xFFADADAD),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .weight(1f)
                            .padding(8.dp, 12.dp)
                    ) {
                        Text(
                            text = "Potencia",
                            modifier = Modifier.fillMaxWidth(),
                            color = Color(0xFFE4E4E4),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            softWrap = true,
                            overflow = TextOverflow.Ellipsis
                        )

                        Text(
                            text = "4.0 L VB",
                            modifier = Modifier.fillMaxWidth(),
                            color = Color(0xFFE4E4E4),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Center
                        )
                    }

                    Column(
                        modifier = Modifier
                            .padding(start = 12.dp, end = 12.dp)
                            .border(
                                1.dp,
                                Color(0xFFADADAD),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .weight(1f)
                            .padding(8.dp, 12.dp)
                    ) {
                        Text(
                            text = "Asientos",
                            modifier = Modifier.fillMaxWidth(),
                            color = Color(0xFFE4E4E4),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            softWrap = true,
                            overflow = TextOverflow.Ellipsis
                        )

                        Text(
                            text = "5",
                            modifier = Modifier.fillMaxWidth(),
                            color = Color(0xFFE4E4E4),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Center
                        )
                    }

                    Column(
                        modifier = Modifier
                            .border(
                                1.dp,
                                Color(0xFFADADAD),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .weight(1f)
                            .padding(8.dp, 12.dp)
                    ) {
                        Text(
                            text = "Cilindraje",
                            modifier = Modifier.fillMaxWidth(),
                            color = Color(0xFFE4E4E4),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            softWrap = true,
                            overflow = TextOverflow.Ellipsis
                        )

                        Text(
                            text = "8",
                            modifier = Modifier.fillMaxWidth(),
                            color = Color(0xFFE4E4E4),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Center
                        )
                    }
                }

                Row(
                    modifier = Modifier
                        .padding(top = 8.dp, bottom = 24.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        modifier = Modifier
                            .border(
                                1.dp,
                                Color(0xFFADADAD),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .weight(1f)
                            .padding(8.dp, 12.dp)
                    ) {
                        Text(
                            text = "Combustible",
                            modifier = Modifier.fillMaxWidth(),
                            color = Color(0xFFE4E4E4),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            softWrap = true,
                            overflow = TextOverflow.Ellipsis
                        )

                        Text(
                            text = "16G",
                            modifier = Modifier.fillMaxWidth(),
                            color = Color(0xFFE4E4E4),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Center
                        )
                    }

                    Column(
                        modifier = Modifier
                            .padding(start = 12.dp, end = 12.dp)
                            .border(
                                1.dp,
                                Color(0xFFADADAD),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .weight(1f)
                            .padding(8.dp, 12.dp)
                    ) {
                        Text(
                            text = "Caballos",
                            modifier = Modifier.fillMaxWidth(),
                            color = Color(0xFFE4E4E4),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            softWrap = true,
                            overflow = TextOverflow.Ellipsis
                        )

                        Text(
                            text = "58 KW",
                            modifier = Modifier.fillMaxWidth(),
                            color = Color(0xFFE4E4E4),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Center
                        )
                    }

                    Column(
                        modifier = Modifier
                            .border(
                                1.dp,
                                Color(0xFFADADAD),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .weight(1f)
                            .padding(8.dp, 12.dp)
                    ) {
                        Text(
                            text = "Vel Max",
                            modifier = Modifier.fillMaxWidth(),
                            color = Color(0xFFE4E4E4),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            softWrap = true,
                            overflow = TextOverflow.Ellipsis
                        )

                        Text(
                            text = "120 km/h",
                            modifier = Modifier.fillMaxWidth(),
                            color = Color(0xFFE4E4E4),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Center
                        )
                    }
                }

                Row(
                    modifier = Modifier
                        .padding(top = 24.dp, bottom = 24.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        onClick = { navController.navigate("ChatScreen") },
                        modifier = Modifier
                            .height(50.dp)
                            .weight(1f)
                            .padding(end = 8.dp),
                        colors = ButtonDefaults.elevatedButtonColors(//ButtonDefaults.buttonColors
                            containerColor = Color(0xFFD9D9D9),
                            contentColor = Color(0xFF000000),
                            disabledContainerColor = Color(0xFF747474),
                            disabledContentColor = Color(0xFF222222)
                        ),
                        shape = RoundedCornerShape(32.dp)
                    ) {
                        Text(
                            text = "Contactar",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                    }

                    Button(
                        onClick = { navController.navigate("PurchaseCar/$carCarouselPosition") },
                        modifier = Modifier
                            .padding(start = 8.dp)
                            .height(50.dp)
                            .weight(1f),
                        colors = ButtonDefaults.elevatedButtonColors(//ButtonDefaults.buttonColors
                            containerColor = Color(0xFF19E914),
                            contentColor = Color(0xFF000000),
                            disabledContainerColor = Color(0xFF747474),
                            disabledContentColor = Color(0xFF222222)
                        ),
                        shape = RoundedCornerShape(32.dp)
                    ) {
                        Text(
                            text = "¡Reservar!",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                    }
                }

            }
        }//END: Content - description - actions

    }

}