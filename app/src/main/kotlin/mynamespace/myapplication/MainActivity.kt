package mynamespace.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import mynamespace.myapplication.ui.App
import mynamespace.myapplication.ui.theme.AppTheme

@AndroidEntryPoint
class MainActivity: ComponentActivity() {

    lateinit var controller: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            controller = rememberNavController()
            AppTheme {
                App(controller)
            }
        }
    }
}