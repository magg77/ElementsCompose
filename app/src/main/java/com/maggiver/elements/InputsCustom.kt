package com.maggiver.elements

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Key
import androidx.compose.material.icons.filled.KeyOff
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


/**
 * Created by
 * @AUTHOR: Daniel Maggiver Acevedo
 * @NICK_NAME: mackgaru
 * @DATE: 12,noviembre,2023
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

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputsCustom() {

    var textEmail2 by rememberSaveable { mutableStateOf("") }
    var password2 by rememberSaveable { mutableStateOf("") }
    var passwordVisible2 by rememberSaveable { mutableStateOf(false) }
    var customText by rememberSaveable { mutableStateOf("") }

    Spacer(modifier = Modifier.height(32.dp))
    Text(
        text = "Text Inputs Custom",
        modifier = Modifier.fillMaxWidth(),
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Start
    )
    Spacer(modifier = Modifier.height(16.dp))


    LazyRow(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp),
    ) {
        item {
            Column {
                Text(
                    text = "Email",
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start
                )
                SmallTextFieldEmail(
                    value = textEmail2,
                    onValueChange = { textEmail2 = it }
                )
            }
        }

        item {
            Column {
                Text(
                    text = "Clave",
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start
                )
                SmallTextFieldPassword(
                    value = password2,
                    onValueChange = { password2 = it }
                )
            }
        }
    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SmallTextFieldEmail(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier.fillMaxWidth()
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

    BasicTextField(
        value = value,
        onValueChange = { onValueChange(it) },
        modifier = modifier
            .fillMaxWidth()
            .height(40.dp),
        // internal implementation of the BasicTextField will dispatch focus events
        interactionSource = interactionSource,
        enabled = enabled,
        textStyle = MaterialTheme.typography.bodyLarge,
        singleLine = singleLine,
        cursorBrush = SolidColor(Color.Black)
    ) { innerTextField ->

        OutlinedTextFieldDefaults.DecorationBox(
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
                    text = "Tu Email @",
                    color = LocalContentColor.current.copy(alpha = 0.6f)
                )
            },
            colors = colors,
            contentPadding = TextFieldDefaults.contentPaddingWithoutLabel(
                start = 16.dp,
                end = 8.dp,
                top = 0.dp,
                bottom = 0.dp
            ),
            // update border thickness and shape
            container = {
                OutlinedTextFieldDefaults.ContainerBox(
                    enabled = enabled,
                    isError = false,
                    interactionSource = interactionSource,
                    colors = OutlinedTextFieldDefaults.colors(),
                    shape = RoundedCornerShape(16.dp) //OutlinedTextFieldDefaults.shape
                )
            }
        )

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SmallTextFieldPassword(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
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
        OutlinedTextFieldDefaults.DecorationBox(
            value = value,
            innerTextField = {
                innerTextField()
            },
            enabled = enabled,
            singleLine = singleLine,
            trailingIcon = {
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
            },
            visualTransformation = if (expanded) VisualTransformation.None else PasswordVisualTransformation(),
            interactionSource = interactionSource,
            placeholder = {
                Text(
                    text = "Tu Password",
                    color = LocalContentColor.current.copy(alpha = 0.6f)
                )
            },
            colors = colors,
            contentPadding = TextFieldDefaults.contentPaddingWithoutLabel(
                start = 16.dp,
                end = 8.dp,
                top = 0.dp,
                bottom = 0.dp
            ),
            container = {
                OutlinedTextFieldDefaults.ContainerBox(
                    enabled = enabled,
                    isError = false,
                    interactionSource = interactionSource,
                    colors = OutlinedTextFieldDefaults.colors(),
                    shape = RoundedCornerShape(16.dp) //OutlinedTextFieldDefaults.shape
                )
            }
        )
    }
}