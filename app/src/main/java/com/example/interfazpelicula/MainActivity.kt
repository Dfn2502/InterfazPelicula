package com.example.interfazpelicula

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.interfazpelicula.ui.pantallas.Pantalla
import com.example.interfazpelicula.ui.pantallas.Pantalla2
import com.example.interfazpelicula.ui.theme.InterfazPeliculaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InterfazPeliculaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { padding_interno ->
                    Pantalla(
                        modificador = Modifier
                            .padding(padding_interno)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    InterfazPeliculaTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { padding_interno ->
            Pantalla2(modificador = Modifier.padding(padding_interno))
        }
    }
}