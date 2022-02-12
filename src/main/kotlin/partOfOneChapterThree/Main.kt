package partOfOneChapterThree

import CalcJava
import HelloByJava
import UserJava
import java.util.UUID

fun main(args: Array<String>) {
    val hello = HelloByJava()
    hello.printHello()

    val uuid: UUID = UUID.randomUUID()
    println(uuid.toString())

    val dog = DogKotlin()
    dog.cry()

    val greeter = GreeterImplKotlin()
    greeter.hello()

    val user = UserJava()
    user.id = 100
    user.name = "Takehata"
    println(user.id)
    println(user.name)

    val function = CalcJava { num1, num2 -> num1 + num2 }
    println(function.calc(1, 3))

    executeCalc(1, 3, CalcJava { num1, num2 -> num1 + num2 })
    val executeFunction = CalcJava { num1, num2 -> num1 + num2 }
}

fun executeCalc(num1: Int, num2: Int, function: CalcJava) {
    println(function.calc(num1, num2))
}