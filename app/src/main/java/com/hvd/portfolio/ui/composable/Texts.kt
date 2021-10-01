package com.hvd.portfolio.ui.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.hvd.portfolio.R


val vazirFontFamily = FontFamily(
    Font(R.font.vazir_regular_fd, FontWeight.Normal),
    Font(R.font.vazir_medium_fd, FontWeight.Medium),
    Font(R.font.vazir_bold_fd, FontWeight.Bold)
)

val montserratFontFamily = FontFamily(
    Font(R.font.montserrat_light, FontWeight.Light),
    Font(R.font.montserrat_regular, FontWeight.Normal),
    Font(R.font.montserrat_bold, FontWeight.Bold)
)

@Composable
fun VazirTextButton(text: String) {
    Box(
        Modifier
            .height(48.dp)
            .width(48.dp), Alignment.Center
    ) {
        VazirText(text, textAlign = TextAlign.Center)
    }
}

@Composable
fun MontserratTextButton(text: String, fontSize: TextUnit = TextUnit.Unspecified,) {
    Box(
        Modifier
            .height(48.dp)
            .width(48.dp), Alignment.Center
    ) {
        MontserratText(text, fontSize = fontSize, textAlign = TextAlign.Center)
    }
}

@Composable
fun VazirText(
    text: String,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = TextUnit.Unspecified,
    textAlign: TextAlign = TextAlign.Start
) {
    Text(
        text,
        modifier,
        textAlign = textAlign,
        fontFamily = vazirFontFamily,
        fontSize = fontSize
    )
}

@Composable
fun MontserratText(
    text: String,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontWeight: FontWeight? = null,
    textAlign: TextAlign = TextAlign.Start
) {
    Text(
        text,
        modifier,
        textAlign = textAlign,
        fontFamily = montserratFontFamily,
        fontSize = fontSize,
        fontWeight = fontWeight
    )
}
