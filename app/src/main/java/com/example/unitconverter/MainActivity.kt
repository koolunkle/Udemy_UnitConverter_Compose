package com.example.unitconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnitConverterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    UnitConverter(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


@Composable
fun UnitConverter(modifier: Modifier = Modifier) {
    var inputValue by remember { mutableStateOf("") }
    var outputValue by remember { mutableStateOf("") }

    var inputUnit by remember { mutableStateOf("Centimeters") }
    var outputUnit by remember { mutableStateOf("Meters") }

    var inputExpanded by remember { mutableStateOf(false) }
    var outputExpanded by remember { mutableStateOf(false) }

    val converterFactor = remember { mutableDoubleStateOf(0.01) }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Here all the UI elements  will be stacked below each other
        Text(text = "Unit Converter")
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = inputValue,
            onValueChange = {
                inputValue = it
                // Here goes what should happen, when the Value of our OutlinedTextField changes
            },
            label = { Text(text = "Enter Value") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Box {
                Button(
                    onClick = {}
                ) {
                    Text(text = "Select")
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down"
                    )
                }
                DropdownMenu(
                    expanded = false,
                    onDismissRequest = {}
                ) {
                    DropdownMenuItem(
                        text = { Text(text = "Centimeters") },
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = { Text(text = "Meters") },
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = { Text(text = "Feet") },
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = { Text(text = "Millimeters") },
                        onClick = {}
                    )
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Box {
                Button(
                    onClick = {}
                ) {
                    Text(text = "Select")
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down"
                    )
                }
                DropdownMenu(
                    expanded = false,
                    onDismissRequest = {}
                ) {
                    DropdownMenuItem(
                        text = { Text(text = "Centimeters") },
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = { Text(text = "Meters") },
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = { Text(text = "Feet") },
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = { Text(text = "Millimeters") },
                        onClick = {}
                    )
                }
            }
            // Here all the UI elements  will be stacked next to each other
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Result:")
    }
}

@Preview(showBackground = true)
@Composable
fun UnitConverterPreview() {
    UnitConverterTheme {
        UnitConverter()
    }
}