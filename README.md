# Пример проекта на KMM Compose Ios + Android

В проекте используется шаринг компоуз функций, для примера был использован бокс с разным цветом под платформу.

Shared:
```kotlin
@Composable
internal expect fun PlatformBox()
```

Android:
```kotlin
@Composable
internal actual fun PlatformBox() {
    Box(modifier = Modifier.size(64.dp).background(Color.Green))
}
```
Ios:
```kotlin
@Composable
internal actual fun PlatformBox() {
    Box(modifier = Modifier.size(64.dp).background(Color.Red))
}
```


<img width="937" alt="Снимок экрана 2022-12-12 в 15 54 10" src="https://user-images.githubusercontent.com/50260829/207003454-84730a26-6d99-47a2-92a6-f274dcc5964e.png">
