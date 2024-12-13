```kotlin
fun processData(data: String?): Int {
    return data?.toIntOrNull() ?: throw IllegalArgumentException("Invalid input: Not an integer")
}
```