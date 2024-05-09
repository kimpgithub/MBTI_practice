import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import android.content.Context
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.mbti_practice.R
import kotlin.random.Random

@Preview
@Composable
fun MBTIScreenPreview() {
    MBTIScreen()
}

@Composable
fun MBTIScreen() {
    // MBTI 타입과 설명 데이터
    val context = LocalContext.current
    val mbtiTypes = listOf(
        "INTJ" to Pair("Architect", R.drawable.img_intj),
        "INTP" to Pair("Logician", R.drawable.img_intp),
        "ENTJ" to Pair("Commander", R.drawable.img_entj),
        "ENTP" to Pair("Debater", R.drawable.img_entp),
        "INFJ" to Pair("Advocate", R.drawable.img_infj),
        "INFP" to Pair("Mediator", R.drawable.img_infp),
        "ENFJ" to Pair("Protagonist", R.drawable.img_enfj),
        "ENFP" to Pair("Campaigner", R.drawable.img_enfp),
        "ISTJ" to Pair("Logistician", R.drawable.img_istj),
        "ISFJ" to Pair("Defender", R.drawable.img_isfj),
        "ESTJ" to Pair("Executive", R.drawable.img_estj),
        "ESFJ" to Pair("Consul", R.drawable.img_esfj),
        "ISTP" to Pair("Virtuoso", R.drawable.img_istp),
        "ISFP" to Pair("Adventurer", R.drawable.img_isfp),
        "ESTP" to Pair("Entrepreneur", R.drawable.img_estp),
        "ESFP" to Pair("Entertainer", R.drawable.img_esfp)
    )

    // 랜덤으로 선택된 유형의 인덱스
    var selectedTypeIndex by remember { mutableStateOf(Random.nextInt(mbtiTypes.size)) }
    val selectedType = mbtiTypes[selectedTypeIndex].first
    val selectedDescription = mbtiTypes[selectedTypeIndex].second.first
    val selectedImageResId = mbtiTypes[selectedTypeIndex].second.second

    Column(modifier = Modifier.fillMaxSize()) {
        Button(
            onClick = { selectedTypeIndex = Random.nextInt(mbtiTypes.size) },
            modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 16.dp)
        ) {
            Text(text = "Select Random MBTI Type")
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = selectedImageResId),
                contentDescription = "$selectedType image"
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = selectedDescription,
                fontSize = 18.sp
            )
        }
    }
}
