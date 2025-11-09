package com.example.transportdocsmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import com.example.transportdocsmanager.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Surface {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Text(
        text = "Welcome to TransportDocsManager 🚛",
        style = MaterialTheme.typography.headlineMedium
    )
}
