package com.courses.coursesapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
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

    TabNavigator(HomeTab) {
        Scaffold(
            bottomBar = {
                BottomNavigation(
                    modifier = Modifier.navigationBarsPadding()
                ) {
                    TabNavigationItem(HomeTab)
                    TabNavigationItem(SettingsTab)
                    TabNavigationItem(ProfileTab)
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
