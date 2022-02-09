package com.stah.toeic5.home

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@ExperimentalMaterialApi
@Composable
fun ScoreListScreen() {
    Scaffold(topBar = {
        Text("score screen")
    },
        content = {
            ScoreListContents()
        }
    )
}

@ExperimentalMaterialApi
@Composable
fun ScoreListContents() {
    LazyColumn {
        items(2) {
            ListItem(
                text = { Text(text = "25/30 2022-02-09", fontSize = 24.sp, modifier = Modifier.testTag("score Text")) })
            Spacer(Modifier.size(24.dp))
        }
    }

}
