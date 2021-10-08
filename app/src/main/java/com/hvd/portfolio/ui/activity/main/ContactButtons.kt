package com.hvd.portfolio.ui.activity.main

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.hvd.portfolio.R
import com.hvd.portfolio.ui.composable.GradientPainterButton

@Composable
fun ContactButtons() {
    val callButtonBrush = Brush.horizontalGradient(listOf(Color(0xFF28D8A3), Color(0xFF00BEB2)))

    val linkedInButtonBrush = Brush.horizontalGradient(listOf(
        colorResource(R.color.linkedInLeftColor),
        colorResource(R.color.linkedInRightColor)))

    val telegramButtonBrush = Brush.horizontalGradient(listOf(
        colorResource(R.color.telegramLeftColor),
        colorResource(R.color.telegramRightColor)))

    Row(Modifier.padding(16.dp)) {
        Column(Modifier.weight(1f)) {
            GradientPainterButton(
                stringResource(R.string.call),
                rememberVectorPainter(Icons.Filled.Call),
                callButtonBrush
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column(Modifier.weight(1f)) {
            GradientPainterButton(
                stringResource(R.string.linkedIn),
                painterResource(R.drawable.ic_linkedin),
                linkedInButtonBrush,
                PaddingValues(1.dp)
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column(Modifier.weight(1f)) {
            GradientPainterButton(
                stringResource(R.string.telegram),
                painterResource(R.drawable.ic_telegram),
                telegramButtonBrush,
                PaddingValues(2.dp)
            )
        }
    }
}
