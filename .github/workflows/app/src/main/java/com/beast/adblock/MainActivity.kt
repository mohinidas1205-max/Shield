package com.beast.adblock
import android.os.*
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(modifier = Modifier.fillMaxSize(), color = Color.Black) {
                Column(modifier = Modifier.padding(24.dp)) {
                    Text("THE BEAST", color = Color.Red, style = MaterialTheme.typography.displayMedium)
                    Text("V6 // STATUS: HUNTING", color = Color.Gray)
                    
                    Spacer(modifier = Modifier.height(30.dp))
                    
                    // Stats Box
                    Text("1,346 ADS KILLED", color = Color.Red)
                    Text("450 MB DATA SAVED", color = Color.Red)
                    
                    Spacer(modifier = Modifier.weight(1f))
                    
                    // Timer Slider
                    var time by remember { mutableStateOf(60f) }
                    Text("TIMER: ${time.toInt()} MIN", color = Color.White)
                    Slider(value = time, onValueChange = {time = it}, valueRange = 0f..480f)
                    
                    Button(onClick = {}, colors = ButtonDefaults.buttonColors(containerColor = Color.Red), modifier = Modifier.fillMaxWidth()) {
                        Text("UNLEASH", color = Color.Black)
                    }
                }
            }
        }
    }
}
