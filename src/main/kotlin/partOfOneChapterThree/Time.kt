package partOfOneChapterThree

import java.time.LocalDateTime

data class Time(val time: LocalDateTime)
fun main() {
    val now = Time(LocalDateTime.now())
    println(now.time)
}