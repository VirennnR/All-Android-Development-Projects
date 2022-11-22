package com.example.mybirthday

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.magnifier
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mybirthday.ui.theme.MyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    screen()
                }
            }
        }
    }
}

@Composable
fun screen(){

    Image(painter = painterResource(id = R.drawable.androidparty),
        contentDescription = "Birthday party" ,
        //modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop)

    Column(modifier = Modifier.fillMaxWidth() ,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = "Happy Birthday...!" , fontSize = 40.sp , fontWeight = FontWeight.Bold ,
        modifier = Modifier.padding(top = 30.dp))
        Text(text = "from - Virender" , fontSize = 34.sp )


    }
    
    
    
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyBirthdayTheme {
        screen()
    }
}