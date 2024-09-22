package com.example.mydelivery.data


data class OrderState(
    val amount: Int,
    val totalPrice: String
)

val OrderData = OrderState(
    amount = 1,
    totalPrice = "$20.45"
)