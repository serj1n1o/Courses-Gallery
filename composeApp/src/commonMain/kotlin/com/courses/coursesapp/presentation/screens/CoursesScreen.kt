package com.courses.coursesapp.presentation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import grooveandmove.composeapp.generated.resources.Res
import grooveandmove.composeapp.generated.resources.courses_list
import org.jetbrains.compose.resources.stringResource

object CoursesScreen : Screen {
    @Composable
    override fun Content() {

        val navigator = LocalNavigator.currentOrThrow

        Box(
            modifier = Modifier.fillMaxSize().clickable {
                navigator.push(DetailsScreen())
            },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stringResource(Res.string.courses_list),
                color = Color.Black,
                fontSize = 18.sp
            )
        }

    }
}