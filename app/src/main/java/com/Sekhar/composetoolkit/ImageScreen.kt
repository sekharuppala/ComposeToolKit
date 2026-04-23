package com.Sekhar.composetoolkit

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@Composable
fun SimpleImage() {
    Image(
        painter = painterResource(id = R.drawable.img),
        contentDescription = "Sample Image",
        modifier = Modifier
            .padding(40.dp)
            .size(50.dp)
    )
}

@Composable
fun ImageWithSize() {
    Image(
        painter = painterResource(id = R.drawable.img_1),
        contentDescription = "Image with size",
        modifier = Modifier
            .padding(40.dp)
            .size(50.dp)
    )
} /////////Image With Size///////


@Composable
fun RoundedImage() {
    Image(
        painter = painterResource(id = R.drawable.img_2),
        contentDescription = "RoundedImage",
        modifier = Modifier
            .padding(60.dp)
            .size(55.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color.Black)



    )
    Text(
        text="Looking Good",
        textAlign = TextAlign.Center,
        fontSize=20.sp,
        color=Color.Blue,
        modifier = Modifier
            .padding(40.dp)
    )
//////Rounded Image//////
}


@Composable
fun CircleImage(){
    Image(
        imageVector = ImageVector.vectorResource(R.drawable.kotlin),
        contentDescription = "Circle Image",
        modifier=Modifier
            .padding(30.dp)
            .size(70.dp)
            .clip(CircleShape)
            .background(Color(0xC9B5FF22))

    )
}
//
//@Preview
//@Composable
//fun CropImage() {
//    Image(
//        imageVector = ImageVector.vectorResource(id = R.drawable.visual_studio),
//        contentDescription = "Crop Image",
//        contentScale = ContentScale.Crop,
//        modifier = Modifier
//            .padding(start = 40.dp, bottom = 30.dp)
//            .size(50.dp)
//    )//////Crop Image//////
//}


@Composable
fun NetworkImage(){
    AsyncImage(
        model="https://assets.raspberrypi.com/static/8c35cb5d5ab33531733f58e4dbde6402/d6f60/foundation.webp",
        contentDescription = "Network Image",
        modifier = Modifier
            .size(190.dp)
            .padding(10.dp)


    )///////Network Image////
}




