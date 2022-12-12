package com.example.kmmcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Application
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController =
    Application("iosApp") {
        SafeArea {
            KmmComposeApp()
        }
    }

@Composable
internal fun SafeArea(
    content: @Composable () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.height(50.dp))
        content.invoke()
    }
}

@Composable
internal actual fun PlatformBox() {
    Box(modifier = Modifier.size(64.dp).background(Color.Red))
}