package com.hvd.portfolio.ui.activity.main

import androidx.compose.foundation.Image
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hvd.portfolio.R
import com.hvd.portfolio.ui.composable.MontserratText

@Composable
fun TopHeader() {
    Column {
        TopRow()

        MontserratText(
            stringResource(R.string.ehsanLineBreakHasanvand),
            Modifier.padding(16.dp, 0.dp),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
        )

        MontserratText(stringResource(R.string.abountMe),
            Modifier.padding(16.dp, 0.dp),
            fontSize = 12.sp,
            textAlign = TextAlign.Justify,
            color = Color.Gray)

        ContactButtons()
    }
}

@Composable
fun TopRow() {
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

        Image(
            painterResource(R.drawable.iran_sq),
            modifier = Modifier
                .size(32.dp)
                .padding(2.dp)
                .clip(RoundedCornerShape(10.dp))
                .padding(2.dp), contentDescription = "Fa",
        )
        Spacer(Modifier.width(16.dp))
        Icon(
            Icons.Filled.Bedtime,
            modifier = Modifier
                .size(32.dp)
                .padding(2.dp), contentDescription = "Night mode",
            tint = colorResource(R.color.iconTintColor)
        )
    }
}

