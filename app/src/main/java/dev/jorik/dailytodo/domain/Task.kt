package dev.jorik.dailytodo.domain

data class Task(
    val id: Long,
    val title: String,
    val completed: Boolean
) : DailyItem
