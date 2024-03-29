package com.example.zeleboba2903.ui.theme.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(
    navHostControleer: NavHostController
) {
    NavHost(navController = navHostControleer, startDestination = "screen_1" ){
        composable("screen_1"){
            Screen1()
        }
        composable("screen_2"){
            Screen2()
        }
        composable("screen_3"){
            Screen3()
        }
        composable("screen_4"){
            Screen4()
        }
    }
}