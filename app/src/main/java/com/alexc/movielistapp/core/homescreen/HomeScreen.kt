package com.alexc.movielistapp.core.homescreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.alexc.movielistapp.core.bottombar.BottomBar
import com.alexc.movielistapp.core.homescreen.views.CategoriesWidget
import com.alexc.movielistapp.core.homescreen.views.InTheatersWidget
import com.alexc.movielistapp.core.homescreen.views.MostPopularMoviesWidget


@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        bottomBar = {
            BottomBar(navController)
        },
        modifier = Modifier
            .fillMaxSize()
    ) {
        LazyColumn {
            item {
                Spacer(modifier = Modifier.height(20.dp))
            }
            item {
                InTheatersWidget(navController)
            }

            item {
                Spacer(modifier = Modifier.height(30.dp))
            }

            item {
                MostPopularMoviesWidget(navController)
            }
            item {
                CategoriesWidget(navController = navController)
            }

            item {
                Spacer(modifier = Modifier.height(60.dp))
            }
        }
    }
}
