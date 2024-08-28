package com.maggiver.elements.ui.rentalcar.screens.main.carShopping

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.MapsHomeWork
import androidx.compose.material.icons.filled.Payment
import androidx.compose.material.icons.filled.Person2
import androidx.compose.material.icons.filled.PhoneInTalk
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.maggiver.elements.R
import com.maggiver.elements.ui.rentalcar.repo.DataUtils


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

@Composable
fun CarScreen(navController: NavHostController) {

    var carCarouselPosition = 1
    val dataCarCarousel = DataUtils.carCarouel[carCarouselPosition]
    var statusAlertDialog by remember { mutableStateOf(false) }
    var statusDialog by remember { mutableStateOf(false) }
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .padding(bottom = 64.dp)
            .background(Color(0xFF1A1A1A))
            .fillMaxSize()
            .verticalScroll(
                rememberScrollState()
            )
    ) {

        //header purchase
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
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

                Text(
                    text = "Checkout",
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .fillMaxWidth(),
                    color = Color(0xFFE4E4E4),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Start,
                )


            }
        }


        //detail purchase
        Column(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 8.dp)
                .clip(shape = RoundedCornerShape(16.dp))
                .background(Color(0xFF000000))
        ) {

            Row(
                modifier = Modifier.padding(end = 16.dp, top = 16.dp, bottom = 16.dp),
            ) {

                //left
                Column(
                    modifier = Modifier
                ) {

                    Column {

                        Row(
                            modifier = Modifier,
                        ) {

                            IconButton(
                                onClick = { /*TODO*/ },
                                modifier = Modifier
                                    .padding(top = 30.dp)
                                    .height(150.dp)
                                    .offset(x = (-10).dp),
                                colors = IconButtonDefaults.iconButtonColors(
                                    containerColor = Color.Transparent,
                                    contentColor = Color.Unspecified,
                                    disabledContainerColor = Color(0xFFFFFFFF),
                                    disabledContentColor = Color(0xFF222222)
                                )
                            ) {
                                Icon(
                                    imageVector = ImageVector.vectorResource(id = R.drawable.arrowpoints),
                                    contentDescription = "arrowpoints",
                                    modifier = Modifier.fillMaxSize(),
                                    tint = Color(0xFF38D900)
                                )
                            }

                            Column(modifier = Modifier.offset(x = (-8).dp)) {

                                //modelo car
                                Column {
                                    Text(
                                        text = "Modelo",
                                        modifier = Modifier,
                                        color = Color(0xFFB4B4B4),
                                        textAlign = TextAlign.Start,
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Normal
                                    )

                                    Text(
                                        text = dataCarCarousel.modelCar,
                                        modifier = Modifier,
                                        color = Color(0xFFE4E4E4),
                                        textAlign = TextAlign.Start,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }

                                //tiempo alquiler
                                Column(
                                    modifier = Modifier.padding(top = 20.dp)
                                ) {
                                    Text(
                                        text = "Tiempo de Alquiler",
                                        modifier = Modifier,
                                        color = Color(0xFFB4B4B4),
                                        textAlign = TextAlign.Start,
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Normal
                                    )

                                    Text(
                                        text = "$1.200.000",
                                        modifier = Modifier,
                                        color = Color(0xFFE4E4E4),
                                        textAlign = TextAlign.Start,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }

                                //entrega
                                Row(
                                    modifier = Modifier.padding(top = 20.dp)
                                ) {
                                    Column {
                                        Text(
                                            text = "Entrega",
                                            modifier = Modifier,
                                            color = Color(0xFFB4B4B4),
                                            textAlign = TextAlign.Start,
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Normal
                                        )

                                        Text(
                                            text = "23 Dic 2023",
                                            modifier = Modifier,
                                            color = Color(0xFFE4E4E4),
                                            textAlign = TextAlign.Start,
                                            fontSize = 20.sp,
                                            fontWeight = FontWeight.Bold
                                        )

                                        Text(
                                            text = "7:00 AM",
                                            color = Color(0xFFE4E4E4),
                                            textAlign = TextAlign.Start,
                                            fontSize = 20.sp,
                                            style = TextStyle(
                                                fontStyle = FontStyle.Italic
                                            )
                                        )
                                    }
                                }

                            }
                        }
                    }
                }

                //right: imagen car
                Column(
                    modifier = Modifier.fillMaxHeight(1f),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(
                        painter = painterResource(id = dataCarCarousel.pathCarModel),
                        contentDescription = "",
                        modifier = Modifier.height(50.dp),
                        alignment = Alignment.Center,
                        contentScale = ContentScale.Crop
                    )

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 77.dp)
                    ) {
                        Text(
                            text = "Devolucion",
                            modifier = Modifier,
                            color = Color(0xFFB4B4B4),
                            textAlign = TextAlign.Start,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal
                        )

                        Text(
                            text = "25 Dic 2023",
                            modifier = Modifier,
                            color = Color(0xFFE4E4E4),
                            textAlign = TextAlign.Start,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "7:00 AM",
                            color = Color(0xFFE4E4E4),
                            textAlign = TextAlign.Start,
                            fontSize = 20.sp,
                            style = TextStyle(
                                fontStyle = FontStyle.Italic
                            )
                        )
                    }
                }
            }
        }


        //payments methods
        Column(
            modifier = Modifier
                .padding(16.dp)
                .clip(shape = RoundedCornerShape(16.dp))
                .background(Color(0xFF000000))
                .padding(16.dp)
        ) {

            //data-client
            Column(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
                    .fillMaxWidth(), horizontalAlignment = Alignment.Start
            ) {

                Row(
                    modifier = Modifier, horizontalArrangement = Arrangement.Center
                ) {

                    Icon(
                        imageVector = Icons.Filled.Person2,
                        contentDescription = "arrowpoints",
                        modifier = Modifier
                            .padding(0.dp)
                            .size(30.dp),
                        tint = Color(0xFF38D900)
                    )

                    Text(
                        text = "Macrus Allegría",
                        modifier = Modifier.padding(start = 16.dp),
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Start,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal
                    )
                }

                Row(
                    modifier = Modifier.padding(top = 16.dp),
                    horizontalArrangement = Arrangement.Center
                ) {

                    Icon(
                        imageVector = Icons.Filled.PhoneInTalk,
                        contentDescription = "arrowpoints",
                        modifier = Modifier
                            .padding(0.dp)
                            .size(30.dp),
                        tint = Color(0xFF38D900)
                    )

                    Text(
                        text = "322 - 349 - 9808",
                        modifier = Modifier.padding(start = 16.dp),
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Start,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal
                    )
                }

                Row(
                    modifier = Modifier.padding(top = 16.dp),
                    horizontalArrangement = Arrangement.Center
                ) {

                    Icon(
                        imageVector = Icons.Filled.MapsHomeWork,
                        contentDescription = "arrowpoints",
                        modifier = Modifier
                            .padding(0.dp)
                            .size(30.dp),
                        tint = Color(0xFF38D900)
                    )

                    Text(
                        text = "Esmeralda Cll 11#12-14",
                        modifier = Modifier.padding(start = 16.dp),
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Start,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal
                    )
                }

            }

            //options
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp, 16.dp),
                horizontalArrangement = Arrangement.SpaceAround,
            ) {

                //efectivo
                Column(
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                        .background(Color(0xFFDBFF00))
                ) {

                    Column(
                        modifier = Modifier
                            .width(110.dp)
                            .height(67.dp)
                            .padding(1.dp)
                            .clip(shape = RoundedCornerShape(16.dp))
                            .background(Color(0xFF303030))
                            .clickable {
                                statusAlertDialog = true
                            },
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        IconButton(
                            onClick = { /*TODO*/ },
                            modifier = Modifier.padding(top = 0.dp),
                            colors = IconButtonDefaults.iconButtonColors(
                                containerColor = Color.Transparent,
                                contentColor = Color.Unspecified,
                                disabledContainerColor = Color(0xFFFFFFFF),
                                disabledContentColor = Color(0xFF222222)
                            )
                        ) {
                            Icon(
                                imageVector = Icons.Filled.AttachMoney,
                                contentDescription = "date",
                                modifier = Modifier
                                    .size(30.dp)
                                    .offset(y = (-4).dp),
                                tint = Color(0xFFB8C52B)
                            )
                        }

                        Text(
                            text = "Efectivo",
                            modifier = Modifier.offset(y = (-12).dp),
                            color = Color(0xFFB4B4B4),
                            textAlign = TextAlign.Start,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }


                //transfer
                Column(
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                        .background(Color(0xFFDBFF00))
                ) {

                    Column(
                        modifier = Modifier
                            .width(110.dp)
                            .height(67.dp)
                            .padding(1.dp)
                            .clip(shape = RoundedCornerShape(16.dp))
                            .background(Color(0xFF303030))
                            .clickable {
                                statusDialog = true
                            }, horizontalAlignment = Alignment.CenterHorizontally
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
                                imageVector = Icons.Filled.Payment,
                                contentDescription = "date",
                                modifier = Modifier
                                    .size(30.dp)
                                    .offset(y = (-4).dp),
                                tint = Color(0xFFB8C52B)
                            )
                        }

                        Text(
                            text = "Tarjeta",
                            modifier = Modifier.offset(y = (-12).dp),
                            color = Color(0xFFB4B4B4),
                            textAlign = TextAlign.Start,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )

                    }
                }

            }

        }

        //footoer
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(24.dp))
                .background(Color(0xFF000000))
                .padding(24.dp, 24.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = "Arrendamiento",
                    modifier = Modifier,
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Start,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal
                )

                Text(
                    text = "$1.200.000",
                    modifier = Modifier,
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Start,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = "Deposito Seguro",
                    modifier = Modifier,
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Start,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal
                )

                Text(
                    text = "$78.000",
                    modifier = Modifier,
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Start,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Box(
                modifier = Modifier
                    .padding(top = 24.dp)
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(color = Color.White)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = "Total",
                    modifier = Modifier,
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Start,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal
                )

                Text(
                    text = "$1.278.000",
                    modifier = Modifier,
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Start,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Box(
                modifier = Modifier
                    .padding(top = 24.dp)
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(color = Color.White)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp, bottom = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Button(
                    onClick = { navController.navigate("PurchaseCar/$carCarouselPosition") },
                    modifier = Modifier.fillMaxWidth().height(58.dp),
                    colors = ButtonDefaults.elevatedButtonColors(//ButtonDefaults.buttonColors
                        containerColor = Color(0xFFDBFF00),
                        contentColor = Color(0xFF000000),
                        disabledContainerColor = Color(0xFF747474),
                        disabledContentColor = Color(0xFF222222)
                    ),
                    shape = RoundedCornerShape(24.dp)
                ) {
                    Text(
                        text = "Pagar",
                        modifier = Modifier.padding(16.dp, 8.dp),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

        }
    }


    ShowAlertDialog(
        statusAlertDialog,
        onDismissRequest = { statusAlertDialog = true },
        confirmButton = {
            Button(
                onClick = {
                    statusAlertDialog = false
                    Toast.makeText(
                        context,
                        "Medio de Pago seleccionado Efectivo",
                        Toast.LENGTH_LONG
                    ).show()

                },
                modifier = Modifier.height(50.dp)
            ) {
                Text(text = "Aceptar")
            }
        },
        dismissButton = {
            Button(
                onClick = { statusAlertDialog = false },
                modifier = Modifier.height(50.dp)
            ) {
                Text(text = "Cancelar")
            }
        }
    )

    ShowDialogTransfer(
        statusDialog,
        onDismissRequestTransfer = { statusDialog = false },
        onConfirmationTransfer = {
            statusDialog = false
            Toast.makeText(
                context,
                "Tarjeta agregada con Éxito",
                Toast.LENGTH_LONG
            ).show()
        }
    )

}
