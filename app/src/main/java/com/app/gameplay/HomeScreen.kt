package com.app.gameplay

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.gameplay.ui.components.*
import com.app.gameplayя.MatchesList

@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Header()

        Spacer(modifier = Modifier.height(20.dp))

        GameModes()

        Spacer(modifier = Modifier.height(20.dp))

        SectionTitle()

        Spacer(modifier = Modifier.height(10.dp))

        MatchesList()
    }
}

@Composable
fun GameModes() {
    TODO("Not yet implemented")
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    GamePlayTheme {
        HomeScreen()
    }
}