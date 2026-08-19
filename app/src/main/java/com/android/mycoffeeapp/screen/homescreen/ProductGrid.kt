package com.android.mycoffeeapp.screen.homescreen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.mycoffeeapp.R
import com.android.mycoffeeapp.model.Product

@Composable
fun ProductGrid(
    products: List<Product>,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(products) { product ->
            ProductCard(product = product)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductGridPreview() {
    val dummyProducts = listOf(
        Product(1, "Caffe Latte", "With Oat Milk", 4.99, R.drawable.coffeecup),
        Product(2, "Cappuccino", "With Chocolate", 5.49, R.drawable.coffeecup),
        Product(3, "Espresso", "Strong & Bold", 3.99, R.drawable.coffeecup),
        Product(4, "Mocha", "With Whipped Cream", 5.99, R.drawable.coffeecup)
    )
    ProductGrid(products = dummyProducts)
}
