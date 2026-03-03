package dev.jorik.dailytodo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dev.jorik.dailytodo.ui.screen.DailyTasksScreen
import dev.jorik.dailytodo.ui.theme.DailyTodoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DailyTodoTheme {
                DailyTasksScreen()
            }
        }
    }
}
