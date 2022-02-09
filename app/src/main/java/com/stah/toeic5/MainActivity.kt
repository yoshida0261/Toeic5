package com.stah.toeic5

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.stah.toeic5.home.HomeScreen
import com.stah.toeic5.home.ScoreNavHost
import com.stah.toeic5.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()
        setContent {
            MyTheme {
                MyApp(this)
            }
        }
    }
}

@Composable
fun MyApp(context: Context) {
    val navController = rememberNavController()
    val nav = ScoreNavHost(navController = navController)
}

