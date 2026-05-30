class IDGenerator {
    companion object {
        var currentId = 0
        fun getNextId(): Int {
            currentId++
            return currentId
        }
    }
}
