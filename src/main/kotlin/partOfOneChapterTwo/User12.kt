package partOfOneChapterTwo

data class User12(val id: Int, var name: String, var address: String) {
}

fun getUser12(id: Int): User12 {
    return User12(id, "Takehata", "Tokyo")
}

fun updateUser12(id: Int, newName: String, newAddress: String) {
    val user = getUser12(id).also {
        it.name = newName
        it.address = newAddress
    }
    println(user)
}