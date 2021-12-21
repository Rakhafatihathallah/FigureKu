package com.rakhafatih.figureku.data

object DataFigure {

    val nameFigure = arrayOf(
        "Asuna",
        "Kirito",
        "Levi",
        "Diluc"
    )
    val categoryFigure = arrayOf(
        "Figure",
        "Figure",
        "Figure",
        "Figure"
    )
    val descriptionFigure = arrayOf(
        "Dimension : 18 cm\nSeries : Asuna\nHarga : IDR 490.000\nDown Payment (DP) : IDR 100.000",
        "Dimension : 18 cm\nSeries : Kirito\nHarga : IDR 300.000\nDown Payment (DP) : IDR 100.000",
        "Dimension : 18 cm\nSeries : Levi\nHarga : IDR 510.000\nDown Payment (DP) : IDR 100.000",
        "Dimension : 18 cm\nSeries : Diluc\nHarga : IDR 210.000\nDown Payment (DP) : IDR 100.000",

        )
    val photoFigure = arrayOf(
        "https://i.ibb.co/B4LVFNW/figure-asuna.png",
        "https://i.ibb.co/B3k466v/figure-kirito.jpg",
        "https://i.ibb.co/sCPK2cp/figure-levi.png",
        "https://i.ibb.co/NnQS8Tv/figure-diluc.jpg"
    )
    val priceFigure = arrayOf(
        "490Rb",
        "300Rb",
        "510Rb",
        "210Rb"
    )

    val nameKaos = arrayOf(
        "Gundam",
        "Nekopara",
        "Deku",
        "Luffy"
    )
    val categoryKaos = arrayOf(
        "Kaos",
        "Kaos",
        "Kaos",
        "Kaos"
    )
    val descriptionKaos = arrayOf(
        "Size: S/M/L/XL\nSeries : Gundam\nHarga : IDR 150.000\nTipe: UNISEX",
        "Size: S/M/L/XL\nSeries : Gundam\nHarga : IDR 150.000\nTipe: UNISEX",
        "Size: S/M/L/XL\nSeries : Gundam\nHarga : IDR 150.000\nTipe: UNISEX",
        "Size: S/M/L/XL\nSeries : Gundam\nHarga : IDR 150.000\nTipe: UNISEX"
    )
    val photoKaos = arrayOf(
        "https://i.ibb.co/MP6MvKV/kaos-gundam.jpg",
        "https://i.ibb.co/CwkxkTR/kaos-nekopara.png",
        "https://i.ibb.co/Qfx7ypZ/kaos-deku.jpg",
        "https://i.ibb.co/0V0HcmM/kaos-luffy.jpg"
    )
    val priceKaos = arrayOf(
        "150Rb",
        "150Rb",
        "150Rb",
        "150Rb"
    )

    val nameHoodie = arrayOf(
        "Hoodie1",
        "Hoodie2",
        "Hoodie Kny",
        "Hoodie Haikyu"
    )
    val categoryHoodie = arrayOf(
        "Hoodie",
        "Hoodie",
        "Hoodie",
        "Hoodie"
    )
    val descriptionHoodie = arrayOf(
        "Size: S/M/L/XL\nSeries : Anime\nHarga : IDR 200.000\nTipe: UNISEX",
        "Size: S/M/L/XL\nSeries : Anime\nHarga : IDR 200.000\nTipe: UNISEX",
        "Size: S/M/L/XL\nSeries : Kimetsu No Yaiba\nHarga : IDR 200.000\nTipe: UNISEX",
        "Size: S/M/L/XL\nSeries : Haikyuu\nHarga : IDR 200.000\nTipe: UNISEX"
    )
    val photoHoodie = arrayOf(
        "https://i.ibb.co/fnsDDjK/hoodie-1.jpg",
        "https://i.ibb.co/rpVB5Qb/hoodie-2.jpg",
        "https://i.ibb.co/MBJVLqc/hoodie-kny.jpg",
        "https://i.ibb.co/j6wCwXz/hoodie-hakyu.jpg"
    )
    val priceHoodie = arrayOf(
        "200Rb",
        "200Rb",
        "200Rb",
        "200Rb"
    )

    val listFigure: ArrayList<Figures>
        get() {
            val list = arrayListOf<Figures>()
            for (data in nameFigure.indices) {
                val figure = Figures(
                    name = nameFigure[data],
                    category = categoryFigure[data],
                    description = descriptionFigure[data],
                    photo = photoFigure[data],
                    price = priceFigure[data],
                )
                list.add(figure)
            }
            return list
        }
    val listKaos: ArrayList<Figures>
        get() {
            val list = arrayListOf<Figures>()
            for (data in nameKaos.indices) {
                val kaos = Figures(
                    name = nameKaos[data],
                    category = categoryKaos[data],
                    description = descriptionKaos[data],
                    photo = photoKaos[data],
                    price = priceKaos[data],
                )
                list.add(kaos)
            }
            return list
        }
    val listHoodie: ArrayList<Figures>
        get() {
            val list = arrayListOf<Figures>()
            for (data in nameHoodie.indices) {
                val hoodie = Figures(
                    name = nameHoodie[data],
                    category = categoryHoodie[data],
                    description = descriptionFigure[data],
                    photo = photoHoodie[data],
                    price = priceHoodie[data],
                )
                list.add(hoodie)
            }
            return list
        }
}