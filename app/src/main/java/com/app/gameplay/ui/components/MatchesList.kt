package com.app.gameplayя.

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