package com.hvd.portfolio.ui.activity.main

import android.content.Context
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hvd.portfolio.R
import com.hvd.portfolio.ui.composable.MontserratText

@Composable
fun ExperiencesViewColumn(isNightMode: Boolean) {
    Column(Modifier.padding(5.dp)) {
        ExperiencesView(
            "Negah Bank",
            "Full time, 1 yr",
            R.drawable.ic_negah_banner,
            ContentScale.Crop,
            isNightMode
        )
        ExperiencesView(
            "Hooshmand Sepehr",
            "Full time, 1 yr",
            R.drawable.ic_hooshmand_sepehr,
            ContentScale.Inside,
            isNightMode
        )
        ExperiencesView(
            "Maadiran",
            "Full time, 1 yr 3 mos",
            R.drawable.ic_maadiran,
            ContentScale.Inside,
            isNightMode
        )
        ExperiencesView(
            "Jhoobin",
            "Full time, 2 yrs",
            R.drawable.ic_jhoobin,
            ContentScale.Inside,
            isNightMode
        )
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ExperiencesView(
    title: String,
    subtitle: String,
    @DrawableRes icon: Int,
    contentScale: ContentScale,
    isNightMode: Boolean
) {
    val context: Context = LocalContext.current

    val cardInteractionSource = remember { MutableInteractionSource() }

    Card(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth(),
        backgroundColor = if (isNightMode) colorResource(R.color.darkerGrey) else Color.White,
        shape = RoundedCornerShape(12.dp),
        elevation = 2.dp,
        interactionSource = cardInteractionSource,
        indication = rememberRipple(),
        onClick = {
            Toast.makeText(context, "Not implemented", Toast.LENGTH_SHORT).show()
        }
    ) {
        Row(
            Modifier
                .padding(3.dp)
                .height(64.dp)
        ) {
            Image(
                painterResource(id = icon), "",
                Modifier
                    .clip(RoundedCornerShape(10.dp, 0.dp, 0.dp, 10.dp))
                    .fillMaxHeight()
                    .aspectRatio(1f)
                    .background(Color.White),
                contentScale = contentScale
            )

            Spacer(modifier = Modifier.width(5.dp))

            Column(Modifier.fillMaxHeight()) {
                MontserratText(
                    text = title,
                    fontSize = 20.sp,
                    color = if (isNightMode) Color.White else colorResource(R.color.iconTintColor), )
                Spacer(modifier = Modifier.weight(1f))
                MontserratText(
                    text = subtitle, fontSize = 14.sp, color = colorResource(
                        R.color.greyish
                    )
                )
                Spacer(modifier = Modifier.weight(1f))
            }

            Spacer(modifier = Modifier.weight(1f))

            val moreInfoInteractionSource = remember { MutableInteractionSource() }

            MontserratText(
                stringResource(R.string.moreInfo),
                Modifier
                    .padding(5.dp, 0.dp)
                    .clickable(moreInfoInteractionSource, rememberRipple(true)) {
                        Toast
                            .makeText(context, "Not implemented", Toast.LENGTH_SHORT)
                            .show()
                    },
                fontSize = 11.sp,
                color = if (isNightMode) Color.White else colorResource(R.color.iconTintColor),
                fontWeight = FontWeight.Bold,
            )
        }

    }
}
