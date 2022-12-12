package com.example.kmmcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainView() {
    KmmComposeApp()
}

@Composable
internal actual fun PlatformBox() {
    Box(modifier = Modifier.size(64.dp).background(Color.Green))
}