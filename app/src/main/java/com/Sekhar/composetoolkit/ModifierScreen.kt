package com.Sekhar.composetoolkit

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun WeightExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Red),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Hello World",
                fontSize =20.sp,
                color = Color.White
            )
        }

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Blue),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Working On Compose",
                fontSize =20.sp,
                color = Color.White
            )
        }
    }

}


@Preview
@Composable
fun OffsetExample() {

    Box(
        modifier = Modifier.fillMaxSize()
            .background(Color(0xFFFFEB3B))
    ) {

        Text(
            text = "Moved Text",
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.offset(x = 50.dp, y = 80.dp)
        )
    }
}




@Preview
@Composable
fun BorderExample() {

    Box(
        modifier = Modifier
            .padding(20.dp)
            .border(2.dp, Color.Black)
            .size(150.dp),
        contentAlignment = Alignment.Center
    ) {
        Text("Border Box")
    }
}





@Preview
@Composable
fun ClickableExample() {

    Box(
        modifier = Modifier
            .padding(20.dp)
            .background(Color.Cyan)
            .size(150.dp)
            .clickable {
                println("Box clicked")
            },
        contentAlignment = Alignment.Center
    ) {
        Text("Clickable Box")
    }
}



