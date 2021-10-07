package com.hvd.portfolio.ui.composable

import androidx.compose.foundation.layout.*
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
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
fun MontserratTextButton(text: String, fontSize: TextUnit = TextUnit.Unspecified) {
    Box(
        Modifier
            .height(56.dp)
            .width(56.dp), Alignment.Center
    ) {
        MontserratText(
            text,
            Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            fontSize = fontSize,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun MontserratText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current
) {
    Text(
        text,
        modifier,
        color,
        fontSize,
        fontStyle,
        fontWeight,
        montserratFontFamily,
        letterSpacing,
        textDecoration,
        textAlign,
        lineHeight,
        overflow,
        softWrap,
        maxLines,
        onTextLayout,
        style
    )
}
@Composable
fun VazirText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current
) {
    Text(
        text,
        modifier,
        color,
        fontSize,
        fontStyle,
        fontWeight,
        vazirFontFamily,
        letterSpacing,
        textDecoration,
        textAlign,
        lineHeight,
        overflow,
        softWrap,
        maxLines,
        onTextLayout,
        style
    )
}
