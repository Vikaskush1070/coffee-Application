package com.android.mycoffeeapp.screen.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.mycoffeeapp.R
import com.android.mycoffeeapp.ui.theme.CharcoalGray
import com.android.mycoffeeapp.ui.theme.LightBrown

@Preview(showBackground = true)
@Composable
fun MySearchBar() {
    var searchText by remember { mutableStateOf("") }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextField(
            value = searchText,
            onValueChange = { searchText = it },
            placeholder = {
                Text(
                    text = "Search coffee",
                    color = Color.Gray
                )
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon",
                    tint = Color.White
                )
            },
            modifier = Modifier
                .weight(1f)
                .background(
                    color = CharcoalGray,
                    shape = RoundedCornerShape(topStart = 15.dp, topEnd = 0.dp, bottomStart = 15.dp, bottomEnd = 0.dp)
                ),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Color.White,
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.White
            ),
            shape = RoundedCornerShape(15.dp)
        )

        IconButton(
            onClick = {},
            modifier = Modifier
                .padding(start = 12.dp)
                .background(
                    color = LightBrown,
                    shape = RoundedCornerShape(topStart = 0.dp, topEnd = 15.dp, bottomStart = 0.dp, bottomEnd = 15.dp)
                )
                .size(56.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_filter),
                contentDescription = "Filter",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}
