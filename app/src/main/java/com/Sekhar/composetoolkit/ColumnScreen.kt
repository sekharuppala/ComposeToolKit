package com.Sekhar.composetoolkit

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun ColumnExample(){
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
//        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(30.dp)
    ) {
        Text(
            text="Sekhar",
            fontSize=25.sp,
            color=Color.Blue,
            fontStyle=FontStyle.Italic
        )

        Spacer(modifier=Modifier.width(20.dp))

        Text(
            text="Nag",
            fontSize=25.sp,
            fontWeight= FontWeight.Bold,
            color=Color.Green,
            fontStyle=FontStyle.Italic


        )
        Spacer(modifier=Modifier.width(20.dp))

        Button(
            onClick = {},
            modifier = Modifier.padding(10.dp),
            shape= RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFF5722),
                contentColor = Color.White
            )
        ) {
            Text("Login")
        }

        Spacer(modifier = Modifier.width(20.dp))

        Image(
            painter= painterResource(id=R.drawable.visual_studio),
            contentDescription = "null",
            modifier=Modifier
                .padding(10.dp)
                .size(35.dp)
                .clip(RoundedCornerShape(30.dp))
        )
        Spacer(modifier = Modifier.width(8.dp))


    }
}

@Preview
@Composable
fun Text() {
    Text(
        text="Hello Compose",
        fontSize=30.sp,
        fontWeight= FontWeight.Bold,
        fontStyle=FontStyle.Italic,
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(20.dp),
        color=Color.Red
    )
}


