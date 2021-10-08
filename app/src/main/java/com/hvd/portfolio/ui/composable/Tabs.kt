package com.hvd.portfolio.ui.composable

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Tabs(@StringRes tabs: List<Int>){
    var selectedTabIndex by remember { mutableStateOf(0) }

    TabRow(
        selectedTabIndex = selectedTabIndex,
        Modifier.height(48.dp),
        backgroundColor = Color.White,
        divider = { TabRowDefaults.Divider(Modifier.wrapContentSize(Alignment.BottomStart)) },
    ) {
        for (i in tabs.indices){
            Tab(selected = false, onClick = { selectedTabIndex = i }) {
                MontserratText(stringResource(tabs[i]), fontSize = 18.sp)
            }
        }
    }
}