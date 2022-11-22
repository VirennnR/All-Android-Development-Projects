package com.example.diceroll

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.diceroll.ui.theme.DiceRollTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceRollTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    dice()
                }
            }
        }
    }
}

@Composable
fun dice(){

    var click = remember {
        mutableStateOf(1)
    }

    var photo = painterResource(id = R.drawable.dice_1)

    when(click.value){
        
        1 -> photo = painterResource(id = R.drawable.dice_1)
        2-> photo = painterResource(id = R.drawable.dice_2)
        3-> photo = painterResource(id = R.drawable.dice_3)
        4-> photo = painterResource(id = R.drawable.dice_4)
        5-> photo = painterResource(id = R.drawable.dice_5)
        6-> photo =  painterResource(id = R.drawable.dice_6)
    }

    Row(modifier = Modifier.fillMaxWidth() ,
    horizontalArrangement = Arrangement.Center ) {

        Text(text = "Dice Roll App", fontSize = 40.sp, fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline ,
            textAlign = TextAlign.Center, color = colorResource(id = R.color.white),
            modifier = Modifier
                .padding(top = 50.dp)
                .fillMaxWidth()
                .background(color = colorResource(id = R.color.purple_500)))



    }
    Column(modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally ,
    verticalArrangement = Arrangement.Center) {

        Image(painter = photo , contentDescription = "1" )
        
        Spacer(modifier = Modifier.padding(top = 40.dp))
        Button(onClick = { click.value = (1..6).random()}) {

            Text(text = "Roll")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DiceRollTheme {
        dice()
    }
}