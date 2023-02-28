package com.example.composecalculator.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecalculator.ui.theme.LightGray
import com.example.composecalculator.ui.theme.Orange

@Composable
fun Calculator(
    state: CalculatorState,
    buttonSpacing: Dp = 8.dp,
    modifier: Modifier,
    onAction: (CalculatorAction) -> Unit
) {
    Box(modifier = Modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.number1 + (state.operation ?: "") + state.number2,
                //text = state.number1 + state.operation ?: "" + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                color = Color.Black,
                fontSize = 70.sp,
                maxLines = 2
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "AC", LightGray,modifier = Modifier
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {onAction(CalculatorAction.Clear)}
                )
                CalculatorButton(
                    symbol = "Del", LightGray, modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Delete)}
                )
                CalculatorButton(
                    symbol = "/",Orange, modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Operation(CalculatorOperation.Divide))}
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "7", Color.DarkGray, modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Number(7))}
                )
                CalculatorButton(
                        symbol = "8",Color.DarkGray, modifier = Modifier
                .aspectRatio(1f)
                .weight(1f),
                onClick = {onAction(CalculatorAction.Number(8))}
                )
                CalculatorButton(
                    symbol = "9",Color.DarkGray, modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Number(9))}
                )
                CalculatorButton(
                    symbol = "X", Orange, modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))}
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "4",Color.DarkGray, modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Number(4))}
                )
                CalculatorButton(
                    symbol = "5", Color.DarkGray,modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Number(5))}
                )
                CalculatorButton(
                    symbol = "6",Color.DarkGray, modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Number(6))}
                )
                CalculatorButton(
                    symbol = "-", Orange,modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))}
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "1",Color.DarkGray,modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Number(1))}
                )
                CalculatorButton(
                    symbol = "2",Color.DarkGray, modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Number(2))}
                )
                CalculatorButton(
                    symbol = "3",Color.DarkGray, modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Number(3))}
                )
                CalculatorButton(
                    symbol = "+", Orange, modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Operation(CalculatorOperation.Add))}
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "0", Color.DarkGray,modifier = Modifier
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {onAction(CalculatorAction.Number(0))}
                )
                CalculatorButton(
                    symbol = ".",Color.DarkGray, modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Decimal)}
                )
                CalculatorButton(
                    symbol = "=", Orange, modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Calculate)}
                )
            }
        }
    }
}