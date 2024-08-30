package com.example.day8

import CounterViewModel
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.day8.ui.theme.Day8Theme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState )
        val counterViewModel :CounterViewModel by viewModels()
        enableEdgeToEdge()
        setContent {
         CounterApp(counterViewModel)

            Day8Theme {
            }
            }
        }
    }
  @Composable
  fun CounterApp(counterViewModel: CounterViewModel){//takes counterViewModel as a parameter
      Column(modifier = Modifier.fillMaxSize(),
          horizontalAlignment = Alignment.CenterHorizontally,
          verticalArrangement = Arrangement.Center) {//all the aliases of the column

          Text(text = "Counter : ${counterViewModel.count.value}",
              fontSize = 24.sp,
              fontWeight = FontWeight.Bold)//counts the value of the function
          Spacer(modifier = Modifier.height(16.dp))

          Row {
              Button(onClick = { counterViewModel.increment()}) {
                  Text(text = "Increment")
              }

              Spacer(modifier = Modifier.width(16.dp))
              Button(onClick = { counterViewModel.decrement() }) {
                  Text(text = "Decrement")
              }

          }
      }

  }




