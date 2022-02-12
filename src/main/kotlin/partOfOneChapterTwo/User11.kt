package partOfOneChapterTwo

data class User11(val id: Int, var name: String, var address: String) {
}

fun getUser11(id: Int): User11 {
    return User11(id, "Takehata", "Tokyo")
}

fun updateUser11(id: Int, newName: String, newAddress: String) {
    val user = getUser11(id).apply {
        this.name = newName
        this.address = newAddress
    }
    println(user)
}