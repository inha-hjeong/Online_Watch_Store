package com.example.watchstoreapp.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.watchstoreapp.navigation.screen.Screen
import example.watchstoreapp.presentation.screen.MainScreen
import example.watchstoreapp.presentation.screen.onboarding.OnBoardingScreen
import example.watchstoreapp.presentation.screen.splash.SplashScreen



@Composable
fun RootNavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }

        composable(route = Screen.OnBoarding.route) {
            OnBoardingScreen(navController = navController)
        }

        composable(route = Graph.MAIN) {
            MainScreen()
        }
    }
}