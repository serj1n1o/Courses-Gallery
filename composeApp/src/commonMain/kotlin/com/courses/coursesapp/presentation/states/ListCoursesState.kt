package com.courses.coursesapp.presentation.states

import com.courses.coursesapp.domain.models.CourseUi

sealed interface ListCoursesState {

    data class Content(val listCourses: List<CourseUi>) : ListCoursesState

    data object Loading : ListCoursesState

    data object Init : ListCoursesState
}