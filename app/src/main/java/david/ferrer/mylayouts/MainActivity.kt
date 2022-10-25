package david.ferrer.mylayouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import david.ferrer.mylayouts.ui.theme.MyLayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLayoutsTheme {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    elevation = 12.dp,
                    shape = MaterialTheme.shapes.small
                ) {
                    MyColumn()
                }

            }
        }
    }
}

@Composable
fun MyColumn(){
    Column {
        MyBox(Color.Red, "Ejemplo 1")
        Row {
            MyOtherBox(Color.Blue, "Ejemplo 2")
            MyOtherBox(Color.Green, "Ejemplo 3")
        }
        MyBox(Color.Yellow, "Ejemplo 4")

    }
}

@Composable
fun MyBox(nuevoColor: Color, nuevoTexto: String){
    Box (
        modifier = Modifier
            .fillMaxWidth()
            .background(nuevoColor)
            .height(261.dp),
        contentAlignment = Alignment.Center
            ){
        Text(text = nuevoTexto)
    }
}

@Composable
fun MyOtherBox(nuevoColor: Color, nuevoTexto: String){
    Box (
        modifier = Modifier
            .width(200.dp)
            .background(nuevoColor)
            .height(261.dp),
        contentAlignment = Alignment.Center
    ){
        Text(text = nuevoTexto)
    }
}

