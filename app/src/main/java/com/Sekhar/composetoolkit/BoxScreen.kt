package com.Sekhar.composetoolkit


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CheckboxDefaults.colors
import androidx.compose.material3.DrawerDefaults.shape
import androidx.compose.ui.Alignment
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun Box1() {
    Box(
        modifier = Modifier
            .padding(30.dp)
            .background(Color.LightGray)
            .fillMaxWidth()
            .height(145.dp),
        contentAlignment = Alignment.Center


    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.visual_studio),
                contentDescription = "null",
                modifier = Modifier
                    .size(40.dp)
            )


            Button(
                onClick = {},
                modifier = Modifier.padding(25.dp),
                shape = RoundedCornerShape(18.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Magenta,
                    contentColor = Color.White,
                )
            ) {
                Text(
                    text = "Start",


                    )

            }
        }
    }
}


@Preview
@Composable
fun Box2() {
    Box(
        modifier = Modifier
            .padding(30.dp)
            .background(Color.LightGray)
            .fillMaxWidth()
            .height(145.dp),
        contentAlignment = Alignment.Center


    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {

            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "null",
                modifier = Modifier
                    .size(40.dp)
            )


            Button(
                onClick = {},
                modifier = Modifier.padding(25.dp),
                shape = RoundedCornerShape(18.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Magenta,
                    contentColor = Color.White,
                )
            ) {
                Text(
                    text = "End",
                    fontStyle = FontStyle.Italic


                )

            }
        }
    }
}


