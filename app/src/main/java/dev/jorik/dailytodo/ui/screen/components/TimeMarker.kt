package dev.jorik.dailytodo.ui.screen.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.jorik.dailytodo.domain.AppTime

@Composable
fun TimeMarker(appTime: AppTime) {
    val markerColor = if (appTime.delta >= 0) Color.Green else Color.Red

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        HorizontalDivider(
            color = markerColor,
            thickness = 2.dp,
            modifier = Modifier.weight(1f)
        )

        Text(
            text = appTime.time,
            color = markerColor,
            fontSize = 14.sp,
            modifier = Modifier.padding(horizontal = 8.dp)
        )

        HorizontalDivider(
            color = markerColor,
            thickness = 2.dp,
            modifier = Modifier.weight(1f)
        )
    }
}