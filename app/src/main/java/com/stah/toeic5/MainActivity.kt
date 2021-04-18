package com.stah.toeic5

import android.content.Context
import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ListItem
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.databinding.DataBindingUtil
import com.stah.toeic5.databinding.ActivityMainBinding

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
    
    Column() {

        repeat(10){
            Text(text = "test")
        }
    }
    /*
    Surface() {
        Button(onClick = {
            var mediaPlayer: MediaPlayer? = MediaPlayer.create(context, R.raw.t1pt2q7)
            mediaPlayer?.start() // no need to call prepare(); create() does that for you
        }) {
            Text(text = "Play on Compose")
        }

    }
    
     */
}