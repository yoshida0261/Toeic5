package com.stah.toeic5.home

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun HomeScreen() {
    Scaffold(topBar = {

    },
        content = { TodayScore() }
    )

}
