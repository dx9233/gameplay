package com.app

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.unit.dp
import com.app.gameplay.MatchItem

@Composable
fun MatchesList() {

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        items(5) {
            MatchItem()
        }
    }
}