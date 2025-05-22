package com.courses.coursesapp.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import grooveandmove.composeapp.generated.resources.Res
import grooveandmove.composeapp.generated.resources.profile
import org.jetbrains.compose.resources.stringResource

class ProfileScreen : Screen {
    @Composable
    override fun Content() {

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stringResource(Res.string.profile),
                color = Color.Black,
                fontSize = 18.sp
            )
        }
    }

}
