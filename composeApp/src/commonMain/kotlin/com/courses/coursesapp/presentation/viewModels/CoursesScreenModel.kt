package com.courses.coursesapp.presentation.viewModels

import cafe.adriel.voyager.core.model.StateScreenModel
import com.courses.coursesapp.domain.models.CourseUi
import com.courses.coursesapp.presentation.states.ListCoursesState

class CoursesScreenModel : StateScreenModel<ListCoursesState>(ListCoursesState.Loading) {

    init {
        loadListCourses()
    }

    private val list = listOf(
        CourseUi(
            name = "Курс 1",
            description = "Этот курс будет полезен всем, кто хочет получить душевный покой"
        ),
        CourseUi(
            name = "Курс 2",
            description = "Этот курс будет полезен всем, кто хочет получить душевный покой"
        ),
        CourseUi(
            name = "Курс 3",
            description = "Этот курс будет полезен всем, кто хочет получить душевный покой"
        ),
        CourseUi(
            name = "Курс 4",
            description = "Этот курс будет полезен всем, кто хочет получить душевный покой"
        ),
        CourseUi(
            name = "Курс 5",
            description = "Этот курс будет полезен всем, кто хочет получить душевный покой"
        ),
        CourseUi(
            name = "Курс 6",
            description = "Этот курс будет полезен всем, кто хочет получить душевный покой"
        ),
    )

    fun loadListCourses() {
        mutableState.value = ListCoursesState.Content(list)
    }
}