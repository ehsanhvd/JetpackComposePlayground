package com.hvd.portfolio.ui.activity.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.hvd.portfolio.R
import com.hvd.portfolio.ui.composable.MontserratText
import com.hvd.portfolio.ui.composable.TabsAndPager
import com.hvd.portfolio.utils.ActivityStyleUtils
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        refreshActivityStyle(viewModel.isNightMode)

        setContent {
            var isNightMode by remember {
                mutableStateOf(viewModel.isNightMode)
            }

            MainActivityContent(isNightMode) { newNightMode ->
                isNightMode = newNightMode
                viewModel.isNightMode = isNightMode

                refreshActivityStyle(isNightMode)
            }
        }
    }

    private fun refreshActivityStyle(isNightMode: Boolean) {
        if (isNightMode) {
            ActivityStyleUtils.applyBlackStyle(window)
        } else {
            ActivityStyleUtils.applyWhiteStyle(window)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DarkPreview() {
    MainActivityContent(true) {

    }
}

@Preview(showBackground = true)
@Composable
fun LightPreview() {
    MainActivityContent(false) {

    }
}

@Composable
fun MainActivityContent(isNightMode: Boolean, nightModeChanged: (Boolean) -> Unit) {
    Column(Modifier.background(if (isNightMode) Color.DarkGray else colorResource(R.color.backgroundColor))) {
        TopHeader(isNightMode, nightModeChanged)

        TabsAndPager(
            tabs = listOf(
                R.string.experience,
                R.string.skills,
                R.string.education
            ), isNightMode
        ) { page ->
            Box(Modifier.fillMaxSize()) {
                if (page == 0) {
                    ExperiencesViewColumn(isNightMode)
                } else {
                    MontserratText("page: $page")
                }
            }
        }
    }
}
