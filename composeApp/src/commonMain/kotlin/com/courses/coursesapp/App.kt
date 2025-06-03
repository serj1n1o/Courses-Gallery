package com.courses.coursesapp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import com.courses.coursesapp.presentation.tabs.HomeTab
import com.courses.coursesapp.presentation.tabs.ProfileTab
import com.courses.coursesapp.presentation.tabs.SettingsTab
import com.courses.coursesapp.presentation.tabs.TabNavigationItem
import com.courses.coursesapp.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
internal fun App() = AppTheme {

    var isVisible by remember { mutableStateOf(true) }
    val homeTab = remember { HomeTab(onNavigator = { isVisible = it }) }

    TabNavigator(tab = homeTab) {

        Scaffold(
            bottomBar = {
                AnimatedVisibility(
                    visible = isVisible,
                    enter = slideInVertically { height -> height },
                    exit = slideOutVertically { height -> height }) {
                    BottomNavigation(
                        modifier = Modifier.navigationBarsPadding()
                    ) {
                        TabNavigationItem(homeTab)
                        TabNavigationItem(SettingsTab)
                        TabNavigationItem(ProfileTab)
                    }
                }
            }
        ) { paddingValues ->
            Box(
                modifier = Modifier.fillMaxSize()
                    .padding(paddingValues)
            ) {
                CurrentTab()
            }
        }
    }
}