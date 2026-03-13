package com.pjasoft.financeapp.models

data class User(
    val name: String,
    val balance: Double
)

val currentUser = User(
    name = "Ismael",
    balance = 12850.00
)