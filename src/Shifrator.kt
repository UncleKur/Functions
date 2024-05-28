fun main() {
    val textForCipher = "Я учу язык Котлин"

    val firstHalfTextForCipher = textForCipher.substring(0, textForCipher.length / 2)
    val secondHalfTextForCipher = textForCipher.substring(textForCipher.length / 2)
    println("первая часть: $firstHalfTextForCipher\nвторая часть: $secondHalfTextForCipher")

    println(encodeFirstHalf(firstHalfTextForCipher))
    println(encodeFirstHalf(secondHalfTextForCipher))
}

fun encodeFirstHalf(text: String): String {
    var result = text
    result = result.replace('у', '1')
    result = moveSymbolsRight(result, 4)
    result = result.replace('я', 'w')
    result = result.replace('ч', '2')
    result = moveSymbolsLeft(result, 2)
    return result
}

fun encodeSecondHalf(text: String): String {
    var result = text
    result = result.replace(' ', '_')
    result = moveSymbolsLeft(result, 1)
    result = result.reversed()
    return result
}

fun moveSymbolsRight(text: String, amount: Int): String {
    return text.map { c ->
        c + amount
    }.joinToString("")
}

fun moveSymbolsLeft(text: String, amount: Int): String {
    return text.map { c ->
        c - amount
    }.joinToString("")
}

/***
 * Разделить сообщение пополам.
 * Обработать первую половину сообщения следующим образом:
 * В исходном тексте заменить все символы «у» (русская буква У) на символ 1 (единица).
 * В получившемся тексте заменить каждый символ сообщения символом, стоящим на четыре символа правее от исходного (сдвиг каждого символа вправо на 4).
 * В получившемся тексте заменить все символы «я» на букву w.
 * В получившемся тексте заменить все символы «ч» на цифру 2.
 * В получившемся тексте заменить каждый символ сообщения символом, стоящим на два символа левее от исходного (сдвиг каждого символа влево на 2).
 * Вторую половину сообщения обработать так:
 * Заменить пробелы на символ «_».
 * В получившемся тексте заменить каждый символ сообщения символом, стоящим на один символ правее от исходного (сдвиг каждого символа вправо на 1).
 * Развернуть получившуюся строку.
 * Соединить обе зашифрованные половины.
 */
