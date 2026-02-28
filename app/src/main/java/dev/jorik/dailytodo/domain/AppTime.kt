package dev.jorik.dailytodo.domain

data class AppTime(
    val time: String,
    val delta: Int
) : DailyItem