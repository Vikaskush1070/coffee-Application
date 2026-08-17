package com.android.mycoffeeapp.screen.ui_components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.mycoffeeapp.R
import com.android.mycoffeeapp.ui.theme.LightBrown

@Preview(showBackground = true)
@Composable
fun MyBottomNavBar() {

    //Bottom Nav Item
    val navItems = remember {
        listOf(
            NavItem("Home", R.drawable.ic_home),
            NavItem("Cart", R.drawable.ic_cart),
            NavItem("Favourites", R.drawable.ic_heart),
            NavItem("Profile", R.drawable.ic_profile),

        )
    }
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier.height(80.dp)
    ) {
        navItems.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(item.icon),
                        contentDescription = item.title,
                        modifier = Modifier.size(25.dp)
                    )
                },
                label = { Text(item.title) },
                onClick = {},
                selected = true,
                alwaysShowLabel = true,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = LightBrown,
                    selectedTextColor = LightBrown,
                    unselectedIconColor = Color.DarkGray,
                    unselectedTextColor = Color.DarkGray,
                    indicatorColor = LightBrown.copy(alpha = 0.02f)
                )
            )
        }
    }
}

data class NavItem(
    val title: String,
    val icon: Int
)
