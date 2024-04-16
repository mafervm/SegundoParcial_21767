package com.example.segundoparcial_21767

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.segundoparcial_21767.views.ListView

//import com.example.segundoparcial_21767.views.DataView


@Composable
fun NavManager() {
    var navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "ListView") {

        composable(route = "ListView") {
            ListView(navController)
        }

        composable(route = "DataView/{img}/{profesion}", arguments = listOf(
            navArgument("img") {type = NavType.IntType},
            navArgument("profesion") {type = NavType.StringType}
        )) {
                parameters ->
            val img = parameters.arguments?.getInt("img") ?: 0
            val trabajo = parameters.arguments?.getString("profesion") ?: ""

            //DataView(navController, img, profesion)
        }

    }
}