import kotlin.random.Random

fun main() {
    println("Welcome to Number Guessing Game!")
    println("Made by zira")
    val maxAttempts: Int = 10
    println("oh yeah btw you have $maxAttempts attempts.")

    val randomNumber = Random.nextInt(1, 101)
    val cheatermode = false
    if (cheatermode) {
        println("CHEATER MODE: The number is $randomNumber")
    }

    var attempts = 0

    while (attempts < maxAttempts) {
        println("make a guess right now before I explode your device")
        val input = readln()

        if (input.isNullOrBlank()) {
            println("bro you didn't even input a number :sob:")
            continue
        }
        val guess = input.toIntOrNull()
        if (guess == null) {
            println("You professionally crashed your game lol")
        }
        attempts++

        if (guess == randomNumber) {
            println("wow you're so sigma and btw you guessed in $attempts attempts.")
            return
        } else if (guess!! < randomNumber) {
            println("ts diddyblud is incorrect you suck at ts game :sob:")
        } else {
            println("the number you guessed is too large like KSI's forehead")
        }
    }
    println("ts diddyblud fumbled so hard the correct number was $randomNumber you idiot now go restart the application")
}
