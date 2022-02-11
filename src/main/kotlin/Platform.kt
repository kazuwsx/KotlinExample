sealed class Platform {
    abstract fun showName()
}

class AndroidPlatform: Platform() {
    override fun showName() {
        println("android.")
    }
}

class IosPlatform: Platform() {
    override fun showName() {
        println("iOs.")
    }
}