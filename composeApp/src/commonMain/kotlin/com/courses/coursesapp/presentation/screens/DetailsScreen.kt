package com.courses.coursesapp.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import coil3.compose.AsyncImage
import com.courses.coursesapp.domain.models.CourseUi
import com.courses.coursesapp.presentation.states.DetailsState
import com.courses.coursesapp.presentation.viewModels.CourseDetailsModel
import grooveandmove.composeapp.generated.resources.Res
import grooveandmove.composeapp.generated.resources.img_placeholder_online_education_isometric
import org.jetbrains.compose.resources.painterResource


class DetailsScreen : Screen {

    @Composable
    override fun Content() {
        val screenModel = rememberScreenModel { CourseDetailsModel() }
        val state by screenModel.state.collectAsState()

        when (state) {
            is DetailsState.Loading -> LoadingContent()
            is DetailsState.Content -> DetailsContent((state as DetailsState.Content).data)
            DetailsState.Init -> {}
        }
    }
}

@Composable
fun LoadingContent() {
    Box(modifier = Modifier.fillMaxSize()) {
        CircularProgressIndicator(modifier = Modifier.align(alignment = Alignment.Center))
    }
}

@Composable
fun DetailsContent(data: CourseUi) {
    Column(
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(top = 16.dp)
    ) {
        AsyncImage(
            model = data.cover,
            placeholder = painterResource(Res.drawable.img_placeholder_online_education_isometric),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth().height(200.dp).clip(RoundedCornerShape(12.dp)),
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = data.name,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = data.description,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

    }
}