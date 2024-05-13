package com.example.mbti_practice

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mbti_practice.ui.theme.MBTI_practiceTheme
import androidx.compose.ui.text.font.FontWeight  // Import added

class EnfjActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MBTI_practiceTheme {
                EnfjDescription()
            }
        }
    }
}


@Composable
fun EnfjDescription() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_enfj),
                contentDescription = "img_enfj"
            )
        }

        Text(
            text = "The Protagonist (ENFJ): Inspiring Hearts and Guiding Souls",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 20.dp, bottom = 16.dp)
        )

        Text(
            text = "ENFJs, also known as Protagonists, are charismatic and visionary leaders. They possess a rare blend of warmth, empathy, and strategic thinking. Driven by a desire to help others reach their full potential, ENFJs excel at understanding people and fostering deep connections.",
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        val context = LocalContext.current as? Activity
        Button(
            onClick = { context?.finish() },
            modifier = Modifier.fillMaxWidth(), // Use fillMaxWidth for centering
        ) {
            Text(text = "닫기")
        }
    }
}
