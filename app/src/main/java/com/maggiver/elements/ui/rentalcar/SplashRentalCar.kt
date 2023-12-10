package com.maggiver.elements.ui.rentalcar

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import com.maggiver.elements.R


/**
 * Created by
 * @AUTHOR: Daniel Maggiver Acevedo
 * @NICK_NAME: mackgaru
 * @DATE: 07,diciembre,2023
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
fun SplashRentalCar(navController: NavHostController) {

        Image(
            painter = painterResource(id = R.drawable.portada_1200_app_recorte),
            contentDescription = "",
            modifier = Modifier
                .fillMaxHeight(1f)
                .fillMaxWidth(),
            alignment = Alignment.TopStart,
            contentScale = ContentScale.Crop
        )


    ConstraintLayout {
        val (header, footer) = createRefs()

        Column(
            modifier = Modifier
                .fillMaxHeight(0.85f)
                .constrainAs(header) {
               top.linkTo(parent.top)
               bottom.linkTo(footer.top)
               start.linkTo(header.start)
               end.linkTo(header.end)
            }
        ) {
            Spacer(modifier = Modifier.height(72.dp))

            Text(
                text = "Rental Car",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 0.dp, 0.dp, 0.dp),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
                lineHeight = 20.sp,
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(48.dp))

            Text(
                text = "Encuentra tu auto ideal a buen precio",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 0.dp, 0.dp, 0.dp),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
                lineHeight = 18.sp,
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal
            )
        }

        Column(
            modifier = Modifier
                .fillMaxHeight(0.15f)
                .fillMaxWidth()
                .constrainAs(footer) {
                top.linkTo(header.bottom)
                bottom.linkTo(parent.bottom)
                start.linkTo(footer.start)
                end.linkTo(footer.end)
            },
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Button(
                onClick = { navController.navigate("HomeRentalCar") },
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .height(50.dp),
                colors = ButtonDefaults.elevatedButtonColors(//ButtonDefaults.buttonColors
                    containerColor = Color(0xFFFFFFFF),
                    contentColor = Color(0xFFFFFFFF),
                    disabledContainerColor = Color.Transparent,
                    disabledContentColor = Color.Transparent
                )
            ) {

                Text(
                    text = "Empezar",
                    fontSize = 18.sp,
                    color = Color(0xFF000000),
                    fontWeight = FontWeight.Bold,
                )

                Icon(
                    imageVector = Icons.Filled.ArrowForward,
                    contentDescription = "Iniciar sesion con Google",
                    modifier = Modifier
                        .padding(16.dp, 0.dp, 16.dp, 0.dp)
                        .size(32.dp),
                    tint = Color.Unspecified
                )
            }

        }

    }

}