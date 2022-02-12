package partOfOneChapterTwo

class User5 {
    var name: String = ""
    set(value) {
        if (value == "") {
            field = "Kotlin"
        } else {
            field = value
        }
    }
}