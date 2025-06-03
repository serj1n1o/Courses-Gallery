package com.courses.coursesapp.presentation.viewModels

import cafe.adriel.voyager.core.model.StateScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import com.courses.coursesapp.domain.models.CourseUi
import com.courses.coursesapp.presentation.states.DetailsState
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CourseDetailsModel : StateScreenModel<DetailsState>(DetailsState.Loading) {

    init {
        loadingDetailsCourse(CourseUi())
    }

    fun loadingDetailsCourse(courseUi: CourseUi) {
        screenModelScope.launch {
            mutableState.value = DetailsState.Loading
            delay(1000L)
            mutableState.value = DetailsState.Content(courseUi)
        }

    }
}