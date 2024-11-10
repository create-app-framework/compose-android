package mynamespace.myapplication.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun App(controller: NavHostController) {
    
}

@Preview
@Composable
private fun AppPreview() {
    App(controller = rememberNavController())
}