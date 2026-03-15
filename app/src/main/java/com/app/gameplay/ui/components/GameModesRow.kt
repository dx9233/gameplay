package com.app.gameplay

import androidx.compose.runtime.Composable

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.Card
// import androidx.compose.material3.Icon
import androidx.compose.material3.Text

/* import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEvents */

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GameModesRow() {

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        items(3) {

            Card(
                modifier = Modifier.size(140.dp),
                shape = RoundedCornerShape(20.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {

                  /*  Icon(
                        Icons.Default.EmojiEvents,
                        contentDescription = null,
                        modifier = Modifier.size(40.dp)
                    ) */

                    Spacer(modifier = Modifier.height(10.dp))

                    Text("Rankeada")
                }
            }
        }
    }
}