package partOfOneChapterTwo

class CommonCalculationExecutor(override val message: String = "calc") : CalculationExecutor {
    override fun calc(num1: Int, num2: Int): Int {
        throw IllegalStateException("Not implements calc")
    }

    override fun printStartMessage() {
        println("start $message")
    }
}