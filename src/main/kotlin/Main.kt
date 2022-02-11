fun main(args: Array<String>) {
    val id: Int = 101
    var name: String = "Takehata"

    println(countLength(name))

    val message: String = "Hello Kotlin!"
    displayMessage(message)

    ifExample(id)
    whenExample(id)

    println("while test")
    var i =1
    while (i < 10) {
        println("i is $i")
        i++
    }

    println("for test")
    for (i in 1..10) {
        println("i is $i")
    }

    println("for in start until end step upper test")
    for (i in 1 until 10 step 2) {
        println("i is $i")
    }

    println("for in collection test")
    val list = listOf(1,2,5,6,10)
    for (i in list) {
        println("i is $i")
    }

    val human = Human("Takehata")
    human.showName()

    val dog = Dog("pochi", 10)
    dog.cries()

    val androidPlatform = AndroidPlatform()
    androidPlatform.showName()

    val iosPlatform = IosPlatform()
    iosPlatform.showName()

    val greeterImpl = GreeterImpl()
    greeterImpl.hello()

    val intList = listOf(1, 2, 3)
    println(intList)
    println(intList[1])

    val stringList = listOf("one", "two", "three")
    println(stringList)
    println(stringList[1])

    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3)
    mutableList.add(4)
    println(mutableList)

    val map: Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(map)
    println(map[2])
    println(map.containsKey(3))
    println(map.containsKey(4))

    val mutableMap: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    mutableMap[4] = "four"
    println(mutableMap)

    val set = setOf("one", "two", "three")
    println(set)
    println(set.contains("three"))
    println(set.contains("four"))

    val mutableSet = mutableSetOf("one" , "two", "three")
    mutableSet.add("four")
    println(mutableSet)
}

fun countLength(str: String): Int {
    return str.length
}

fun displayMessage(message: String): Unit {
    println(message)
}

fun ifExample(num: Int) {
    if (num < 100) {
        println("Less than 100")
    } else if (num == 100) {
        println("Equal to 100")
    } else {
        println("Greater than 100")
    }
}

fun whenExample(num: Int) {
    when {
        num < 100 -> {
            println("Less than 100")
        }
        num == 100 -> {
            println("Equal to 100")
        }
        else -> {
            println("Greater than 100")
        }
    }
}
