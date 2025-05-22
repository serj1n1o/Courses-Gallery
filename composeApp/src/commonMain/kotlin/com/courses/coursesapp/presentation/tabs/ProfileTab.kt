package com.courses.coursesapp.presentation.tabs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.courses.coursesapp.presentation.screens.ProfileScreen
import grooveandmove.composeapp.generated.resources.Res
import grooveandmove.composeapp.generated.resources.profile
import org.jetbrains.compose.resources.stringResource

object ProfileTab : Tab {
    @Composable
    override fun Content() {
        ProfileScreen().Content()
    }

    override val options: TabOptions
        @Composable
        get() {
            val icon = rememberVectorPainter(Icons.Default.Person)
            val title = stringResource(Res.string.profile)
            return remember {
                TabOptions(
                    index = 2u,
                    title = title,
                    icon = icon
                )
            }
        }
}