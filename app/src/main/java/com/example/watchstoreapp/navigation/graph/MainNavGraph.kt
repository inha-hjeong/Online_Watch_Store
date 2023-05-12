package com.example.watchstoreapp.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.google.accompanist.pager.ExperimentalPagerApi
import com.example.watchstoreapp.navigation.screen.BottomNavItemScreen
import com.example.watchstoreapp.navigation.screen.Screen
import example.watchstoreapp.presentation.screen.about.AboutScreen
import example.watchstoreapp.presentation.screen.cart.CartScreen
import example.watchstoreapp.presentation.screen.detail.DetailScreen
import example.watchstoreapp.presentation.screen.explore.ExploreScreen
import example.watchstoreapp.presentation.screen.home.HomeScreen
import example.watchstoreapp.presentation.screen.search.SearchScreen
import example.watchstoreapp.utils.Constants.PRODUCT_ARGUMENT_KEY


@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.MAIN,
        startDestination = BottomNavItemScreen.Home.route
    ) {
        composable(route = BottomNavItemScreen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(route = BottomNavItemScreen.Explore.route) {
            ExploreScreen()
        }
        composable(route = BottomNavItemScreen.Cart.route) {
            CartScreen()
        }
        composable(route = BottomNavItemScreen.About.route) {
            AboutScreen()
        }

        searchNavGraph()

        detailsNavGraph()
    }
}

fun NavGraphBuilder.detailsNavGraph() {
    navigation(
        route = Graph.DETAILS,
        startDestination = Screen.Details.route
    ) {
        composable(
            route = Screen.Details.route,
            arguments = listOf(navArgument(PRODUCT_ARGUMENT_KEY) {
                type = NavType.IntType
            })
        ) {
            DetailScreen()
        }
    }
}

fun NavGraphBuilder.searchNavGraph() {
    navigation(
        route = Graph.SEARCH,
        startDestination = Screen.Search.route
    ) {
        composable(route = Screen.Search.route) {
            SearchScreen()
        }
    }
}