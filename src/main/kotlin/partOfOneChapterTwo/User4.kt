package partOfOneChapterTwo

class User4 {
    lateinit var name: String
    val isValidName: Boolean
        get() = name != ""
}