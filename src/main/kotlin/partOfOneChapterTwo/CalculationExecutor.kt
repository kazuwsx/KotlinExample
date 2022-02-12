package partOfOneChapterTwo

interface CalculationExecutor {
    val message: String
    fun calc(num1: Int, num2: Int): Int
    fun printStartMessage()
}
