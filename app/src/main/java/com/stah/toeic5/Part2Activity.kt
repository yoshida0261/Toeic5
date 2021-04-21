package com.stah.toeic5

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import com.stah.toeic5.ui.screen.Part2Detail
import com.stah.toeic5.ui.theme.MyTheme

class Part2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContent {
            MyTheme {
                Part2()
            }
        }
    }

    companion object {
        @JvmStatic
        fun createPart2Intent(context: Context) =
            Intent(context, Part2Activity::class.java)
    }
}

@Composable
fun Part2() {
    Part2Detail()
}
