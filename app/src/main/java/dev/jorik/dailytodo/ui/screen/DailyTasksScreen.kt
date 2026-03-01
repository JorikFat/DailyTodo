package dev.jorik.dailytodo.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.jorik.dailytodo.domain.AppTime
import dev.jorik.dailytodo.domain.DailyItem
import dev.jorik.dailytodo.domain.Task
import dev.jorik.dailytodo.ui.screen.components.TaskCard
import dev.jorik.dailytodo.ui.screen.components.TimeMarker

@Composable
fun DailyTasksScreen() {
    val items: List<DailyItem> = listOf(
        Task(id = 1, title = "Помыть посуду", completed = false),
        AppTime(time = "13:19", delta = 0),
        Task(id = 2, title = "Развесить стирку", completed = false),
        Task(id = 3, title = "Купить продукты", completed = false),
        Task(id = 4, title = "Выкинуть мусор", completed = false),
        Task(id = 5, title = "Погулять с собакой", completed = false)
    )

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.background
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(items) { item ->
                when (item) {
                    is Task -> TaskCard(task = item)
                    is AppTime -> TimeMarker(appTime = item)
                }
            }
        }
    }
}


@Preview
@Composable
private fun DailyTasksScreenPreview() {
    DailyTasksScreen()
}