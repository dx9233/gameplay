package com.app.gameplayя.

@Composable
fun MatchItem() {

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = painterResource(R.drawable.game),
            contentDescription = null,
            modifier = Modifier
                .size(64.dp)
                .clip(RoundedCornerShape(12.dp))
        )

        Spacer(modifier = Modifier.width(12.dp))

        Column(modifier = Modifier.weight(1f)) {

            Text("Lendários", fontWeight = FontWeight.Bold)

            Text("League of Legends", fontSize = 14.sp)

            Text("Sex 18/06 às 21:00h", fontSize = 12.sp)
        }

        Column(horizontalAlignment = Alignment.End) {

            Text("Rankeada")

            Text("3 players")
        }
    }
}