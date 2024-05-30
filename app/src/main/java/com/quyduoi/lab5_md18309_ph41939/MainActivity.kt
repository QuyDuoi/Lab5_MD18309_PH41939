package com.quyduoi.lab5_md18309_ph41939

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.quyduoi.lab5_md18309_ph41939.ui.theme.Lab5_MD18309_PH41939Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab5_MD18309_PH41939Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Lab5_MD18309_PH41939()
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Lab5_MD18309_PH41939() {
    val context = LocalContext.current
    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "Lab 5 - MD18309 - PH41939", fontSize = 25.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            context.startActivity(Intent(context, Bai1_Lab5::class.java))
        }, modifier = Modifier
            , shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color.Blue)) {
            Text(text = "Bài 1 - Lab 5", fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            context.startActivity(Intent(context, Bai2_Lab5::class.java))
        }, modifier = Modifier
            , shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color.Blue)) {
            Text(text = "Bài 2 - Lab 5", fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            context.startActivity(Intent(context, Bai3_Lab5::class.java))
        }, modifier = Modifier
            , shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color.Blue)) {
            Text(text = "Bài 3 - Lab 5", fontSize = 20.sp)
        }
    }
}