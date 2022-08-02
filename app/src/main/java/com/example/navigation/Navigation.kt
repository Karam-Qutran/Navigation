package com.example.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(){

    val navController = rememberNavController()

    NavHost(navController =navController , startDestination = "Home"  ){

        composable(route = "Home") {
            FirstScreen(navController = navController )
        }

        composable(route = "Second") {
            SecondScreen(navController = navController  )
        }

        composable(route = "Second") {

            ThirdScreen(navController = navController  )
        }

    }
}