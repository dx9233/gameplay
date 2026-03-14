package com.app.gameplay

import androidx.compose.runtime.Composable

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

                    Icon(
                        Icons.Default.EmojiEvents,
                        contentDescription = null,
                        modifier = Modifier.size(40.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text("Rankeada")
                }
            }
        }
    }
}