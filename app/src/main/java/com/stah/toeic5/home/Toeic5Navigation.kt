package com.stah.toeic5.home

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.stah.toeic5.home.ScoreDestinations.HOME
import com.stah.toeic5.home.ScoreDestinations.SCORE_LIST

object ScoreDestinations {
    const val SCORE_LIST = "score_list"
    const val HOME = "home"
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ScoreNavHost(
    navController: NavHostController,
    startDestination: String = HOME
) {
    val actions = AppActions(navController)

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(
            route = SCORE_LIST
        ) {
            ScoreListScreen()
        }

        composable(
            route = HOME
        ) {
            HomeScreen(actions.scoreList)
        }
    }


}

private class AppActions(
    navController: NavController
) {
    val scoreList: () -> Unit = {
        navController.navigate(SCORE_LIST)
    }
    val navigateUp: () -> Unit = {
        navController.navigateUp()
    }
}
