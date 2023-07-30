package com.example.counterkt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.counterkt.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        var counter by remember { mutableStateOf(0) }
                        Text(
                            text = "Tap Counter",
                            style = MaterialTheme.typography.headlineLarge,
                        )

                        Text(
                            text = "$counter",
                            style = MaterialTheme.typography.displayLarge
                        )
                        Row {
                            Button(onClick = {
                                counter++
                            }) {

                                Icon(
                                    imageVector = Icons.Default.Favorite,
                                    contentDescription = "Tap"
                                )
                                Spacer(Modifier.width(10.dp))
                                Text(
                                    text = "Tap me!",
                                    style = MaterialTheme.typography.bodyLarge,
                                    )
                            }
                            Spacer(Modifier.width(10.dp))
                            Button(onClick = {
                                counter = 0
                            }) {
                                Icon(
                                    imageVector = Icons.Default.Favorite,
                                    contentDescription = "reset"
                                )
                                Spacer(Modifier.width(10.dp))
                                Text(
                                    text = "Reset",
                                    style = MaterialTheme.typography.bodyLarge,
                                )


                            }

                        }
                    }
                }
            }
        }
    }
}

