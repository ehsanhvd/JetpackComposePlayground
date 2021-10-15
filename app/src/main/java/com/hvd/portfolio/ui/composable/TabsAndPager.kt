package com.hvd.portfolio.ui.composable

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerScope
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabsAndPager(@StringRes tabs: List<Int>, content: @Composable PagerScope.(page: Int) -> Unit,) {
    val pagerState = rememberPagerState(3, 0)

    val coroutineScope = rememberCoroutineScope()

    TabRow(
        selectedTabIndex = pagerState.currentPage,
        Modifier.height(48.dp),
        backgroundColor = Color.White,
        divider = { TabRowDefaults.Divider(Modifier.wrapContentSize(Alignment.BottomStart)) },
    ) {

        for (i in 0 until pagerState.pageCount) {
            Tab(selected = pagerState.currentPage == i, onClick = {
                coroutineScope.launch {
                    pagerState.animateScrollToPage(i)
                }
            }) {
                MontserratText(stringResource(tabs[i]), fontSize = 18.sp)
            }
        }
    }

    HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize(), content = content)
}