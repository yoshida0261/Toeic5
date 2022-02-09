package com.stah.toeic5.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.*

@Composable
fun TodayScore(scoreNavigation: ()-> Unit) {
    var text by rememberSaveable { mutableStateOf("") }
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        val s = LocalDateTime.now()
        Text(text = s.toString(), fontSize = 24.sp)
        Spacer(Modifier.size(24.dp))
        Row() {
            TextField(
                value = text, onValueChange = {
                    text = it
                },
                label = {},
                modifier = Modifier.size(36.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
            Text("/30")
        }
        Spacer(Modifier.size(24.dp))
        Button(modifier = Modifier.testTag("input Button"), onClick =  scoreNavigation , content = { Text("input") })
    }

}
