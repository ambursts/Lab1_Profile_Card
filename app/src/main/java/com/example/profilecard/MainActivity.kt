package com.example.profilecard

//searched after coding what extra imports I needed
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profilecard.ui.theme.ProfileCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //searched hex for navy since i wanted that as background color to pink profile
            ProfileCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),

                    color = Color(0xFF1B2A4A)
                ) {
                    ProfileCard()
                }
            }
        }
    }
}
//separate composable per instructions
//made for layout of profile card
@Composable
fun ProfileCard() {
    Column(
        modifier = Modifier
            //looked into best places to put MaxWidth
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        //pulled and matched from Unit 1, Pathway 3 for majority
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "Profile picture",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Amber Boyd",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Hello, my name is Amber and I am currently in school working towards three Associate Degrees and a Masters. It is very difficult but I am very thankful for the support I get from my friends, family, and teachers.",
            fontSize = 15.sp,
            color = Color(0xFFB0BEC5),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
        )
    }
}