package com.stah.toeic5.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.stah.toeic5.R
import com.stah.toeic5.ui.theme.pink100

@Composable
fun Part2Screen(names: List<String> = List(25) { "Test1 Part2 Q${(7 + it)}" }) {
    Column() {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.toeic5), contentDescription = null,
                modifier = Modifier.height(120.dp),
                contentScale = ContentScale.Crop,
            )
        }
        Column(modifier = Modifier.fillMaxHeight()) {
            Spacer(Modifier.height(16.dp))
            Column() {
                NameList(names = names)
            }
        }
    }
}

@Composable
fun NameList(names: List<String>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(items = names) { name ->
            Surface (modifier = Modifier.fillMaxWidth()){
                Text(modifier = Modifier.padding(16.dp), text = name)
            }
            Divider(color = pink100)
        }
    }
}
