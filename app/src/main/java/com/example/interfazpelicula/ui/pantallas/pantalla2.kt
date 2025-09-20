package com.example.interfazpelicula.ui.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.interfazpelicula.ui.moleculas.Agente
import com.example.interfazpelicula.ui.moleculas.Camaras

@Composable
fun Pantalla2(modificador: Modifier = Modifier){
    Column(modifier = Modifier
        .background(Color.Blue )
        .fillMaxSize()) {
        Agente("Hamada","012A")
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        Agente("Lee","009A")
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        Agente("Miller","020A")
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        Agente("Meyers","007B")
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        Camaras()
    }
}