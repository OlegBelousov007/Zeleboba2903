package com.example.zeleboba2903.ui.theme.bottom_navigation

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar ={
            BottomNAvigation(navController = navController)
        }
    ) {
        NavGraph(navHostControleer = navController)
    }
}