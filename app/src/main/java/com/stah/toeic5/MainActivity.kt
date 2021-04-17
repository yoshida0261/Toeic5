package com.stah.toeic5

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.stah.toeic5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        binding.play.setOnClickListener {
            var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.t1pt2q7)
            mediaPlayer?.start() // no need to call prepare(); create() does that for you
        }
    }
}
