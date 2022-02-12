package partOfOneChapterTwo

import kotlinx.coroutines.*

fun main() {
//    printOddOrEvenNumberText(100)
//    printOddOrEvenNumberText(99)
//    printNumText(100)
//    printNumText(200)
//    printNumText(300)
//
//    val user1 = User1()
//    user1.name = "Takehata"
//    println(user1.name)
//
//    val user2 = User2(1)
//    user2.name = "Takehata"
//    // user2.id = 2
//    // => Val cannot be reassigned
//
//    val user3 = User3()
//    // println(user.name)
//    // => lateinit property name has not been initialized
//    user3.name = "Takehata"
//    println(user3.name)
//
//    val user4 = User4()
//    user4.name = "Takehata"
//    println(user4.isValidName)
//
//    val user5 = User5()
//    user5.name = ""
//    println(user5.name)
//    user5.name = "Takehata"
//    println(user5.name)
//
//    val user6A = User6()
//    val user6B = User6()
//
//    //  toString関数の結果
//    println(user6A.toString())
//    println(user6B.toString())
//
//    //  hashCode関数の結果
//    println(user6A.hashCode())
//    println(user6B.hashCode())
//
//    // equals関数での比較
//    println(user6A == user6B)
//
//    // hashCode関数、equals関数での比較
//    val set6 = hashSetOf(user6A)
//    println(set6.contains(user6B))
//
//    val user7 = User7(1, "Takehata")
//    val same7 = User7(1, "Takehata")
//    val other7 = User7(2, "Takehata")
//    println(user7 == same7)
//    println(user7 == other7)
//
//    println("user=${user7.hashCode()}")
//    println("user=${same7.hashCode()}")
//    println("user=${other7.hashCode()}")
//
//    val set7 = hashSetOf(user7)
//    println(set7.contains(same7))
//    println(set7.contains(other7))
//
//    println(user7.toString())
//
//    val user = User7(1, "Takehata")
//    println(user.component1())
//    println(user.component2())
//
//    val updatedUser7 = user7.copy(1, "Kotlin")
//    println(updatedUser7.toString())
//
//    printUserInfo(1)
//
//    val user8 = User8(1)
//    println(user8.toString())
//
//    val user9 = User9(id = 1, age = 30)
//    println(user9.toString())
//
//    val calc: (Int, Int) -> Int = {num1, num2 -> num1 + num2}
//    println(calc(10, 5))
//
//    val squared: (Int) -> Int = { it * it }
//    println(squared(10))
//
//    printCalcResult(10, 20, { num1, num2 -> num1 + num2 })
//    printCalcResult(10, 20, { num1, num2 -> num1 * num2 })
//
//    printAddtionResult(3, 10)
//    printMultiplicationResult(3, 10)
//
//    println(2.square())
//
//    val list = mutableListOf<Int>()
//    for (i in 1..10) {
//        if (i % 2 == 1) list.add(i)
//    }
//    val oddNumbers = list.joinToString(separator = " ")
//    println(oddNumbers)
//
////  with---複数の処理をまとめて行う
//    val withOddNumbers = with(mutableListOf<Int>()) {
//        for (i in 1..10) {
//            if (i % 2 ==1) this.add(i)
//        }
//        this.joinToString(separator = " ")
//    }
//    println(withOddNumbers)
//
////  run---Nullableなオブジェクトに複数の処理をまとめて行う
//    val runOoddNumbers = mutableListOf<Int>().run {
//        for (i in 1..10) {
//            if (i % 2 == 1) this.add(i)
//        }
//        this.joinToString(separator = " ")
//    }
//    println(oddNumbers)
//
////  let---Nullableなオブジェクトに名前をつけて処理を行う
//    val letOddNumbers = mutableListOf<Int>().let { list ->
//        for (i in 1..10) {
//            if (i % 2 == 1) list.add(i)
//        }
//        list.joinToString(separator = " ")
//    }
//    println(letOddNumbers)
//
////  apply---オブジェクトに変更を加えて返す
//    val applyOddNumbers = mutableListOf<Int>().apply {
//        for (i in 1..10) {
//            if (i % 2 == 1) this.add(i)
//        }
//        this.joinToString(separator = " ")
//    }
//    println(applyOddNumbers)
//
//    println(createUser10("Takehata"))
//    println(createUser10(null))
//
//    println(updateUser11(100, "Kotlin", "Nagoya"))
//    println(updateUser12(100, "Kotlin", "Nagoya"))
//
////  8 演算子オーバーロードでクラスに対する演算子の処理を実装できる
//    val num = Num(5) + Num(1)
//    println(num)
//
//    val greaterThan = Num(5) > Num(1)
//    val lessThan = Num(5) < Num(1)
//    println(greaterThan)
//    println(lessThan)
//
////  9 デリゲートで冗長な処理を移譲できる
//    val executor = AddCalculationExecutor(CommonCalculationExecutor())
//    executor.printStartMessage()
//    println(executor.calc(8, 11))
//
//    val executorDelegate = AddCalculationExecutorDelegate(CommonCalculationExecutor())
//    executorDelegate.printStartMessage()
//    println(executorDelegate.calc(8, 11))
//
//    val person = Person()
//    person.name = "Takehata"
//    person.address = "Tokyo"
//    println(person.name)
//    println(person.address)
//
////    val delegatePerson = DelegatePerson()
////    delegatePerson.name= "Takehata"
////    delegatePerson.address= "Tokyo"
////    println(delegatePerson.name)
////    println(delegatePerson.address)
//
////  10 充実したコレクションライブラリでコレクションに対する処理をシンプルにできる
//    val forEachlist = listOf(1, 2, 3)
//    forEachlist.forEach { num -> println(num) }
//
//    val mapList = listOf(User13(1, 100, "Takehata"), User13(2, 200, "Kotlin"))
//    val mapIdList = mapList.map { it.id }
//    mapIdList.forEach { println(it) }
//
//    val filterList = listOf(
//        User13(1, 100, "Takehata")
//        , User13(2, 200, "Kotlin")
//        , User13(3, 100, "Java")
//    )
//    val filteredfilterList = filterList.filter { it.teamId == 100 }
//    filteredfilterList.forEach { println(it) }
//
//    val firstLastList = listOf(
//        User13(1, 100, "Takehata")
//        , User13(2, 200, "Kotlin")
//        , User13(3, 100, "Java")
//        , User13(4, 200, "Groovy")
//    )
//    println(firstLastList.first())
//    println(firstLastList.last())
//    println(firstLastList.first { it.teamId == 200 })
//    println(firstLastList.last{ it.teamId == 100 })
//
//    val firstOrNullList = listOf(
//        User13(1, 100, "Takehata")
//        , User13(2, 200, "Kotlin")
//        , User13(3, 100, "Java")
//        , User13(4, 200, "Groovy")
//    )
//    println(firstOrNullList.firstOrNull { it.teamId == 200 })
//    println(firstOrNullList.lastOrNull { it.teamId == 100 })
//    println(firstOrNullList.firstOrNull { it.teamId == 1000 })
//    println(firstOrNullList.lastOrNull { it.teamId == 1000 })
//
//    val distinctList = listOf(1, 1, 2, 3, 4, 4, 5)
//    val distincteddistinctList = distinctList.distinct()
//    distincteddistinctList.forEach { println(it) }
//
//    val associateByList = listOf(
//        User13(1, 100, "Takehata")
//        , User13(2, 200, "Kotlin")
//        , User13(3, 100, "Java")
//    )
//    val associateByMap = associateByList.associateBy { it.id }
//    println(associateByMap)
//    associateByList.forEach { println(associateByMap[it.id]) }
//
//    val associateWithlist = listOf("Takehata", "Kotlin", "Java")
//    val associateWithMap = associateWithlist.associateWith { it.length }
//    println(associateWithMap)
//    associateWithlist.forEach{ println(associateWithMap[it]) }
//
//    val groupByList = listOf(
//        User13(1, 100, "Takehata")
//        , User13(2, 200, "Kotlin")
//        , User13(3, 100, "Java")
//        , User13(4, 200, "Groovy")
//    )
//    val groupByMap = groupByList.groupBy { it.teamId }
//    println(groupByMap)
//    println(groupByMap[100])
//    println(groupByMap[200])
//
//    val countList = listOf(1, 2, 3, 4, 5)
//    val countOddNumberCount = countList.count { it % 2 == 1 }
//    println(countOddNumberCount)
//
//    val chunkList = listOf("Takehata", "Kotlin", "Java", "Groovy", "Scala")
//    val chunkedList = chunkList.chunked((2))
//    println(chunkedList)
//    chunkedList.forEach { println(it) }
//
//    val reduceList = listOf(1, 2, 3, 4, 5)
//    val reduceResult = reduceList.reduce { sum, value ->
//        println("$sum + $value")
//        sum + value
//    }
//    println(reduceResult)
//
//    val reduceAlphabetList = listOf("a", "b", "c", "d", "e")
//    val reduceAlphabetresult = reduceAlphabetList.reduce{ line, str -> line + str }
//    println(reduceAlphabetresult)

//  11 コルーチンで非同期処理が実装できる
    GlobalScope.launch {
        delay(1000L)
        println("Naoto.")
    }
    println("My name is")
    Thread.sleep(2000L)

    runBlocking {
        launch {
            delay(1000L)
            println("Naoto.")
        }
        println("My name is")
    }

    runBlocking {
        launch { suspendPrintName() }
        println("My name is")
    }

    runBlocking {
        val result = async {
            delay(2000L)
            var sum = 0
            for (i in 1..10) {
                sum += i
            }
            sum
        }
        println("計算中")
        println("sum=${result.await()}")
        println("計算done")

        runBlocking {
            val num1 = async {
                delay(2000L)
                1 + 2
            }
            val num2 = async {
                delay(1000L)
                3 + 4
            }
            println("sum=${num1.await() + num2.await() }")
        }
    }
}

fun printOddOrEvenNumberText(num: Int) {
    var text = if (num % 2 == 1) {
        "奇数"
    } else {
        "偶数"
    }

    println(text)
}

fun printNumText(num: Int) {
    val text = when (num) {
        100 -> {
            "Equal to 100"
        }
        200 -> {
            "Equal to 200"
        }
        else -> {
            "Undefined value"
        }
    }

    println(text)
}

fun printUserInfo(id: Int, name: String = "Default Name") {
    println("id=$id name=$name")
}

typealias Calc = (Int, Int) -> Int

fun printCalcResult(num1: Int, num2: Int, calc: Calc) {
    val result = calc(num1, num2)
    println(result)
}

fun printAddtionResult(x: Int, y: Int) {
    println("足し算の結果を表示します。")
    printCalcResult(x, y, { num1, num2 -> num1 + num2 })
}

fun printMultiplicationResult(x: Int, y: Int) {
    println("足し算の結果を表示します。")
    printCalcResult(x, y, { num1, num2 -> num1 * num2 })
}

fun Int.square(): Int = this * this

suspend fun suspendPrintName() {
    delay(1000L)
    println("Naoto.")
}