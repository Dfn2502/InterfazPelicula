package com.example.interfazpelicula.ui.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.interfazpelicula.ui.moleculas.Mapa
import com.example.interfazpelicula.ui.moleculas.Vehiculos

@Composable
fun Pantalla(modificador: Modifier = Modifier){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
            .padding(8.dp)
    ) {
            Mapa(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            )
            Vehiculos(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            )

    }
}