package com.stah.toeic5.home

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun HomeScreen() {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text("2021年7月の利用履歴", color = Color.Black) }
        )
    },
        content = { Text("test") }
    )

}
