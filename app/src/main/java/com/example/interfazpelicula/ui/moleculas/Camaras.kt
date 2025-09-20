package com.example.interfazpelicula.ui.moleculas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.interfazpelicula.R

@Composable
fun Camaras(){
    Row(modifier = Modifier.
    fillMaxWidth()
        .height(100.dp)) {
        Image(
            painter =  painterResource(id = R.drawable.camara1),
            contentDescription = "Camara1",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .weight(0.5f)
                .align((Alignment.CenterVertically))

        )
        Image(
            painter =  painterResource(id = R.drawable.camara2),
            contentDescription = "Camara 2",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .weight(0.5f)
                .align((Alignment.CenterVertically))
        )

    }
}