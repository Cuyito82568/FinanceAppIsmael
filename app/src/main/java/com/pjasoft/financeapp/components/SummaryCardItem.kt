package com.pjasoft.financeapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.pjasoft.financeapp.models.SummaryCard

@Composable
fun ActivityCardItem(card: SummaryCard) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = card.backgroundColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = card.title,
                modifier = Modifier.padding(top = 24.dp),
                tint = Color.Black
            )
            Text(
                text = card.title,
                style = MaterialTheme.typography.titleMedium,
                color = Color.DarkGray,
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = card.subtitle,
                style = MaterialTheme.typography.bodySmall,
                color = Color.Gray
            )
        }
    }
}

// Tarjeta pequeña derecha
@Composable
fun SummaryCardItem(card: SummaryCard) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(88.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = card.backgroundColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = card.title,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray
            )
            Text(
                text = card.amount,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray
            )
        }
    }
}
