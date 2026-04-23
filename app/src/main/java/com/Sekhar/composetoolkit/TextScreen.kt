package com.Sekhar.composetoolkit

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp


@Composable
fun MyText() {

    Column(
        modifier = Modifier.padding(30.dp)
    ) {
        Text(
            text = "Hello Compose",
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth(),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            color = Color.Green
        )
    }
}


 //////////////////////or write these way of code////////
@Composable
fun TextScreen(
    modifier: Modifier= Modifier
) {
     Column(
         modifier = Modifier.padding(40.dp)
     ) {
         Text(
             text = "Welcome to Compose!",
             fontSize = 25.sp,
             fontWeight = FontWeight.ExtraBold,
             fontStyle = FontStyle.Italic,
             color = Color.Red,
             modifier = Modifier
                 .shadow(30.dp)
                 .background(Color.Yellow)
                 .padding(20.dp),

             )
     }

 }


@Composable
fun Text1(
//    modifier: Modifier= Modifier

) {
    Column(
        modifier=Modifier.padding(50.dp),
    ) {
        Text(
            text = "Sekhar",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            color = Color.Blue,
            modifier = Modifier
                .padding(30.dp)
                .background(Color.White)
        )

    Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Nag",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            fontStyle = FontStyle.Italic,
            modifier = Modifier
                .padding(60.dp)
                .background(Color.White)

            )
    }
}