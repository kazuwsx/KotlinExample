package partOfOneChapterTwo

data class User10(val name: String) {
}

fun createUser10(name: String?): User10? {
    return name?.let { User10(it) }
}