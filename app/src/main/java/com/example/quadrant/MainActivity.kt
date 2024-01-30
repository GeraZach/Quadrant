package com.example.quadrant

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun WeightModifierExampleTwo() {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.DarkGray)
                .weight(0.5f)
        ) {
            Box(contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.5f)
                    .background(Color(0xFFEADDFF))
            ) {
                Column(Modifier.align(Alignment.Center).padding(16.dp)) {
                    Text(text = "Text composable",
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "Displays text and follows the recommended Material Design guidelines.")
                }
            }
            Box(contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.5f)
                    .background(Color(0xFFD0BCFF))
            ) {
                Column(Modifier.align(Alignment.Center).padding(16.dp)) {
                    Text(text = "Image composable",
                        fontWeight = FontWeight.Bold)
                    Text(text = "Creates a composable that lays out and draws a given Painter class object.")
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.5f)
                    .background(Color(0xFFB69DF8))
            ) {
                Column(Modifier.align(Alignment.Center).padding(16.dp)) {
                    Text(text = "Row composable",
                        fontWeight = FontWeight.Bold)
                    Text(text = "A layout composable that places its children in a horizontal sequence.")
                }
            }
            Box(contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.5f)
                    .background(Color(0xFFF6EDFF))
            ) {
                Column(Modifier.align(Alignment.Center).padding(16.dp)) {
                    Text(text = "Column composable",
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify
                        )
                    Text(text = "A layout composable that places its children in a vertical sequence.\n",
                        textAlign = TextAlign.Justify,
                        )
                }
            }
        }
    }
}

