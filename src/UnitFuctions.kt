fun main() {
    // Тип Unit - описывает отсутствие возвращаемого значения функции.

    //переменные функцианального типа)
    val type1: (Int) -> String
    val type2: (Int, Double, Int) -> Double


    //анонимная функция - функция которая не имеет имени. Обращение к этой функции происходит с помощью
    //переменной функционального типа
    val anonimus: (Int) -> Unit = fun(a: Int) { println(a) }
    anonimus(123)

    //в лямбда выражениях нельзя явно использовать оператор return. Возвращаемый тип лямбды - это последняя запись
    //Unit - в случае с prinln(), и Int в случае с a * b
    val lambda = { println("Hello lambda!") }
    val lambdaWithParams = { message: String -> println(message) }
    val lambdaWithParamsAndReturnValue = { a: Int, b: Int -> a * b }

    val text =
        "//в лямбда выражениях нельзя явно использовать оператор return. Возвращаемый тип лямбды - это последняя запись\n" +
                "    //Unit - в случае с prinln(), и Int в случае с a * b"

    val vowes = "аяеоуиэюы"
    println(text.count{it == 'е'})

    println(text.filter { it !in vowes })
}

//функциональный тип функции
fun multiply(func: () -> Unit) {}