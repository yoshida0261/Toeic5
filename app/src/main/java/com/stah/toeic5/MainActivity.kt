package com.stah.toeic5

import android.content.Context
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import com.stah.toeic5.ui.screen.Part2Screen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp(this)
        }
    }
}

@Composable
fun MyApp(context: Context) {
    Part2Screen()
}

