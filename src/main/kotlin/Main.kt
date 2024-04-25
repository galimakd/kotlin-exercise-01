import functions.*

fun main() {
    println("The factorial of 4 is ${calculateFactorial(4)}")
    println(checkPrime(2))
    println("The reverse of Hello is ${reverseString("Hello")}")
    println("The max of this array [1, 5, 3, 2, 4] is ${maxInArray(arrayOf(1, 5, 3, 2, 4))}")
    println("${fibonacciSequence(10)} is the number 10 term of the fibonacci sequence")
    println(checkPalindrome("olo"))
    println("The sum of digits in 27 is ${sumOfDigitsInANumber(27)}")
    println("The Greatest Common Divisor of 20 and 5 is ${getGreatestCommonDivisor(20,5)}")
    println("There are ${countVowels("kyle dominic")} vowels in 'kyle dominic'")
    println("0.0 Celcius is ${celsiusToFahrenheit(0.0)} fahrenheit")
}
