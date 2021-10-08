package com.hvd.portfolio.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hvd.portfolio.R

@Composable
fun MontserratSmallButton(text: String) {
    Button(
        onClick = {},
        Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(25.dp),
        colors = ButtonDefaults.buttonColors(colorResource(R.color.purple_700))
    ) {

        MontserratText(text, color = Color.White, maxLines = 1, fontSize = 13.sp)

    }
}

@Composable
fun GradientPainterButton(text: String, painter: Painter, buttonBrush: Brush, iconPaddingValues: PaddingValues = PaddingValues()) {

    Surface(
        Modifier
            .fillMaxWidth()
            .height(42.dp),
        elevation = 5.dp,
        shape = RoundedCornerShape(25.dp)
    ) {
        Row(
            Modifier
                .background(buttonBrush)
                .padding(10.dp, 0.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter,
                modifier = Modifier
                    .width(16.dp)
                    .height(16.dp).padding(iconPaddingValues), contentDescription = "Night mode",
                tint = Color.White
            )
            ButtonText(text)
        }
    }
}

@Composable
fun ButtonText(text: String){
    MontserratText(
        text = text,
        style = TextStyle(color = Color.White),
        modifier = Modifier.fillMaxWidth(1f),
        textAlign = TextAlign.Center,
        fontSize = 14.sp
    )
}
