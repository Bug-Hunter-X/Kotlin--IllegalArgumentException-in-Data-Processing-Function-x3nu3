```kotlin
fun processData(data: String?): Int {
    return data?.toIntOrNull() ?: 0 // or handle it in a more appropriate way, like logging an error
}
```