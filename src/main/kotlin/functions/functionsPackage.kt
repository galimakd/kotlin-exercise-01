package functions

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
    return str.reversed()
}

fun <T: Comparable<T>>maxInArray(arr: Array<T> ): T? {
    return arr.maxOrNull()
}

fun fibonacciSequence(num: Int): Int {
    val sequenceList = mutableListOf<Int>()

    var a = 0
    var b = 1

    for (i in 1..num ){
        sequenceList.add(a)
        val sum = a + b
        a = b
        b = sum
    }

    return sequenceList[num-1]
}


fun checkPalindrome(str: String): String {
    return if (str == str.reversed()) {
        "$str is a Palindrome"
    } else {
        "$str is NOT a Palindrome"
    }
}

fun sumOfDigitsInANumber(num: Int): Int {
    var number = num
    var sum = 0

    while (number > 0) {
        sum += number % 10
        number /= 10
    }

    return sum
}

fun getGreatestCommonDivisor(a: Int, b: Int): Int {
    var num1 = a
    var num2 = b

    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }
    return num1
}

fun countVowels(str: String): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var count = 0

    for (char in str) {
        if (char in vowels) {
            count++
        }
    }

    return count
}

fun celsiusToFahrenheit(celsius: Double): Double {
    val fahrenheit = celsius * 9 / 5 + 32

    return fahrenheit
}