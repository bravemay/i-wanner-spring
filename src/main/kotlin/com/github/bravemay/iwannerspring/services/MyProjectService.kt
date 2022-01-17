package com.github.bravemay.iwannerspring.services

import com.intellij.openapi.project.Project
import com.github.bravemay.iwannerspring.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
