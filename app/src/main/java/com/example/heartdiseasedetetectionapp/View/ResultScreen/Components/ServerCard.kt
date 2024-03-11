package com.example.heartdiseasedetetectionapp.View.ResultScreen.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.heartdiseasedetetectionapp.R

@Composable
fun ServerCard(server: String){

    Card(
        modifier = Modifier
            .height(100.dp)
            .width(300.dp)
            .background(Color.Transparent),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(colorResource(id = R.color.border1)),
        elevation = CardDefaults.cardElevation(10.dp)
    ){
        Box(modifier = Modifier.fillMaxSize().padding(10.dp), contentAlignment = Alignment.Center) {
            Text(server, fontSize = 25.sp, color = Color.White, textAlign = TextAlign.Center, fontWeight = FontWeight.Medium)
        }
    }
}