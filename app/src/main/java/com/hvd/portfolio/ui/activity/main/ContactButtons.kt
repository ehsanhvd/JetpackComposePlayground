package com.hvd.portfolio.ui.activity.main

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.hvd.portfolio.R
import com.hvd.portfolio.ui.composable.ButtonText

@Composable
fun ContactButtons() {
    Row(Modifier.padding(16.dp)) {
        Column(Modifier.weight(1f)) {
            CallButton()
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column(Modifier.weight(1f)) {
            LinkedInButton()
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column(Modifier.weight(1f)) {
            TelegramButton()
        }
    }
}


@Composable
fun CallButton() {
    Button(
        onClick = {},
        Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(25.dp),
        colors = ButtonDefaults.buttonColors(colorResource(R.color.purple_700))
    ) {
        ButtonText(stringResource(R.string.call))
    }
}

@Composable
fun LinkedInButton() {
    Button(
        onClick = {},
        Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(25.dp),
        colors = ButtonDefaults.buttonColors(colorResource(R.color.purple_700))
    ) {

        ButtonText(stringResource(R.string.linkedIn))
    }
}

@Composable
fun TelegramButton() {
    Button(
        onClick = {},
        Modifier.fillMaxWidth().padding(0.dp),
        shape = RoundedCornerShape(25.dp),
        colors = ButtonDefaults.buttonColors(colorResource(R.color.purple_700))
    ) {

        ButtonText(text = stringResource(R.string.telegram))
    }
}
