package com.maggiver.elements.ui.rentalcar

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.lerp
import androidx.navigation.NavHostController
import com.maggiver.elements.R
import com.maggiver.elements.ui.rentalcar.models.CarouselCar
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.absoluteValue


/**
 * Created by
 * @AUTHOR: Daniel Maggiver Acevedo
 * @NICK_NAME: mackgaru
 * @DATE: 08,diciembre,2023
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

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeRentalCar(navController: NavHostController) {

    val listCarsModel = remember {
        mutableStateOf(
            listOf(
                CarouselCar(
                    modelCar = "Mazda 3 Prime",
                    deliveryTime = "15 Min",
                    kmTraveled = "1.450 KM",
                    hourlyRental = "$49.900 / H",
                    pathCarModel = R.drawable.car1
                ),
                CarouselCar(
                    modelCar = "Renault Duster",
                    deliveryTime = "30 Min",
                    kmTraveled = "18.650 KM",
                    hourlyRental = "$25.000 / H",
                    pathCarModel = R.drawable.car2
                ),
                CarouselCar(
                    modelCar = "Chevrolet Tracker",
                    deliveryTime = "15 Min",
                    kmTraveled = "7.830 KM",
                    hourlyRental = "$45.000 / H",
                    pathCarModel = R.drawable.car3
                ),
                CarouselCar(
                    modelCar = "RAV4-Limited-4X4",
                    deliveryTime = "20 Min",
                    kmTraveled = "12.450 KM",
                    hourlyRental = "$69.900 / ",
                    pathCarModel = R.drawable.car4
                )
            )
        )
    }

    val pagerState = rememberPagerState(pageCount = { listCarsModel.value.size })
    val scrollState = rememberLazyListState()
    val scope = rememberCoroutineScope()
    val index by remember { mutableStateOf(0) }

    /*LaunchedEffect(key1 = true, block = {
        coroutineScope.launch {
            while (true) {
                delay(1000)
                if (index == images.size - 1) index = 0
                else index++
                scrollState.animateScrollToItem(index)
            }
        }
    })*/
    LaunchedEffect(Unit) {
        while (true) {
            delay(4000)
            val nextPage = (pagerState.currentPage + 1) % listCarsModel.value.size
            pagerState.animateScrollToPage(nextPage)
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1A1A1A)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 64.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentPadding = PaddingValues(horizontal = 0.dp),
            verticalAlignment = Alignment.Top,
            key = { listCarsModel.value[it].pathCarModel },
        ) { page ->

            Card(
                modifier = Modifier
                    .align(CenterHorizontally)
                    .padding(start = 0.dp, end = 0.dp)
                    .graphicsLayer {
                        val pageOffset = (
                                (pagerState.currentPage - page) + pagerState
                                    .currentPageOffsetFraction
                                ).absoluteValue
                        lerp(
                            start = 0.8f,
                            stop = 1f,
                            fraction = 1f - pageOffset.coerceIn(0f, 1f)
                        ).also { scale ->
                            scaleX = scale
                            scaleY = scale
                        }
                        alpha = lerp(
                            start = 0.3f,
                            stop = 1f,
                            fraction = 1f - pageOffset.coerceIn(0f, 1f)
                        )
                    },
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF000000),
                    contentColor = Color(0xFFFFFFFF)  //Card content color,e.g.text
                ),
                shape = RoundedCornerShape(24.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .height(200.dp)
                        .padding(start = 24.dp, end = 24.dp, top = 16.dp)
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.End
                    ) {
                        Image(
                            painter = painterResource(id = listCarsModel.value[page].pathCarModel),
                            contentDescription = null,
                            alignment = Alignment.CenterEnd,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.height(100.dp)
                        )
                    }

                    Column {
                        Text(
                            text = listCarsModel.value[page].modelCar,
                            modifier = Modifier,
                            textAlign = TextAlign.Start,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Row(
                            modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = listCarsModel.value[page].deliveryTime,
                                modifier = Modifier,
                                color = Color(0xFFA4A4A4),
                                textAlign = TextAlign.Start,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal
                            )

                            Text(
                                text = listCarsModel.value[page].kmTraveled,
                                modifier = Modifier,
                                color = Color(0xFFA4A4A4),
                                textAlign = TextAlign.Start,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal
                            )

                            Text(
                                text = listCarsModel.value[page].hourlyRental,
                                modifier = Modifier,
                                textAlign = TextAlign.Start,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }

                }
            }
        }


        Box(
            modifier = Modifier
                .padding(4.dp)
                .offset(y = (0).dp)
                .fillMaxWidth(0.8f)
                .height(32.dp)
                .clip(RoundedCornerShape(100))
                .padding(0.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                IconButton(
                    enabled = pagerState.currentPage > 0,
                    onClick = {
                        scope.launch {
                            pagerState.animateScrollToPage(pagerState.currentPage - 1)
                        }
                    }, modifier = Modifier
                        .padding(0.dp)
                        .weight(1f)
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = "Go back",
                        modifier = Modifier.size(32.dp),
                        tint = Color(0xFF01A738)
                    )
                }

                Row(
                    modifier = Modifier
                        .weight(3f),
                    horizontalArrangement = Arrangement.Center
                ) {
                    repeat(listCarsModel.value.size) { iteration ->
                        val colorCurrent =
                            if (pagerState.currentPage == iteration) Color.DarkGray else Color.LightGray
                        Box(
                            modifier = Modifier
                                .padding(6.dp)
                                .clip(CircleShape)
                                .size(16.dp)
                                .background(colorCurrent)
                                .clickable {
                                    scope.launch {
                                        pagerState.animateScrollToPage(iteration)
                                    }
                                }
                        )

                    }
                }


                IconButton(
                    enabled = pagerState.currentPage < listCarsModel.value.size - 1,
                    onClick = {
                        scope.launch {
                            pagerState.animateScrollToPage(pagerState.currentPage + 1)
                        }
                    }, modifier = Modifier
                        .padding(0.dp)
                        .weight(1f)
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight,
                        contentDescription = "Go forward",
                        modifier = Modifier.size(32.dp),
                        tint = Color(0xFF01A738)
                    )
                }

            }
        }
    }

}