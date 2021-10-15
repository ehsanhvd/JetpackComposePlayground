package com.hvd.portfolio.ui.activity.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hvd.portfolio.R
import com.hvd.portfolio.ui.composable.MontserratText

@Preview
@Composable
fun ExperiencesView() {
    Card(
        modifier = Modifier.padding(8.dp),
        backgroundColor = Color.White,
        shape = RoundedCornerShape(12.dp),
        elevation = 2.dp
    ) {
        Row(Modifier.padding(5.dp)) {
            Image(
                painterResource(id = R.drawable.ic_negah_logotype), "",
                Modifier
                    .clip(CircleShape)
                    .size(48.dp)
            )

            Spacer(modifier = Modifier.width(5.dp))

            Column {
                MontserratText(text = "Negah bank", fontSize = 20.sp)
                MontserratText(text = "Full time, 11 mos", fontSize = 14.sp)
            }

        }

    }
}
