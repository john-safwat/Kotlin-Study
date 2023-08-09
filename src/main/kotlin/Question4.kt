fun main() {
    vowelValidator(readCharacter())
}

fun vowelValidator(char :Char) = when{
    char.uppercaseChar() == 'A' -> println("The alphabet is Vowel")
    char.uppercaseChar() == 'I' -> println("The alphabet is Vowel")
    char.uppercaseChar() == 'O' -> println("The alphabet is Vowel")
    char.uppercaseChar() == 'U' -> println("The alphabet is Vowel")
    char.uppercaseChar() == 'E' -> println("The alphabet is Vowel")
    else -> println("The alphabet is a consonant.")
}