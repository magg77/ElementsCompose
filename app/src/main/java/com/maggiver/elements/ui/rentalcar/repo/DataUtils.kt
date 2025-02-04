package com.maggiver.elements.ui.rentalcar.repo

import com.maggiver.elements.R
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
            modelCar = "Retro Excavadora Hitachi",
            deliveryTime = "15 Min",
            aniocModel = "2023",
            hourlyRental = "$115.900 / H",
            rating = "5.0",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.retro_excavadora_hitachi
        ),
        CarouselCar(
            id = 1,
            modelCar = "Renault Duster",
            deliveryTime = "30 Min",
            aniocModel = "2021",
            hourlyRental = "$25.000 / H",
            rating = "4.5",
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
            rating = "5.0",
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
            rating = "4.5",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.car4
        )
    )

    val listAvailableMaquinaria = listOf(
        CarouselCar(
            id = 0,
            modelCar = "RetroExcavadora Hitachi",
            deliveryTime = "15 Min",
            aniocModel = "2023",
            hourlyRental = "$112.900 / H",
            rating = "4.5",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.retro_excavadora_hitachi
        ),
        CarouselCar(
            id = 1,
            modelCar = "Retrocargador CAT",
            deliveryTime = "30 Min",
            aniocModel = "2021",
            hourlyRental = "$115.000 / H",
            rating = "5.0",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.retrocargador_pajarita
        ),
        CarouselCar(
            id = 2,
            modelCar = "MiniExcavadora Hitachi",
            deliveryTime = "15 Min",
            aniocModel = "2020",
            hourlyRental = "$105.000 / H",
            rating = "4.5",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.mini_excavadorahtachi_800x533
        ),
        CarouselCar(
            id = 3,
            modelCar = "Volqueta International",
            deliveryTime = "20 Min",
            aniocModel = "2023",
            hourlyRental = "$69.900 / H",
            rating = "5.0",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.volqueta_blanca
        )
    )

    val lazyColumListCarsUrbans = listOf(
        CarouselCar(
            id = 0,
            modelCar = "Mazda 3 Prime",
            deliveryTime = "15 Min",
            aniocModel = "2023",
            hourlyRental = "$49.900 / H",
            rating = "4.5",
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
            rating = "5.0",
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
            rating = "4.5",
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
            rating = "5.0",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.car4
        )
    )

    val lazyColumListCamionesSmall= listOf(
        CarouselCar(
            id = 0,
            modelCar = "Chevrolet D-MAX DSL 2.5",
            deliveryTime = "15 Min",
            aniocModel = "2008",
            hourlyRental = "$15.900 / H",
            rating = "4.5",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.car_small_camiones_1_chevrolet_d_max_dsl_2_5_2008
        ),
        CarouselCar(
            id = 1,
            modelCar = "Chevrolet Luv 1.6 Std TFR",
            deliveryTime = "30 Min",
            aniocModel = "2003",
            hourlyRental = "$14.900 / H",
            rating = "4.5",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.car_small_camiones_2_chevrolet_luv_1_6_std_tfr
        ),
        CarouselCar(
            id = 2,
            modelCar = "Nissan Frontier D22 NP300",
            deliveryTime = "15 Min",
            aniocModel = "2011",
            hourlyRental = "$16.900 / H",
            rating = "5.0",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.car_small_camiones_3_nissan_frontier_d22_np300_estacas_2011_removebg_preview
        ),
        CarouselCar(
            id = 3,
            modelCar = "Piaggio Hafei Ruiyi HFJ",
            deliveryTime = "20 Min",
            aniocModel = "2007",
            hourlyRental = "$13.900 / H",
            rating = "4.5",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.car_small_camiones_4_hafei_ruiyi_hfj
        )
    )

    val lazyColumListMotocarro= listOf(
        CarouselCar(
            id = 0,
            modelCar = "Motocarro Auteco Cerrote 200",
            deliveryTime = "15 Min",
            aniocModel = "2018",
            hourlyRental = "$15.900 / H",
            rating = "4.5",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.motocarro1_autecocerrote200
        ),
        CarouselCar(
            id = 1,
            modelCar = "Chevrolet Luv 1.6 Std TFR",
            deliveryTime = "30 Min",
            aniocModel = "2003",
            hourlyRental = "$14.900 / H",
            rating = "4.5",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.motocarro2_ayco200
        ),
        CarouselCar(
            id = 2,
            modelCar = "Natsuky 850",
            deliveryTime = "15 Min",
            aniocModel = "2011",
            hourlyRental = "$16.900 / H",
            rating = "5.0",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.motocarro3_natsuky850
        ),
        CarouselCar(
            id = 3,
            modelCar = "Forza 200 HK",
            deliveryTime = "20 Min",
            aniocModel = "2020",
            hourlyRental = "$13.900 / H",
            rating = "4.5",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.motocarro4_forza_200
        ),
        CarouselCar(
            id = 3,
            modelCar = "Piaggio Ck 350",
            deliveryTime = "20 Min",
            aniocModel = "2022",
            hourlyRental = "$13.900 / H",
            rating = "4.5",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.motocarro5_piaggio_ck_350
        ),
        CarouselCar(
            id = 3,
            modelCar = "Piaggio A Appe City",
            deliveryTime = "20 Min",
            aniocModel = "2007",
            hourlyRental = "$13.900 / H",
            rating = "4.5",
            descriptionModel = "Sal de la rutina por un rato. Déjate guiar por tu espíritu aventurero y aprovecha cada oportunidad de salir a la carretera.\n" +
                    "\n" +
                    "La RAV4 está lista para darte el rendimiento y confianza que necesitas ya que está diseñada para llegar más lejos, ya sea en o fuera de la carretera\n" +
                    "\n" +
                    "La tracción permanente en las cuatro ruedas * disponible te permite manejar por los senderos montañosos, mientras que la suspensión trasera multibrazo te ayuda a dominar el pavimento.",
            pathCarModel = R.drawable.motocarro6_piaggio_a_appe_city
        )
    )

}