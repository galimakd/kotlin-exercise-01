fun main() {
    println(calculateFactorial(4))
    println(checkPrime(2))
    println(reverseString("Hello"))
    println(maxInArray(arrayOf(1, 5, 3, 2, 4)))
    println(fibonacciSequence(10))
    println(checkPalindrome("olo"))
    println(sumOfDigitsInANumber(27))
    println(getGreatestCommonDivisor(20,5))
    println(countVowels("kyle dominic"))
    println(celsiusToFahrenheit(0.0))
}

fun calculateFactorial(num: Int): Int {
    require(num >= 0) { "Number can't be negative" }

    return if (num <= 1) {
        1
    } else {
        num * calculateFactorial(num - 1)
    }
}

fun checkPrime(num: Int): String {
    if (num <= 1) {
        return "$num is not Prime"
    }

    for (i in 2 until num) {
        if (num % i == 0) {
            return "$num is not Prime"
        }
    }
    return "$num is Prime"
}

fun reverseString(str: String): String {
    return "$str reversed is ${str.reversed()}"
}

fun <T: Comparable<T>>maxInArray(arr: Array<T> ): T? {
    return arr.maxOrNull()
}

fun fibonacciSequence(num: Int): List<Int> {
    val sequenceList = mutableListOf<Int>()

    var a = 0
    var b = 1

    for (i in 1..num ){
        sequenceList.add(a)
        val sum = a + b
        a = b
        b = sum
    }

    return sequenceList
}

fun checkPalindrome(str: String): String {
    return if (str == str.reversed()) {
        "$str is a Palindrome"
    } else {
        "$str is NOT a Palindrome"
    }
}

fun sumOfDigitsInANumber(num: Int): String {
    var number = num
    var sum = 0

    while (number > 0) {
        sum += number % 10
        number /= 10
    }

    return "The sum of all digits in $num is $sum"
}

fun getGreatestCommonDivisor(a: Int, b: Int): String {
    var num1 = a
    var num2 = b

    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }
    return "The Greatest Common Divisor of $a and $b is $num1"
}

fun countVowels(str: String): String {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var count = 0

    for (char in str) {
        if (char in vowels) {
            count++
        }
    }

    return "There are $count vowels in $str"
}

fun celsiusToFahrenheit(celsius: Double): String {
    val fahrenheit = celsius * 9 / 5 + 32

    return "$celsius celsius is equal to $fahrenheit fahrenheit."
}


