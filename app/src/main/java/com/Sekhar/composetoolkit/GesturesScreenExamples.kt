package com.Sekhar.composetoolkit


import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt



@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GestureExamples() {

    var dragX by remember { mutableStateOf(0f) }
    var dragY by remember { mutableStateOf(0f) }

    var scale by remember { mutableStateOf(1f) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {

        // 1. TAP
        Text("1. Tap Gesture")

        Box(
            modifier = Modifier
                .size(120.dp)
                .background(Color.Blue)
                .pointerInput(Unit) {
                    detectTapGestures(
                        onTap = {
                            println("Tapped")
                        }
                    )
                },
            contentAlignment = Alignment.Center
        ) {
            Text("Tap", color = Color.White)
        }

        // 2. DOUBLE TAP
        Text("2. Double Tap Gesture")

        Box(
            modifier = Modifier
                .size(120.dp)
                .background(Color.Red)
                .pointerInput(Unit) {
                    detectTapGestures(
                        onDoubleTap = {
                            println("Double Tapped")
                        }
                    )
                },
            contentAlignment = Alignment.Center
        ) {
            Text("Double Tap", color = Color.White)
        }

        // 3. LONG PRESS
        Text("3. Long Press Gesture")

        Box(
            modifier = Modifier
                .size(120.dp)
                .background(Color.Green)
                .pointerInput(Unit) {
                    detectTapGestures(
                        onLongPress = {
                            println("Long Pressed")
                        }
                    )
                },
            contentAlignment = Alignment.Center
        ) {
            Text("Long Press", color = Color.White)
        }

        // 4. SWIPE
        Text("4. Swipe Gesture")

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(Color.Magenta)
                .pointerInput(Unit) {
                    detectDragGestures(
                        onDragEnd = {
                            println("Swipe Completed")
                        }
                    ) { _, dragAmount ->

                        if (dragAmount.x > 20) {
                            println("Swiping Right")
                        }

                        if (dragAmount.x < -20) {
                            println("Swiping Left")
                        }
                    }
                },
            contentAlignment = Alignment.Center
        ) {
            Text("Swipe Left / Right", color = Color.White)
        }

        // 5. DRAG
        Text("5. Drag Gesture")

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color.LightGray)
        ) {

            Box(
                modifier = Modifier
                    .offset {
                        IntOffset(
                            dragX.roundToInt(),
                            dragY.roundToInt()
                        )
                    }
                    .size(80.dp)
                    .background(Color.Black)
                    .pointerInput(Unit) {
                        detectDragGestures { _, dragAmount ->
                            dragX += dragAmount.x
                            dragY += dragAmount.y
                        }
                    }
            )
        }

        // 6. SCROLL
        Text("6. Scroll Gesture")

        LazyColumn(
            modifier = Modifier
                .height(200.dp)
                .background(Color.Cyan)
        ) {

            items((1..30).toList()) {
                Text(
                    text = "Item $it",
                    modifier = Modifier.padding(12.dp)
                )
            }
        }

        // 7. PINCH ZOOM
        Text("7. Pinch Zoom Gesture")

        Box(
            modifier = Modifier
                .size((150 * scale).dp)
                .background(Color.DarkGray)
                .pointerInput(Unit) {

                    detectTransformGestures { _, _, zoom, _ ->
                        scale *= zoom
                    }
                },
            contentAlignment = Alignment.Center
        ) {
            Text("Pinch Zoom", color = Color.White)
        }
    }
}
