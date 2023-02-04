package com.example.composecalculator.components
//view model - accept the state of changes of UI
data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation ? = null
)
