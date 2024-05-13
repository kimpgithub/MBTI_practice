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

class EntjActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MBTI_practiceTheme {
                EntjDescription()
            }
        }
    }
}


@Composable
fun EntjDescription() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_entj),
                contentDescription = "img_entj"
            )
        }

        Text(
            text = "The Commander (ENTJ): Decisive Leaders and Strategic Minds",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 20.dp, bottom = 16.dp)
        )

        Text(
            text = "ENTJs, also known as Commanders, are natural-born leaders with a clear vision and a drive to achieve it. They possess a sharp intellect, strategic thinking, and a decisive nature. ENTJs excel at analyzing situations, developing effective plans, and inspiring others to take action. They are confident and assertive, making them effective leaders who can navigate complex challenges.",
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
