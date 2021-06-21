fun main() {
    for (i in 1..100) {
        if (i % 15 == 0) {
            println("FizzBuzz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else {
            println(i)
        }
    }


//

    val sentence = "School is boring"
    val reversed = reverse(sentence)
    println("The reversed sentence is: $reversed")
}

fun reverse(sentence: String): String {
    if (sentence.isEmpty())
        return sentence

    return reverse(sentence.substring(1)) + sentence[0]

}