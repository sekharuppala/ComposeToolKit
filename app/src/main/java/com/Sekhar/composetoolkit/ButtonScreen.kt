package com.Sekhar.composetoolkit

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.icons.filled.Add  // ← ఇది ఉందా check చేయండి
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.foundation.layout.Column import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.width


@Composable
fun ButtonExample() {
    Column(
        modifier = Modifier.padding(30.dp)
    ) {
        Button(onClick = {
            println("Button Clicked")
        }) {
            Text(
                text = "Click Me",
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}


@Composable
fun ButtonWithModifier() {
    Button(
        onClick = {},
        shape =
            RoundedCornerShape(16.dp),
        modifier = Modifier.padding(30.dp)

    ) {
        Text(
            text = "లాగిన్",
            fontSize = 15.sp,
            fontStyle = FontStyle.Italic,
        )
        Spacer(modifier = Modifier.height(30.dp))

    }
}


//@Composable
//fun ButtonWithModifier() {
//    Button(
//        onClick= {},
//        modifier=Modifier.padding(100.dp),
//        shape=RoundedCornerShape(16.dp)
//
//    ){
//        Text("రద్దు చేయి")
//    }
//
//}


@Composable
fun ButtonWithColors() {
    Button(
        onClick = {},
        modifier = Modifier.padding(45.dp),
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Magenta,
            contentColor = Color.White,
        )

    ) {
        Text("రద్దు చేయి")
    }
}

@Composable
fun ButtonWithShape() {
    Button(
        onClick = { },
        modifier = Modifier.padding(60.dp),
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFFF5722),
            contentColor = Color.White
        )

    ) {
        Text("Text Button")
    }
    Text(
        text = "Button Screen Completed",
        color = Color.Blue,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.SemiBold,
        modifier = Modifier
            .padding(15.dp)

    )



}


@Composable
fun ButtonWithIcon() {
    Button(
        onClick = {},
        modifier = Modifier.padding(75.dp),
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Magenta,
            contentColor = Color.White
        )

    ) {
        Icon(Icons.Default.Add, contentDescription = "null")
        Spacer(modifier = Modifier.width(10.dp))
        Text("Button")


    }
}


@Composable
fun MyButton() {

    Column(
        modifier = Modifier.padding(15.dp)
    ) {
        Button(
            onClick = {
                println("Clicked Button")
            },
            modifier = Modifier
//                .width(180.dp)
////                .height(100.dp)
////                .padding(30.dp,20.dp,20.dp),
                .padding(top = 30.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2196F3),
                contentColor = Color.White

            )

        ) {
            Text(
                text = "Login",
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                fontStyle = FontStyle.Italic
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(5.dp)


            )

        }
        Text(
            text = "Button Screen Completed",
            color = Color.Blue,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(bottom = 60.dp)

        )
    }

}

