package com.example.composecalculator.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    onClick: () -> Unit) {
    Box(contentAlignment = Alignment.Center, modifier = modifier
        .clip(CircleShape)
        .clickable { onClick() }.then(modifier)) {

    }
}