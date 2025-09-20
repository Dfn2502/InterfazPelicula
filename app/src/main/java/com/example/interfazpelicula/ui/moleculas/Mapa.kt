package com.example.interfazpelicula.ui.moleculas

import android.annotation.SuppressLint
import android.graphics.Color.blue
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.interfazpelicula.R


@SuppressLint("ResourceAsColor")
@Composable
fun Mapa(
    modifier: Modifier
){
    Column(
        modifier = modifier
            .background(Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Text("Isla Nublar - Tour Running", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(blue(1)))
        ) {
            Image(
                painter = painterResource(id = R.drawable.mapa),
                contentDescription = "Mapa de Isla Nublar",
                modifier = Modifier.fillMaxWidth()
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
        ){
            Row {
                Column(
                    modifier = Modifier
                        .weight(0.2f)
                ) {
                    Text(
                        "Level \n G",
                        color = Color.White,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                }
                Column(
                    modifier = Modifier
                        .weight(0.6f)
                ) {
                    Text("Galllmlmus Padock", color = Color.White, fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,modifier = Modifier.fillMaxWidth())
                }
                Column(
                    modifier = Modifier
                        .weight(0.2f)
                ) {
                    Text(
                        "Level \n G",
                        color = Color.White,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }

        }
    }
}
