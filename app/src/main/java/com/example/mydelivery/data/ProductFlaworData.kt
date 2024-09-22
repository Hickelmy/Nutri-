package com.example.mydelivery.data

import androidx.annotation.DrawableRes
import com.example.mydelivery.R

data class ProductFlavorState(
    val name: String,
    val price: String,
    @DrawableRes val imgRes: Int
)

val ProductFlavorsData = listOf(
    ProductFlavorState(
        imgRes = R.drawable.almond,
        name = "Amêndoa ",
        price = "R\$ 1,99 /100g"
    ),
    ProductFlavorState(
        imgRes = R.drawable.maca,
        name = "Maça",
        price = "R\$ 2,10 /150g"
    ),
    ProductFlavorState(
        imgRes = R.drawable.melancia,
        name = "Melancia",
        price = "R\$ 4,47 /1500g"
    )
)