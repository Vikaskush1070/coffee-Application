package com.android.mycoffeeapp.screen.homescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.android.mycoffeeapp.screen.ui_components.MyBottomNavBar

@Preview(showBackground = true)
@Composable
fun HomeScreen() {

    Scaffold(
        bottomBar = { MyBottomNavBar() }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            // Screen content goes here
        }
    }
}
