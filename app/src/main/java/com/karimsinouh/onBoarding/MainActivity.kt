package com.karimsinouh.onBoarding

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import com.google.accompanist.pager.ExperimentalPagerApi
import com.karimsinouh.onBoarding.ui.theme.OnBoardingTheme

class MainActivity : ComponentActivity() {

    @ExperimentalPagerApi
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            OnBoardingTheme {

                window.statusBarColor=MaterialTheme.colors.background.toArgb()
                window.navigationBarColor=MaterialTheme.colors.background.toArgb()

                Surface(color = MaterialTheme.colors.background,modifier = Modifier.fillMaxSize()) {




                }

            }

        }
    }
}
