package com.maggiver.elements.ui.login.coursera

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.Fingerprint
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
fun PreviewRegisterCoursera() {
    RegisterCoursera(navController = rememberNavController())
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun RegisterCoursera(navController: NavHostController) {

    var emailAddress by rememberSaveable { mutableStateOf("") }
    var phoneNumber by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(24.dp, 24.dp)
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
    ) {

        Column {

            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Filled.ArrowBackIos,
                    contentDescription = "Go to back",
                    modifier = Modifier.clickable {navController.popBackStack()}
                        .height(24.dp)
                        .width(24.dp)
                    ,tint = Color(0xFF000000)
                )

                Text(
                    text = "Sign In",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp, 0.dp, 0.dp, 0.dp),
                    color = Color(0xFF000000),
                    textAlign = TextAlign.Start,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }

        Column {
            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Welcome Back!",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Start,
                fontSize = 22.sp,
                fontWeight = FontWeight.ExtraBold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Sign In to continue your account",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp),
                color = Color(0xFF7A7A7A),
                textAlign = TextAlign.Start,
                lineHeight = 16.sp,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal
            )
        }

        Column {
            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "Email Address",
                modifier = Modifier.fillMaxWidth(),
                color = Color(0xFF7A7A7A),
                textAlign = TextAlign.Start,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(10.dp))

            TextFieldEmailSignUpCoursera(value = emailAddress,
                onValueChange = { emailAddress = it })
        }

        Column {
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Phone Number",
                modifier = Modifier.fillMaxWidth(),
                color = Color(0xFF7A7A7A),
                textAlign = TextAlign.Start,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(10.dp))

            TextFieldPhoneNumberSignUpCoursera(value = phoneNumber,
                onValueChange = { phoneNumber = it })
        }

        Column {
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Password",
                modifier = Modifier.fillMaxWidth(),
                color = Color(0xFF7A7A7A),
                textAlign = TextAlign.Start,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(10.dp))

            TextFieldPasswordSignUpCoursera(value = password, onValueChange = { password = it })

            Spacer(modifier = Modifier.height(12.dp))
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFFFFFF)),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start
        ) {

            Text(
                text = "Forgot Password?",
                modifier = Modifier,
                color = Color(0xFF7A7A7A),
                textAlign = TextAlign.End,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )
            Text(
                text = "Reset here",
                modifier = Modifier.padding(start = 8.dp),
                color = Color(0xFFE7A436),
                textAlign = TextAlign.End,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                textDecoration = TextDecoration.Underline
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row {

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .weight(3.5f)
                    .height(40.dp),
                colors = ButtonDefaults.elevatedButtonColors(//ButtonDefaults.buttonColors
                    containerColor = Color(0xFF8A5AA0),
                    contentColor = Color(0xFFFFFFFF),
                    disabledContainerColor = Color(0xFF747474),
                    disabledContentColor = Color(0xFF222222)
                ),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Sign Up", fontSize = 16.sp
                )
            }

            Spacer(modifier = Modifier.weight(0.2f))

            Box(
                modifier = Modifier
                    .height(40.dp)
                    .weight(0.8f)
                    .clip(RoundedCornerShape(6.dp))
                    .background(Color(0xFFF2F2F2))
                    .padding(4.dp),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Filled.Fingerprint,
                    contentDescription = "Sign Up finger print",
                    tint = Color(0xFF8D8D8D)
                )
            }

            /*IconButton(
                onClick = { *//*TODO*//* },
                modifier = Modifier
                    .weight(1.0f)
                    .height(40.dp)
                    .clip(RoundedCornerShape(1.dp)),
                colors = IconButtonDefaults.iconButtonColors(
                    containerColor = Color(0xFFF2F2F2),
                    contentColor = Color(0xFFFFFFFF),
                    disabledContainerColor = Color(0xFF747474),
                    disabledContentColor = Color(0xFF222222)
                )
            ) {
                Icon(imageVector = Icons.Filled.Email, contentDescription = "Sign Up finger print",
                    tint = Color(0xFF8D8D8D))
            }*/

        }

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = "Or Sign in with",
                modifier = Modifier
                    .weight(1.5f)
                    .background(Color(0xFFFFFFFF)),
                color = Color(0xFF7A7A7A),
                textAlign = TextAlign.Start,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium

            )

            Icon(
                painter = painterResource(id = R.drawable.logo_svg_small_google_240),
                contentDescription = "Sign Up with Google",
                modifier = Modifier
                    .padding(0.dp, 0.dp, 16.dp, 0.dp)
                    .size(27.dp),
                tint = Color.Unspecified
            )

            Icon(
                painter = painterResource(id = R.drawable.logo_svg_small_facebook_240),
                contentDescription = "Sign Up with Facebook",
                modifier = Modifier
                    .padding(0.dp, 0.dp, 0.dp, 0.dp)
                    .size(27.dp),
                tint = Color.Unspecified
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Divider(
                color = Color(0xFFE0E0E0),
                modifier = Modifier.weight(0.43f)
            )

            Text(
                text = "Don't have an account?",
                modifier = Modifier
                    .weight(1.5f)
                    .background(Color(0xFFFFFFFF)),
                color = Color(0xFF7A7A7A),
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium

            )

            Divider(
                color = Color(0xFFE0E0E0),
                modifier = Modifier.weight(0.43f)
            )
        }

        Column {
            Spacer(modifier = Modifier.height(24.dp))

            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                ,border = BorderStroke(1.dp, Color(0xFF8A5AA0)),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Register",
                    fontSize = 16.sp
                )
            }
        }


    }// Column Main

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldEmailSignUpCoursera(
    value: String, onValueChange: (String) -> Unit, modifier: Modifier = Modifier.fillMaxWidth()
) {
    // parameters below will be passed to BasicTextField for correct behavior of the text field,
    // and to the decoration box for proper styling and sizing
    val interactionSource = remember { MutableInteractionSource() }
    val enabled = true
    val singleLine = true
    val colors = OutlinedTextFieldDefaults.colors(
        focusedBorderColor = Color.Black,
        unfocusedBorderColor = Color.Black,
    )
    var keyBoardOptionEmail = KeyboardOptions(keyboardType = KeyboardType.Email)

    BasicTextField(
        value = value,
        onValueChange = { onValueChange(it) },
        modifier = modifier
            .fillMaxWidth()
            .height(40.dp),
        // internal implementation of the BasicTextField will dispatch focus events
        interactionSource = interactionSource,
        enabled = enabled,
        keyboardOptions = keyBoardOptionEmail,
        textStyle = MaterialTheme.typography.bodyLarge,
        singleLine = singleLine,
        cursorBrush = SolidColor(Color.Black)
    ) { innerTextField ->

        OutlinedTextFieldDefaults.DecorationBox(value = value,
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
                    text = "example@gmail.com", color = LocalContentColor.current.copy(alpha = 0.6f)
                )
            },
            colors = colors,
            contentPadding = TextFieldDefaults.contentPaddingWithoutLabel(
                start = 16.dp, end = 8.dp, top = 0.dp, bottom = 0.dp
            ),
            // update border thickness and shape
            container = {
                OutlinedTextFieldDefaults.ContainerBox(
                    enabled = enabled,
                    isError = false,
                    interactionSource = interactionSource,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFF4B47A0),
                        unfocusedBorderColor = Color(0xFF000000)
                    ),
                    shape = RoundedCornerShape(8.dp) //OutlinedTextFieldDefaults.shape
                )
            })

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldPhoneNumberSignUpCoursera(
    value: String, onValueChange: (String) -> Unit, modifier: Modifier = Modifier.fillMaxWidth()
) {
    // parameters below will be passed to BasicTextField for correct behavior of the text field,
    // and to the decoration box for proper styling and sizing
    val interactionSource = remember { MutableInteractionSource() }
    val enabled = true
    val singleLine = true
    val colors = OutlinedTextFieldDefaults.colors(
        focusedBorderColor = Color.Black,
        unfocusedBorderColor = Color.Black,
    )
    var keyBoardOptionNumber = KeyboardOptions(keyboardType = KeyboardType.Number)

    BasicTextField(
        value = value,
        onValueChange = { onValueChange(it) },
        modifier = modifier
            .fillMaxWidth()
            .height(40.dp),
        // internal implementation of the BasicTextField will dispatch focus events
        interactionSource = interactionSource,
        enabled = enabled,
        keyboardOptions = keyBoardOptionNumber,
        textStyle = MaterialTheme.typography.bodyLarge,
        singleLine = singleLine,
        cursorBrush = SolidColor(Color.Black)
    ) { innerTextField ->

        OutlinedTextFieldDefaults.DecorationBox(value = value,
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
                    text = "+033 000 000 000", color = LocalContentColor.current.copy(alpha = 0.6f)
                )
            },
            colors = colors,
            contentPadding = TextFieldDefaults.contentPaddingWithoutLabel(
                start = 16.dp, end = 8.dp, top = 0.dp, bottom = 0.dp
            ),
            // update border thickness and shape
            container = {
                OutlinedTextFieldDefaults.ContainerBox(
                    enabled = enabled,
                    isError = false,
                    interactionSource = interactionSource,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFF4B47A0),
                        unfocusedBorderColor = Color(0xFF000000)
                    ),
                    shape = RoundedCornerShape(8.dp) //OutlinedTextFieldDefaults.shape
                )
            })

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldPasswordSignUpCoursera(
    value: String, onValueChange: (String) -> Unit, modifier: Modifier = Modifier
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
            .height(40.dp),
        interactionSource = interactionSource,
        enabled = enabled,
        textStyle = MaterialTheme.typography.bodyLarge,
        keyboardOptions = keyBoardOptions,
        visualTransformation = if (expanded) VisualTransformation.None else PasswordVisualTransformation(),
        singleLine = singleLine,
        cursorBrush = SolidColor(Color.Black)
    ) { innerTextField ->
        OutlinedTextFieldDefaults.DecorationBox(value = value,
            innerTextField = {
                innerTextField()
            },
            enabled = enabled,
            singleLine = singleLine,
            trailingIcon = {
                var image = if (expanded) Icons.Filled.VisibilityOff
                else Icons.Filled.Visibility

                var description = if (expanded) "Hide password" else "Show password"

                IconButton(onClick = {
                    expanded = !expanded
                }) {
                    Icon(imageVector = image, contentDescription = description)
                }
            },
            visualTransformation = if (expanded) VisualTransformation.None else PasswordVisualTransformation(),
            interactionSource = interactionSource,
            placeholder = {
                Text(
                    text = "Tu Password", color = LocalContentColor.current.copy(alpha = 0.6f)
                )
            },
            colors = colors,
            contentPadding = TextFieldDefaults.contentPaddingWithoutLabel(
                start = 16.dp, end = 8.dp, top = 0.dp, bottom = 0.dp
            ),
            container = {
                OutlinedTextFieldDefaults.ContainerBox(
                    enabled = enabled,
                    isError = false,
                    interactionSource = interactionSource,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFF4B47A0),
                        unfocusedBorderColor = Color(0xFF000000)
                    ),
                    shape = RoundedCornerShape(8.dp) //OutlinedTextFieldDefaults.shape
                )
            })
    }
}