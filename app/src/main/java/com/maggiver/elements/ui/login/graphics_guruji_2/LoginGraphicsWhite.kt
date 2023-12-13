package com.maggiver.elements.ui.login.graphics_guruji_2

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.maggiver.elements.R


/**
 * Created by
 * @AUTHOR: Daniel Maggiver Acevedo
 * @NICK_NAME: mackgaru
 * @DATE: 14,noviembre,2023
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
@Preview
@Composable
fun PreviewLoginGraphicsWhite(
    name: String = "custom textview",
    showBackground: Boolean = true,
    uiMode: Int = Configuration.UI_MODE_NIGHT_NO
) {
    LoginGraphicsWhite(navController = rememberNavController())

    /*MaterialTheme {
        Surface {
            TwoTexts(text1 = "Hi", text2 = "there")
        }
    }*/

}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LoginGraphicsWhite(navController: NavHostController) {

    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }

    ConstraintLayout {
        val (contentMain, footerMain) = createRefs()

        Column(
            modifier = Modifier
                .fillMaxHeight(0.93f)
                .padding(24.dp, 0.dp, 24.dp, 0.dp)
                .background(Color(0xFFFFFFFF))  //rojo_intenso: 0xFF2B0D4D  morado_elegante: 0xFF2B0D4D
                .constrainAs(contentMain) {
                    top.linkTo(parent.top)
                    bottom.linkTo(footerMain.top)
                    start.linkTo(contentMain.start)
                    end.linkTo(contentMain.end)
                }
        ) {

            //header
            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.logo_graphics_guruji_color),
                        contentDescription = "",
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp),
                        tint = Color.Unspecified
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {

                    //images rounded
                    /*Image(
                        painter = painterResource(id = R.drawable.model_login_man),
                        contentDescription = "",
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp)
                            .clip(CircleShape)
                            .border(3.dp, Color(0xFF8A8A8A), CircleShape),
                        alignment = Alignment.TopCenter,
                        contentScale = ContentScale.FillWidth
                    )

                    ElevatedCard(
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .height(100.dp)
                            .width(100.dp)
                            .border(3.dp, Color(0xFF8A8A8A), CircleShape),
                        shape = CircleShape,
                        elevation = CardDefaults.cardElevation(defaultElevation = 16.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.model_login_man),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            alignment = Alignment.TopCenter,
                            contentScale = ContentScale.FillWidth
                        )
                    }*/

                    ElevatedCard(
                        modifier = Modifier
                            .size(80.dp),
                        shape = CircleShape,
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFFFFFFF),
                            contentColor = Color.White  //Card content color,e.g.text
                        ),
                        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
                    ) {
                        Image(
                            painterResource(R.drawable.model_profile),
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxSize()
                                .border(3.dp, Color(0xFFD1D1D1), CircleShape),
                            alignment = Alignment.TopCenter,
                            contentScale = ContentScale.Crop
                        )
                    }

                }


                Text(
                    text = "Hello, Emma!",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 0.dp, 0.dp, 0.dp),
                    color = Color(0xFF382222),
                    textAlign = TextAlign.Center,
                    lineHeight = 20.sp,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )
            }

            //body form ::: 0xFF2B0D4D
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)

            ) {
                Text(
                    text = "Login",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(0xFF000000),
                    textAlign = TextAlign.Start,
                    lineHeight = 32.sp,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Medium
                )

                Text(
                    text = "Please login to your account",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(0x80000000),
                    textAlign = TextAlign.Start,
                    lineHeight = 14.sp,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal
                )

                Spacer(modifier = Modifier.height(32.dp))

                Text(
                    text = "Email",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(0xFFE70B89),
                    textAlign = TextAlign.Start,
                    lineHeight = 14.sp,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
                SmallTextFieldEmailOnlineGraphics(email, { email = it })

                Spacer(modifier = Modifier.height(32.dp))

                Text(
                    text = "Password",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(0xFFE70B89),
                    textAlign = TextAlign.Start,
                    lineHeight = 14.sp,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )

                SmallTextFieldPasswordGraphics(password, { password = it })

                //button gradient
                Column {
                    Spacer(modifier = Modifier.height(32.dp))

                    val horizontalGradientBrush = Brush.horizontalGradient(
                        colors = listOf(
                            Color(0xFF81248A),
                            Color(0xFFE70B89)
                        )
                    )

                    val verticalGradientBrush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xffF57F17),
                            Color(0xffFFEE58),
                            Color(0xffFFF9C4)
                        )
                    )

                    ElevatedCard(
                        shape = RoundedCornerShape(24.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Unspecified,
                            contentColor = Color.Transparent  //Card content color,e.g.text
                        ),
                        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(horizontalGradientBrush)
                                .border(
                                    1.dp, Color(0xFFFFFFFF),
                                    shape = RoundedCornerShape(24.dp)
                                )

                        ) {
                            Button(
                                onClick = { /*TODO*/ },
                                shape = RoundedCornerShape(16.dp),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp),
                                colors = ButtonDefaults.elevatedButtonColors(//ButtonDefaults.buttonColors
                                    containerColor = Color.Unspecified,
                                    contentColor = Color(0xFFFFFFFF),
                                    disabledContainerColor = Color.Transparent,
                                    disabledContentColor = Color.Transparent
                                )
                            ) {
                                Text(
                                    text = "LOGIN", fontSize = 18.sp,
                                    color = Color(0xFFFFFFFF),
                                    fontWeight = FontWeight.Medium,
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))
                }

                Row(
                    modifier = Modifier
                        .fillMaxHeight(0.1f)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.Top
                ) {
                    Row(
                        modifier = Modifier
                    ) {
                        Text(
                            text = "Not you?",
                            modifier = Modifier,
                            color = Color(0xFF000000),
                            textAlign = TextAlign.Start,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium
                        )

                        Text(
                            text = "Switch Account",
                            modifier = Modifier.padding(start = 4.dp),
                            color = Color(0xFFE70B89),
                            textAlign = TextAlign.End,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }

                    Column {
                        Text(
                            text = "Forgot Password?",
                            modifier = Modifier,
                            color = Color(0xE6E70B89),
                            textAlign = TextAlign.End,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }

                //or login with
                Column {

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "or login with",
                        modifier = Modifier.fillMaxWidth(),
                        color = Color(0xFF9D9D9D),
                        textAlign = TextAlign.Center,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    )

                    Spacer(modifier = Modifier.height(16.dp))
                }

                //icons redes sociales
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {

                    ElevatedCard(
                        modifier = Modifier
                            .padding(8.dp, 0.dp, 8.dp, 0.dp)
                            .height(50.dp)
                            .width(50.dp),
                        shape = RoundedCornerShape(50.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFFFFFFF),
                            contentColor = Color.White  //Card content color,e.g.text
                        ),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 4.dp
                        )
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
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
                                    painter = painterResource(id = R.drawable.logo_svg_small_google_240),
                                    contentDescription = "Google",
                                    tint = Color.Unspecified
                                )
                            }
                        }
                    }

                    ElevatedCard(
                        modifier = Modifier
                            .padding(8.dp, 0.dp, 8.dp, 0.dp)
                            .height(50.dp)
                            .width(50.dp),
                        shape = RoundedCornerShape(50.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFFFFFFF),
                            contentColor = Color.White  //Card content color,e.g.text
                        ),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 4.dp
                        )
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
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
                                    imageVector = ImageVector.vectorResource(R.drawable.logo_svg_small_facebook_240),
                                    contentDescription = "Sign Up finger print",
                                    tint = Color.Unspecified
                                )
                            }
                        }
                    }

                    ElevatedCard(
                        modifier = Modifier
                            .padding(8.dp, 0.dp, 8.dp, 0.dp)
                            .height(50.dp)
                            .width(50.dp),
                        shape = RoundedCornerShape(50.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFFFFFFF),
                            contentColor = Color.White  //Card content color,e.g.text
                        ),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 4.dp
                        )
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            IconButton(
                                onClick = { /*TODO*/ },
                                modifier = Modifier
                                    .height(30.dp)
                                    .width(30.dp),
                                colors = IconButtonDefaults.iconButtonColors(
                                    containerColor = Color.Transparent,
                                    contentColor = Color.Transparent,
                                    disabledContainerColor = Color.Transparent,
                                    disabledContentColor = Color.Transparent
                                )
                            ) {
                                Icon(
                                    imageVector = ImageVector.vectorResource(R.drawable.logo_svg_small_twitter_240),
                                    contentDescription = "Sign Up finger print",
                                    tint = Color.Unspecified
                                )
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            //text resgister now
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Center
            ) {

                Text(
                    text = "Don't have an account?",
                    modifier = Modifier,
                    color = Color(0xFF000000),
                    textAlign = TextAlign.End,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = "Register now",
                    modifier = Modifier.padding(start = 8.dp),
                    color = Color(0xFFE70B89),
                    textAlign = TextAlign.End,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    textDecoration = TextDecoration.Underline
                )
            }

        }//contentMain

        //footerMain
        Column(
            modifier = Modifier
                .fillMaxHeight(0.7f)
                .fillMaxWidth()
                .padding(top = 0.dp)
                .background(Color(0xFFFFFFFF))
                .constrainAs(footerMain) {
                    top.linkTo(footerMain.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(footerMain.start)
                    end.linkTo(footerMain.end)
                }
                .padding(top = 0.dp, bottom = 8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center

            ) {
                Text(
                    text = "By signing up, your are agree with out",
                    modifier = Modifier,
                    color = Color(0xFF000000),
                    textAlign = TextAlign.End,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal
                )
                Text(
                    text = "Terms & Conditions",
                    modifier = Modifier.padding(start = 8.dp),
                    color = Color(0xFFE70B89),
                    textAlign = TextAlign.End,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    textDecoration = TextDecoration.Underline
                )
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SmallTextFieldEmailOnlineGraphics(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .background(Color(0xFFFFFFFF))
) {

    val interactionSource = remember { MutableInteractionSource() }
    val enabled = true
    val singleLine = true
    val colors = OutlinedTextFieldDefaults.colors(
        focusedBorderColor = Color.Black,
        unfocusedBorderColor = Color.Black,
    )
    var keyBoardOptionsEmail = KeyboardOptions(keyboardType = KeyboardType.Email)

    BasicTextField(
        value = value,
        onValueChange = { onValueChange(it) },
        modifier = modifier
            .fillMaxWidth()
            .height(25.dp),
        interactionSource = interactionSource,
        enabled = enabled,
        keyboardOptions = keyBoardOptionsEmail,
        textStyle = MaterialTheme.typography.bodyLarge,
        singleLine = singleLine,
        cursorBrush = SolidColor(Color.Black),
        decorationBox = { innerTextField ->
            TextFieldDefaults.DecorationBox(
                value = value,
                innerTextField = {
                    /*Box(modifier = Modifier) {
                        if (value.isEmpty()) {
                            Text(
                                text = "Tu Email",
                                color = LocalContentColor.current.copy(alpha = 0.6f)
                            )
                        }
                    }*/
                    innerTextField()
                },
                enabled = enabled,
                singleLine = singleLine,
                visualTransformation = VisualTransformation.None,
                interactionSource = interactionSource,
                placeholder = {
                    Text(
                        text = "",
                        color = LocalContentColor.current.copy(alpha = 0.6f)
                    )
                },
                colors = colors,
                contentPadding = TextFieldDefaults.contentPaddingWithoutLabel(
                    start = 0.dp,
                    end = 8.dp,
                    top = 0.dp,
                    bottom = 0.dp
                ),
                container = {
                    TextFieldDefaults.ContainerBox(
                        enabled = enabled,
                        isError = false,
                        interactionSource = interactionSource,
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color.Black,
                            unfocusedBorderColor = Color(0x4D000000)
                        ),
                        shape = RoundedCornerShape(16.dp) //OutlinedTextFieldDefaults.shape
                    )
                }
            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SmallTextFieldPasswordGraphics(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .background(Color(0xFFFFFFFF))
) {

    val interactionSource = remember { MutableInteractionSource() }
    val enabled = true
    val singleLine = true
    val colors = OutlinedTextFieldDefaults.colors(
        focusedBorderColor = Color.Black,
        unfocusedBorderColor = Color.Black,
    )
    var expanded by remember { mutableStateOf(false) }
    var keyBoardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)

    BasicTextField(
        value = value,
        onValueChange = { onValueChange(it) },
        modifier = modifier
            .fillMaxWidth()
            .height(25.dp),
        interactionSource = interactionSource,
        enabled = enabled,
        textStyle = MaterialTheme.typography.bodyLarge,
        keyboardOptions = keyBoardOptions,
        visualTransformation = if (expanded) VisualTransformation.None else PasswordVisualTransformation(),
        singleLine = singleLine,
        cursorBrush = SolidColor(Color.Black)
    ) { innerTextField ->
        OutlinedTextFieldDefaults.DecorationBox(
            value = value,
            innerTextField = {
                innerTextField()
            },
            enabled = enabled,
            singleLine = singleLine,
            /*label = { Text(text = "") },*/
            /*trailingIcon = {
                var image = if (expanded) Icons.Filled.KeyOff
                else Icons.Filled.Key

                var description =
                    if (expanded) "Hide password" else "Show password"

                IconButton(
                    onClick = {
                        expanded = !expanded
                    }
                ) {
                    Icon(imageVector = image, contentDescription = description)
                }
            },*/
            visualTransformation = if (expanded) VisualTransformation.None else PasswordVisualTransformation(),
            interactionSource = interactionSource,
            placeholder = {
                Text(
                    text = "",
                    color = LocalContentColor.current.copy(alpha = 0.6f)
                )
            },
            colors = colors,
            contentPadding = TextFieldDefaults.contentPaddingWithoutLabel(
                start = 0.dp,
                end = 8.dp,
                top = 0.dp,
                bottom = 0.dp
            ),
            container = {
                TextFieldDefaults.ContainerBox(
                    enabled = enabled,
                    isError = false,
                    interactionSource = interactionSource,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Black,
                        unfocusedBorderColor = Color(0x4D000000),
                    ),
                    shape = MaterialTheme.shapes.large
                )
            }
        )
    }
}


@Composable
fun TwoTexts(modifier: Modifier = Modifier, text1: String, text2: String) {
    Row(
        modifier = modifier.height(IntrinsicSize.Min),
    ) {
        Text(
            modifier = Modifier
                .weight(1f)
                .padding(start = 4.dp)
                .wrapContentWidth(Alignment.Start),
            text = text1
        )
        Divider(
            color = Color.Black,
            modifier = Modifier.fillMaxHeight().width(1.dp)
        )
        Text(
            modifier = Modifier
                .weight(1f)
                .padding(end = 4.dp)
                .wrapContentWidth(Alignment.End),

            text = text2
        )
    }
}

// @Preview
@Composable
fun TwoTextsPreview() {
    MaterialTheme {
        Surface {
            TwoTexts(text1 = "Hi", text2 = "there")
        }
    }
}