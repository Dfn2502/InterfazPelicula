import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun pantalla3(modificador: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        // Encabezado
        Text(
            text = "MU/TH/UR 6000",
            color = Color(0xFF00FF00), // Verde fosforescente
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Bloque estilo "consola"
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(12.dp)
        ) {
            Text(
                text = "HELLO 67.103.151.117",
                color = Color(0xFF00FF00),
                fontSize = 16.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier.padding(vertical = 4.dp)
            )
            Text(
                text = "NEXT QUERY",
                color = Color(0xFF00FF00),
                fontSize = 16.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier.padding(vertical = 4.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "EMERGENCY COMMAND OVERRIDE 100375",
                color = Color(0xFF00FF00),
                fontSize = 16.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier.padding(vertical = 4.dp)
            )
            Text(
                text = "NEW MISSION DIRECTIVE TO INVESTIGATE LIFE FORM",
                color = Color(0xFF00FF00),
                fontSize = 16.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier.padding(vertical = 4.dp)
            )
            Text(
                text = "INVESTIGATE: LIFE FORM. GATHER SPECIMEN.",
                color = Color(0xFF00FF00),
                fontSize = 16.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier.padding(vertical = 4.dp)
            )
            Text(
                text = "PRIORITY ONE",
                color = Color(0xFF00FF00),
                fontSize = 16.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier.padding(vertical = 4.dp)
            )
            Text(
                text = "INSURE RETURN OF ORGANISM FOR ANALYSIS",
                color = Color(0xFF00FF00),
                fontSize = 16.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier.padding(vertical = 4.dp)
            )
            Text(
                text = "ALL OTHER CONSIDERATIONS SECONDARY",
                color = Color(0xFF00FF00),
                fontSize = 16.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier.padding(vertical = 4.dp)
            )
            Text(
                text = "CREW EXPENDABLE",
                color = Color(0xFF00FF00),
                fontSize = 16.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier.padding(vertical = 4.dp)
            )
        }
    }
}