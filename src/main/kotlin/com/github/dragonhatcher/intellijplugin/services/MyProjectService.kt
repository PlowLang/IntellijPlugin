package com.github.dragonhatcher.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.dragonhatcher.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
