package com.maggiver.elements.ui.rentalcar.screens.main.profile

import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Battery5Bar
import androidx.compose.material.icons.filled.LocalTaxi
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.maggiver.elements.R
import com.maggiver.elements.ui.theme.changePasswordColor
import com.maggiver.elements.ui.theme.chargingHistoryColor
import com.maggiver.elements.ui.theme.logoutColor
import com.maggiver.elements.ui.theme.myCarsColor
import com.maggiver.elements.ui.theme.notificationsColor
import com.maggiver.elements.ui.theme.profileInfoColor


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

@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen(navController = rememberNavController())
}

@Composable
fun ProfileScreen(navController: NavHostController) {

    val isDark = true
    val settingsTitles = arrayOf(
        "Mis Vehiculos", "Historial de Viajes",
        "Información de Perfil", "Configuración deNotificaciones", "Cambio de Clave", "Salir"
    )
    val settingsIcons = arrayOf(
        Icons.Default.LocalTaxi,
        Icons.Default.Battery5Bar,
        Icons.Default.Person,
        Icons.Default.Notifications,
        Icons.Default.Password,
        Icons.Default.Logout
    )
    val settingsColors = arrayOf(
        myCarsColor, chargingHistoryColor, profileInfoColor, notificationsColor,
        changePasswordColor, logoutColor
    )
    Scaffold(
        modifier = Modifier
            .background(Color(0xFFF5F5F5))
            .padding(bottom = 88.dp)
            .fillMaxSize(),
        topBar = {
            CommonAppBar(title = "Mi Perfil")
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .background(Color(0xFFF5F5F5))
                .fillMaxSize()
                .padding(padding),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.height(40.dp))
                    Image(
                        modifier = Modifier
                            .size(150.dp)
                            .clip(CircleShape)
                            .border(
                                width = 5.dp,
                                shape = CircleShape,
                                color = Color(0xFFE9EAF1)
                            ),
                        painter = painterResource(R.drawable.user_app),
                        contentDescription = "Profile Pic",
                        alignment = Alignment.TopCenter,
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(40.dp))
                    Text(
                        text = "John Marcus Allegria",
                        fontWeight = FontWeight.Bold,
                        fontSize = 28.sp,
                        color = Color.Black
                    )

                    Row(
                        modifier = Modifier
                            .padding(start = 16.dp, end = 16.dp, top = 16.dp)
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(24.dp))
                            .background(Color(0xFFD5D5D5))
                            .padding(start = 8.dp, end = 0.dp, top = 8.dp, bottom = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        /*ElevatedCard(
                            modifier = Modifier.size(72.dp),
                            shape = CircleShape,
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFF222222),
                                contentColor = Color.White  //Card content color,e.g.text
                            ),
                            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
                        ) {
                            Image(
                                painterResource(R.drawable.user_app),
                                contentDescription = "",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .border(1.dp, Color(0xFFB4B4B4), CircleShape),
                                alignment = Alignment.TopCenter,
                                contentScale = ContentScale.Crop
                            )
                        }*/

                        Column(
                            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                        ) {

                            Row(
                                modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
                            ) {
                                Card(
                                    shape = RoundedCornerShape(24.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color(0xFFACACAC),
                                        contentColor = Color(0xFFFFFFFF)  //Card content color,e.g.text
                                    ),
                                    border = BorderStroke(2.dp, Color(0xFF858585)),
                                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
                                ) {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth(1f)
                                            .padding(
                                                start = 24.dp,
                                                end = 24.dp,
                                                top = 6.dp,
                                                bottom = 6.dp
                                            ),
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        IconButton(
                                            onClick = { /*TODO*/ },
                                            modifier = Modifier
                                                .height(30.dp)
                                                .width(30.dp),
                                            colors = IconButtonDefaults.iconButtonColors(
                                                containerColor = Color.Transparent,
                                                contentColor = Color.Transparent,
                                                disabledContainerColor = Color(0xFFFFFFFF),
                                                disabledContentColor = Color(0xFF222222)
                                            )
                                        ) {
                                            Icon(
                                                painter = painterResource(id = R.drawable.perfil_menu_reservas),
                                                contentDescription = "Google",
                                                tint = Color(0xFF3F3F3F)
                                            )
                                        }

                                        IconButton(
                                            onClick = { /*TODO*/ },
                                            modifier = Modifier
                                                .height(30.dp)
                                                .width(30.dp),
                                            colors = IconButtonDefaults.iconButtonColors(
                                                containerColor = Color.Transparent,
                                                contentColor = Color.Transparent,
                                                disabledContainerColor = Color(0xFFFFFFFF),
                                                disabledContentColor = Color(0xFF222222)
                                            )
                                        ) {
                                            Icon(
                                                painter = painterResource(id = R.drawable.perfil_menu_agenda),
                                                contentDescription = "Google",
                                                tint = Color(0xFF3F3F3F)
                                            )
                                        }

                                        IconButton(
                                            onClick = { /*TODO*/ },
                                            modifier = Modifier
                                                .height(30.dp)
                                                .width(30.dp),
                                            colors = IconButtonDefaults.iconButtonColors(
                                                containerColor = Color.Transparent,
                                                contentColor = Color.Transparent,
                                                disabledContainerColor = Color(0xFFFFFFFF),
                                                disabledContentColor = Color(0xFF222222)
                                            )
                                        ) {
                                            Icon(
                                                painter = painterResource(id = R.drawable.perfil_menu_notificaciones),
                                                contentDescription = "Google",
                                                tint = Color(0xFF3F3F3F)
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }



                    Spacer(modifier = Modifier.height(40.dp))
                }
            }
            items(settingsTitles.size) { index ->
                val interactionSource = remember { MutableInteractionSource() }

                Row(
                    modifier = Modifier
                        .background(Color(0xFFF5F5F5))
                        .clickable(
                            onClick = {},
                            interactionSource = interactionSource,
                            indication = rememberRipple(
                                color = settingsColors[index]
                            )
                        )
                        .padding(horizontal = 20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .background(
                                color = settingsColors[index]
                                    .copy(alpha = if (isDark) 0.2f else 0.05f),
                                shape = CircleShape
                            )
                            .padding(10.dp)
                    ) {
                        Icon(
                            modifier = Modifier.align(Alignment.Center),
                            imageVector = settingsIcons[index],
                            tint = settingsColors[index],
                            contentDescription = settingsTitles[index]
                        )
                    }

                    Text(
                        text = settingsTitles[index],
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp),
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF000000),
                    )

                }

            }
        }
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CommonAppBar(title: String, actions: @Composable RowScope.() -> Unit = {}) {
    TopAppBar(
        modifier = Modifier
            .background(Color(0xFFF5F5F5))
            .statusBarsPadding(),
        title = {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = title,
                textAlign = TextAlign.Center,
                fontSize = 22.sp
            )
        },
        actions = actions,
        colors = TopAppBarColors(
            containerColor = Color(0xFF121529),
            scrolledContainerColor = Color.Black,
            navigationIconContentColor = Color.Black,
            titleContentColor = Color.White,
            actionIconContentColor = Color.Black
        )
    )
}