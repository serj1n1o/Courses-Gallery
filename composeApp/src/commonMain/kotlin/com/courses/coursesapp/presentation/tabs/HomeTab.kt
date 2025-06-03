package com.courses.coursesapp.presentation.tabs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import cafe.adriel.voyager.transitions.SlideTransition
import com.courses.coursesapp.presentation.screens.CoursesScreen
import grooveandmove.composeapp.generated.resources.Res
import grooveandmove.composeapp.generated.resources.courses_list
import org.jetbrains.compose.resources.stringResource
import kotlin.jvm.Transient

class HomeTab(
    @Transient
    val onNavigator: (isRoot: Boolean) -> Unit,
) : Tab {

    @Composable
    override fun Content() {
        Navigator(screen = CoursesScreen) { navigator ->
            LaunchedEffect(navigator.lastItem) {
                onNavigator(navigator.lastItem is CoursesScreen)
            }
            SlideTransition(navigator = navigator)
        }
    }

    override val options: TabOptions
        @Composable
        get() {
            val title = stringResource(Res.string.courses_list)
            val icon = rememberVectorPainter(Icons.Default.FilterList)
            return remember {
                TabOptions(
                    index = 0u,
                    title = title,
                    icon = icon
                )
            }
        }
}