package com.maggiver.elements.ui.utils

import android.util.Log
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale


/**
 * Created by
 * @AUTHOR: Daniel Maggiver Acevedo
 * @NICK_NAME: mackgaru
 * @DATE: 21,diciembre,2023
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
 
fun fechas(){

    val dateFecha = LocalDate.now()
    Log.i("dateFECHA", "LocalDate : ${dateFecha.toString()}")

    val dateFecha2 = LocalDateTime.now(ZoneId.systemDefault())
    Log.i("dateFECHA", "LocalDateTime : ${dateFecha2.toString()}")

    val dateFecha3 = ZonedDateTime.of(dateFecha2, ZoneId.systemDefault())
    Log.i("dateFECHA", "LocalDateTime.zondeId ${dateFecha3.toString()}")

    /*convert to UTC*/
    var dateUTC = dateFecha3.toInstant().toEpochMilli()
    Log.i("dateFECHA", "utc : ${dateUTC.toString()}")

    /*convert to ZonedDateTime*/
    var zonedDateConvert = ZonedDateTime.ofInstant(Instant.ofEpochMilli(dateUTC), ZoneId.systemDefault())
    Log.i("dateFECHA", "convert utc :  ${zonedDateConvert.toString()}")

    /*convert zone horaria sin pasar por utc*/
    val aus = dateFecha3.withZoneSameInstant(ZoneId.of("Australia/Melbourne"))

    var dateFormatCustom = DateTimeFormatter.ofPattern("d MMM", Locale.getDefault())
    var formattedString = dateFecha3.format(dateFormatCustom)
    Log.i("dateFECHA", "date format :  ${formattedString}")


    var dataCapitalize = formattedString.replaceFirstChar {
        if (it.isLowerCase()) it.titlecase(
            Locale.getDefault()
        ) else it.toString()
    }
    Log.i("dataCapitalize", "date format :  ${dataCapitalize}")
}

