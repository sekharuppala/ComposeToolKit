package com.Sekhar.composetoolkit


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun StateTestScreen() {

    var UserName by rememberSaveable { mutableStateOf("") }
    var Password by rememberSaveable { mutableStateOf("") }
    var OTP by rememberSaveable { mutableStateOf("") }



    Box(
        modifier = Modifier
            .padding(25.dp)
            .fillMaxSize()
            .clip(RoundedCornerShape(39.dp))
            .background(Color.White),

    ) {


        Column(
            modifier = Modifier.padding(50.dp),

            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = UserName,
                onValueChange = { UserName = it },
                shape = RoundedCornerShape(16.dp),
                label = {
                    Text(
                        text = "UserName",
                        textAlign = TextAlign.Center
                    )
                },

                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.user),
                        contentDescription = "icon",
                        modifier = Modifier.size(15.dp)
                    )
                }

            )

            Spacer(modifier = Modifier.height(60.dp))


            OutlinedTextField(
                value = Password,
                onValueChange = { Password = it },
                label = {
                    Text(
                        text = "Password",
                        textAlign = TextAlign.Center
                    )
                },

                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.password),
                        contentDescription = "icon",
                        modifier = Modifier.size(15.dp)
                    )
                },
                shape = RoundedCornerShape(16.dp)


            )

            Spacer(modifier = Modifier.height(60.dp))


            OutlinedTextField(
                value = OTP,
                onValueChange = { OTP = it },

                label = {
                    Text("Otp")
                },
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.img_3),
                        contentDescription = "icon",
                        modifier = Modifier.size(15.dp)
                    )
                },

                shape = RoundedCornerShape(16.dp)
            )





            Button(
                onClick = { },
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .size(40.dp)
                    .padding(40.dp),
                colors = ButtonDefaults.buttonColors(

                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = Color.Black
                )


            ) {
                Text("Login")


            }


        }


    }

}




















































