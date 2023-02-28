package com.example.composecalculator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composecalculator.components.Calculator
import com.example.composecalculator.components.CalculatorState
import com.example.composecalculator.components.CalculatorViewModel
import com.example.composecalculator.ui.theme.ComposeCalculatorTheme
import com.example.composecalculator.ui.theme.MediumGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCalculatorTheme {
                val viewModel: CalculatorViewModel = viewModel()
               // val state = viewModel.viewModelScope

                val buttonSpacing = 8.dp
                var state = viewModel.state
                Calculator(
                    state = state,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MediumGray)
                        .padding(buttonSpacing),
                    onAction = {viewModel.onAction(action = it)}
                )
            }
        }
    }

}


