package com.pjasoft.financeapp.models

import androidx.compose.ui.graphics.Color

data class SummaryCard(
    val title: String,
    val subtitle: String = "",
    val amount: String = "",
    val backgroundColor: Color
)

val summaryCards = listOf(
    // Tarjeta grande izquierda - sin monto, solo título
    SummaryCard(
        title = "Actividad",
        subtitle = "de la Semana",
        backgroundColor = Color(0xFFE8F5E9)   // verde claro
    ),
    // Tarjeta pequeña derecha arriba
    SummaryCard(
        title = "Ventas",
        amount = "$280.99",
        backgroundColor = Color(0xFFF5EFE6)   // beige
    ),
    // Tarjeta pequeña derecha abajo
    SummaryCard(
        title = "Ganancias",
        amount = "$280.99",
        backgroundColor = Color(0xFFEDE7F6)   // lila
    )
)