package partOfOneChapterOne

class Dog(name: String, age: Int) : Animal(name) {
    override fun cries() = println("bowwow")
}