package com.maggiver.elements.ui.rentalcar.screens.main.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


/**
 * Created by
 * @AUTHOR: Daniel Maggiver Acevedo
 * @NICK_NAME: mackgaru
 * @DATE: 25,diciembre,2023
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
fun ChatScreen(navController: NavHostController) {

    var message by remember { mutableStateOf("") }
    var messages by remember { mutableStateOf(listOf("Hola!", "¡Hola! ¿Cómo estás?", "Todo bien, gracias.")) }

    val context = LocalContext.current
    val uriHandler = LocalUriHandler.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Conversación con el conductor",
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp, bottom = 16.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            textAlign = TextAlign.Center,
            color = Color(0xFFE4E4E4),
        )

        // Chat Messages
        MessageList(messages)

        // Spacer
        Spacer(modifier = Modifier.height(8.dp))

        // Input Box
        ChatInputBox(
            message = message,
            onMessageChange = { message = it },
            onSendClick = {
                if (message.isNotBlank()) {
                    messages = messages + message
                    message = ""
                }
            }
        )
    }
}

@Composable
fun MessageList(messages: List<String>) {
    LazyColumn {
        items(messages.size) { index ->
            ChatMessage(messages[index])
        }
    }
}

@Composable
fun ChatMessage(message: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
            .background(MaterialTheme.colorScheme.primary)
            .padding(8.dp)
            .clip(MaterialTheme.shapes.small)
    ) {
        Text(
            text = message,
            color = Color.White
        )
    }
}

@Composable
fun ChatInputBox(
    message: String,
    onMessageChange: (String) -> Unit,
    onSendClick: () -> Unit
) {
    var isPlaceholderVisible by remember { mutableStateOf(true) }

    val focusManager = LocalFocusManager.current
    val keyboardController = LocalSoftwareKeyboardController.current

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.secondary)
            .padding(8.dp)
            .clip(MaterialTheme.shapes.small)
    ) {
        // Message Input
        BasicTextField(
            value = message,
            onValueChange = {
                onMessageChange(it)
                isPlaceholderVisible = it.isEmpty()
            },
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Send
            ),
            keyboardActions = KeyboardActions (
                onSend = {
                    onSendClick()
                    focusManager.clearFocus()
                    keyboardController?.hide()
                }
            ),
            textStyle = MaterialTheme.typography.bodyLarge.copy(color = Color.White),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        // Spacer
        Spacer(modifier = Modifier.height(4.dp))

        // Send Button
        IconButton(
            onClick = {
                onSendClick()
                focusManager.clearFocus()
                keyboardController?.hide()
            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Icon(
                imageVector = Icons.Default.Send,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSecondary
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewChatScreen() {

        ChatScreen(navController = rememberNavController())

}