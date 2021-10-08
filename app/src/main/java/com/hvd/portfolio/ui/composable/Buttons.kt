package com.hvd.portfolio.ui.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
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
fun ButtonText(text: String){
    MontserratText(
        text,
        textAlign = TextAlign.Center,
        color = Color.White,
        maxLines = 1,
        fontSize = 13.sp
    )
}
