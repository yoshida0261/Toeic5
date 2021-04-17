package com.stah.toeic5

import android.content.Context
import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.databinding.DataBindingUtil
import com.stah.toeic5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent{
            MyApp(this)
        }
    }
}

@Composable
fun MyApp(context:Context){
    Surface() {
        Button(onClick = {
            var mediaPlayer: MediaPlayer? = MediaPlayer.create(context, R.raw.t1pt2q7)
            mediaPlayer?.start() // no need to call prepare(); create() does that for you
        }){
            Text(text = "Play on Compose")
        }

    }
}