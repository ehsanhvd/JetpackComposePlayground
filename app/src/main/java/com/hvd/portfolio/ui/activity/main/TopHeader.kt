package com.hvd.portfolio.ui.activity.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bedtime
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hvd.portfolio.R
import com.hvd.portfolio.ui.composable.MontserratText
import com.hvd.portfolio.ui.composable.VazirText

@Composable
fun TopHeader(isNightMode: Boolean, nightModeChanged: (Boolean) -> Unit) {
    Column {
        TopRow(isNightMode, nightModeChanged)

        MontserratText(
            stringResource(R.string.ehsanLineBreakHasanvand),
            Modifier.padding(16.dp, 0.dp),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(if (isNightMode) R.color.iconTintColorWhite else R.color.iconTintColor)
        )

        MontserratText(
            stringResource(R.string.abountMe),
            Modifier.padding(16.dp, 0.dp),
            fontSize = 12.sp,
            color = Color.Gray
        )

        ContactButtons()
    }
}

@Composable
fun TopRow(isNightModeCurrent : Boolean, nightModeChanged: (Boolean) -> Unit) {
    Row(
        Modifier
            .height(56.dp)
            .fillMaxWidth()
            .padding(16.dp, 8.dp, 16.dp, 8.dp), Arrangement.Center, Alignment.CenterVertically
    )

    {

        Image(
            painterResource(id = R.drawable.image), stringResource(R.string.profileImage),
            Modifier.clip(RoundedCornerShape(8.dp))
        )

        Spacer(modifier = Modifier.weight(1f))

        VazirText(
            text = "فارسی",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = if (isNightModeCurrent) Color.White else colorResource(R.color.iconTintColor)
        )
        Spacer(Modifier.width(16.dp))
        Icon(
            Icons.Filled.Bedtime,
            modifier = Modifier
                .size(32.dp)
                .padding(2.dp)
                .clickable {
                    nightModeChanged(!isNightModeCurrent)
                }, contentDescription = "Night mode",
            tint = if (isNightModeCurrent) colorResource(R.color.iconTintColorYello) else colorResource(R.color.iconTintColor)
        )
    }
}

