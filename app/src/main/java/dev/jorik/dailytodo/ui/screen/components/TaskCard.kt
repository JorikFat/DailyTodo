package dev.jorik.dailytodo.ui.screen.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.jorik.dailytodo.domain.Task

@Composable
fun TaskCard(task: Task) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Checkbox(
            checked = task.completed,
            onCheckedChange = {  }
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = task.title,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}