package com.app.gameplay

import androidx.compose.runtime.Composable

@Composable
fun SectionTitle() {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Text(
            text = "Partidas agendadas",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        Text("Total 6")
    }
}