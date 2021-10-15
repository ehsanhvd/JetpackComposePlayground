package com.hvd.portfolio.ui.activity.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
        ActivityStyleUtils.applyWhiteStyle(window)
        setContent {
            MainActivityContent()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainActivityContent()
}

@Composable
fun MainActivityContent() {
    Column {
        TopHeader()

        TabsAndPager(
            tabs = listOf(
                R.string.experience,
                R.string.skills,
                R.string.education
            )
        ) { page ->
            Box(
                Modifier
                    .fillMaxSize()
                    .background(colorResource(R.color.backgroundColor))) {
                if (page == 0) {
                    ExperiencesView()
                } else {
                    MontserratText("page: $page")
                }
            }
        }
    }
}
