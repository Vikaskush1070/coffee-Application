package com.android.mycoffeeapp.screen.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.android.mycoffeeapp.R
import com.android.mycoffeeapp.model.Product
import com.android.mycoffeeapp.screen.ui_components.MyBottomNavBar

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreen() {

    val location = "Noida sec-52"

    Scaffold(
        containerColor = Color.White,
        bottomBar = { MyBottomNavBar() }
    ) { innerPadding ->

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 1f / 3f)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF303030),
                            Color(0xFF1F1F1F),
                            Color(0xFF121212),
                        )
                    )
                )
            //        .padding(innerPadding)) {
            // Screen content goes here
        )
        Column(
            modifier = Modifier.fillMaxSize().padding(all = 15.dp).padding(innerPadding)
        ) {
            Text(
                text = "Location",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                color = Color.Gray)

            Spacer(modifier = Modifier.height(4.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,

            ) {
                Text(
                    text = location,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 15.sp
                )
                Icon(imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = "Change Location",
                    tint = Color.White
                )
            }

            MySearchBar()

            Spacer(modifier = Modifier.height(35.dp))

            Image(
                painter = painterResource(R.drawable.modern),
                contentDescription = "Home Banner",

                modifier = Modifier
                    .fillMaxWidth()
//                    .height(145.dp)
//                    .clip(RoundedCornerShape(15.dp))
//                    .graphicsLayer(scaleX = 1.35f, scaleY = 1.35f),
//                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(15.dp))

            HomeScreenCategories()

            //displaying product
            val products = listOf(
                Product(id = 1, name = "Macchiato", description = "hello", price = 149.50, imageRes = R.drawable.icoffee),
                Product(id = 2, name = "Latte", description = "Latte", price = 149.50, imageRes = R.drawable.icoffes),
                Product(id = 3, name = "American", description = "American", price = 149.50, imageRes = R.drawable.icoffee),
                Product(id = 4, name = "Snacks", description = "Desserts", price = 149.50, imageRes = R.drawable.icoffee),
                Product(id = 5, name = "Desserts", description = "Desserts", price = 149.50, imageRes = R.drawable.icoffee),
                Product(id = 6, name = "Coffee", description = "Coffe", price = 149.50, imageRes = R.drawable.icoffee),
                Product(id = 7, name = "Tea", description = "Tea", price = 149.50, imageRes = R.drawable.icoffee)
            )

        }

    }
}
