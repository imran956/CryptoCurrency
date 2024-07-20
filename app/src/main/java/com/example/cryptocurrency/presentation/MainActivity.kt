package com.example.cryptocurrency.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cryptocurrency.presentation.coin_detail.CoinDetailScreen
import com.example.cryptocurrency.presentation.coin_list.CoinListScreen
import com.example.cryptocurrency.presentation.ui.theme.CryptocurrencyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptocurrencyTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = Screen.CoinListScreen.route){
                    composable(route = Screen.CoinListScreen.route){
                        CoinListScreen(navController = navController)
                    }
                    composable(route = Screen.CoinDetailScreen.route + "/{coinId}"){
                        CoinDetailScreen()
                    }
                }

            }
        }
    }
}

