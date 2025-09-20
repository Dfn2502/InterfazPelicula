package com.example.interfazpelicula.ui.moleculas

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.interfazpelicula.R

@SuppressLint("SuspiciousIndentation")
@Composable
fun Vehiculos(
    modifier: Modifier
){
    val funcionHold = null
    val funcionPlay = null
    val funcionStop = null
    val funcionQuit = null
    val funcionNew = null
    val funcionNext = null
    val funcionAtrasar = null
    val funcionAdelantar = null

        Column(
            modifier = modifier
                .background(Color.Gray),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row{
                Text("Vehicle   Time    Power   Tour", textAlign = TextAlign.Center,fontSize = 20.sp,color = Color.White)
            }
            Image(
                painter = painterResource(id = R.drawable.vehicle_status),
                contentDescription = "Estatus de vehiculo",
                modifier = Modifier.fillMaxWidth()
            )
            Column(modifier = Modifier.fillMaxWidth()){
                Row {


                    Button(modifier = Modifier.weight(0.3f), onClick = { funcionHold }){
                        Text("HOLD")
                    }
                    Button(modifier = Modifier.weight(0.3f), onClick = { funcionQuit }){
                        Text("QUIT")
                    }
                    Button(modifier = Modifier.weight(0.3f), onClick = { funcionNew }){
                        Text("NEW")
                    }
                }
                Row {
                    Button(modifier = Modifier.weight(0.3f), onClick = { funcionNext }){
                        Text("NEXT")
                    }
                    Button(modifier = Modifier.weight(0.175f), onClick = { funcionAtrasar }){
                        Text("<")
                    }
                    Button(modifier = Modifier.weight(0.175f), onClick = { funcionAdelantar }){
                        Text(">")
                    }
                    Button(modifier = Modifier.weight(0.175f), onClick = { funcionPlay }){
                        Text("PLAY", fontSize = 7.sp)
                    }
                    Button(modifier = Modifier.weight(0.175f), onClick = { funcionStop }){
                        Text("STOP",fontSize = 7.sp)
                    }

                }
            }

        }



}