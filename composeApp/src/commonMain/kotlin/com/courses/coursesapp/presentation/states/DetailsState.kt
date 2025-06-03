package com.courses.coursesapp.presentation.states

import com.courses.coursesapp.domain.models.CourseUi

sealed interface DetailsState {

    data object Init : DetailsState

    data object Loading : DetailsState

    data class Content(val data: CourseUi) : DetailsState
}