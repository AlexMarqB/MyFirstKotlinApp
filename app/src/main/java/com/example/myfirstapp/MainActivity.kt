package com.example.myfirstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstapp.ui.theme.MyFirstAppTheme

//Starting point for our app
class MainActivity : /*Behave like ->*/ ComponentActivity() {
    //Overrides the default function "onCreate"
    override fun onCreate(savedInstanceState: Bundle? /*Settings*/) {
        //Execute the default onCreate and than execute what we write
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize() /*This surface must occupy the whole screen*/,
                    color = MaterialTheme.colorScheme.background /*Use the colors from the theme*/) {
                    //Composable or component => Are elements that we can see on the screen
                    Greeting("Alex") //Text that appears on the screen from the component
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Welcome $name!",
            modifier = modifier
    )
}

//Quick testing without restarting the whole app
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstAppTheme {
        Greeting("Alex")
    }
}