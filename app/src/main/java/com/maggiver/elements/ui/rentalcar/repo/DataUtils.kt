package com.maggiver.elements.ui.rentalcar.repo

import com.maggiver.elements.R
import com.maggiver.elements.ui.rentalcar.models.AvailableCars
import com.maggiver.elements.ui.rentalcar.models.CarouselCar


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

object DataUtils {

    val carCarouel = listOf(
        CarouselCar(
            id = 0,
            modelCar = "Mazda 3 Prime",
            deliveryTime = "15 Min",
            aniocModel = "2023",
            hourlyRental = "$49.900 / H",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.car1
        ),
        CarouselCar(
            id = 1,
            modelCar = "Renault Duster",
            deliveryTime = "30 Min",
            aniocModel = "2021",
            hourlyRental = "$25.000 / H",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.car2
        ),
        CarouselCar(
            id = 2,
            modelCar = "Chevrolet Tracker",
            deliveryTime = "15 Min",
            aniocModel = "2020",
            hourlyRental = "$45.000 / H",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.car3
        ),
        CarouselCar(
            id = 3,
            modelCar = "RAV4-Limited-4X4",
            deliveryTime = "20 Min",
            aniocModel = "2023",
            hourlyRental = "$69.900 / H",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.car4
        )
    )

    val lazyColumList = listOf(
        CarouselCar(
            id = 0,
            modelCar = "Mazda 3 Prime",
            deliveryTime = "15 Min",
            aniocModel = "2023",
            hourlyRental = "$49.900 / H",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.car1
        ),
        CarouselCar(
            id = 1,
            modelCar = "Renault Duster",
            deliveryTime = "30 Min",
            aniocModel = "2021",
            hourlyRental = "$25.000 / H",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.car2
        ),
        CarouselCar(
            id = 2,
            modelCar = "Chevrolet Tracker",
            deliveryTime = "15 Min",
            aniocModel = "2020",
            hourlyRental = "$45.000 / H",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.car3
        ),
        CarouselCar(
            id = 3,
            modelCar = "RAV4-Limited-4X4",
            deliveryTime = "20 Min",
            aniocModel = "2023",
            hourlyRental = "$69.900 / H",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.car4
        )
    )

}