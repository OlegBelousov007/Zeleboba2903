package com.example.zeleboba2903

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.zeleboba2903.ui.theme.Zeleboba2903Theme
import com.example.zeleboba2903.ui.theme.bottom_navigation.LoginScreen
import com.example.zeleboba2903.ui.theme.bottom_navigation.MainScreen
import com.example.zeleboba2903.ui.theme.bottom_navigation.NavGraph
import com.example.zeleboba2903.ui.theme.bottom_navigation.Screen1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Zeleboba2903Theme {
                MainScreen()
            }
            val navController =  rememberNavController()
            NavHost(navController = navController,
                startDestination = "Login_screen"){
                composable("Login_screen") {
                    LoginScreen {
                        navController.navigate("screen_1")
                    }
                }
                composable("screen_1"){

                }
            }
        }
    }
}

