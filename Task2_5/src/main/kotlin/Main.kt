fun main(args: Array<String>) {
    val inputArray = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    val groupWords = inputArray.groupBy { it.toCharArray().sorted().joinToString() }
    for ((key, value) in groupWords) {
        println("Слова с одинаковыми буквами: $value")
    }
}