package com.app.gameplay

import androidx.compose.runtime.Composable

@Composable
fun Header() {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {

            Image(
                painter = painterResource(R.drawable.avatar),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
                    .clip(RoundedCornerShape(12.dp))
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text("Olá, Tiago", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Text("Hoje é dia de vitória", fontSize = 14.sp)
            }
        }

        IconButton(onClick = {}) {
            Icon(Icons.Default.Add, contentDescription = null)
        }
    }
}