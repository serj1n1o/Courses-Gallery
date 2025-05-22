package com.courses.coursesapp.presentation.tabs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.courses.coursesapp.presentation.screens.SettingsScreen
import grooveandmove.composeapp.generated.resources.Res
import grooveandmove.composeapp.generated.resources.settings
import org.jetbrains.compose.resources.stringResource

object SettingsTab : Tab {
    @Composable
    override fun Content() {
        SettingsScreen().Content()
    }

    override val options: TabOptions
        @Composable
        get() {
            val title = stringResource(Res.string.settings)
            val icon = rememberVectorPainter(Icons.Default.Settings)
            return remember {
                TabOptions(
                    index = 1u,
                    title = title,
                    icon = icon
                )
            }
        }
}