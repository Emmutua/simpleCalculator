package com.example.composecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.example.composecalculator.components.Calculator
import com.example.composecalculator.components.CalculatorViewModel
import com.example.composecalculator.ui.theme.ComposeCalculatorTheme
import com.example.composecalculator.ui.theme.MediumGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCalculatorTheme {
//                val viewModel = ViewModel<CalculatorViewModel>()
//                //val vm = viewModel<CalculatorViewModel>()
//                val viewModelObj = CalculatorViewModel()
//                val state = viewModel.
                val buttonSpacing = 8.dp
                MyApp()
            }
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun MyApp() {
    Calculator(
        state = CalculatorViewModel().state,
        modifier = Modifier
            .fillMaxSize()
            .background(MediumGray)
            .padding(16.dp),
        onAction = { CalculatorViewModel().onAction(action = it)}
    )
}

