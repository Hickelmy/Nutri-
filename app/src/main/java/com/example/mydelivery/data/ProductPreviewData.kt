package com.example.mydelivery.data

import androidx.annotation.DrawableRes
import com.example.mydelivery.R

data class ProductHighlightState(
    val text: String,
    val type: ProductHighlightType
)

enum class ProductHighlightType {
    PRIMARY, SECONDARY
}

data class ProductPreviewState(
    val headline: String = "Nutri +",
    @DrawableRes val productImg: Int = R.drawable.prato,
    val highlights: List<ProductHighlightState> = listOf(
        ProductHighlightState(
            text = "Saudavel",
            type = ProductHighlightType.PRIMARY
        ),
        ProductHighlightState(
            text = "Bem Estar",
            type = ProductHighlightType.PRIMARY
        )
    )
)