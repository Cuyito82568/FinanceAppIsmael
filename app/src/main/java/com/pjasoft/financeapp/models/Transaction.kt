package com.pjasoft.financeapp.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector


data class Transaction(
    val id: Int,
    val storeName: String,
    val category: String,
    val amount: Double,
    val time: String,
    val icon: ImageVector
)

val transactions = listOf(
    Transaction(1, "Supermarket", "Groceries", 45.99, "10:30 AM", icon = Icons.Default.ShoppingCart ),
    Transaction(2, "Gas Station", "Fuel", -30.5, "12:15 PM", icon = Icons.Default.ShoppingCart ),
    Transaction(3, "Coffee Shop", "Food & Drinks", 5.75, "8:00 AM", icon = Icons.Default.ShoppingCart ),
    Transaction(4, "Electronics Store", "Electronics", 120.0, "3:45 PM", icon = Icons.Default.ShoppingCart ),
    Transaction(5, "Bookstore", "Books", 25.99, "2:00 PM", icon = Icons.Default.ShoppingCart ),
    Transaction(6, "Restaurant", "Dining", 60.0, "7:30 PM", icon = Icons.Default.ShoppingCart )
)