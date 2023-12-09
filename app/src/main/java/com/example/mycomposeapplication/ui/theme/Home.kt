package com.example.mycomposeapplication.ui.theme


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }

    @Preview(showBackground = true, widthDp = 200, heightDp = 200)
    @Composable
    fun text(name:String = "Hello"){
        Text(text = "$name Suresh Kumar Feature1")
        Text(text = "$name Asha Kumari Feature1")
    }
}