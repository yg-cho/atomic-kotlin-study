package org.study

fun main() {
    //1. 다음 코드의 출력 결과는?
    val a = 5
    val b = 2.5
    println(a+b) // 7.5

    // 2. 다음 코드의 결과는?
    val s = "Kotlin"
    println("Hello $s!") // Hello Kotlin

    // 3.아래 코드에서 사용된 타입은 무엇인가요?
    val isDone = false // boolean

    // 4. Char 타입으로 한 글자 'A'를 변수로 선언하세요.
    val charVariable = 'A';

    // 5. val x = 1.23은 어떤 타입으로 추론되나요?
    val xx = 1.23
    println(xx.javaClass.kotlin.simpleName) // Double

    // 6. Int의 최대값을 저장하는 상수는 무엇인가요?
    println(Int.MAX_VALUE)

    //7. 삼중 큰따옴표를 사용하면 어떤 장점이 있나요?
    """abcd"""
    // 소스 코드에 입력한 대로 줄 바꿈을 포함한 모든 문자가 그대로 문자열에 포함되며 Raw String 이라고도 부릅니다.

    //8. 다음 코드에서 오류 없이 출력될 수 있도록 수정하세요.
    val x = 1
    println("""Value is: ${x+1}""")

    //9. 점수가 90점 이상이면 A, 80점 이상이면 B, 아니면 C로 출력하는 if 식을 작성하세요.
    fun score(x: Int) {
        if( x >= 90) {
            println("A")
        }
        else if(x >= 80) {
            println("B")
        } else {
            println("C")
        }
    }
    score(90)
    score(80)
    score(70)

    //10. 아래 코드를 for 문으로 바꾸세요.
    for (i in 1..3) println(i)

    //11. 다음 while 반복문이 몇번 반복되는지 예측하세요.
    //    var i = 0
    //    while (i < 4) {
    //        println(i)
    //        i++
    //    }
    //
    // 4번

    //12. 1부터 10까지 짝수만 출력하는 코드를 작성하세요.
    for (i in 1..10 step 2) println(i)

    //13. val s = "banana"에서 "a"가 몇 번 등장하는지 세는 코드를 작성하세요.
    fun counter (value: String) {
        var count = 0
        for (c in value) {
            if ( c == 'a'){
                count++
            }
        }
        println(count)
    }

    //14. for 루프를 사용해 다음을 출력하세요.
    // 1 4 9 16 25
    for(i in 1..5) println(i * i)

    //15. 다음 코드의 결과를 예측하세요.
    // val n = 7
    // val result = if (n % 2 == 0) "even" else "odd"
    // println(result) -> 7%2 != 0 이므로 odd

    //16. 1부터 10까지 더한 합을 구하세요.
    fun sum (): Int {
        var acc = 0;
        for (i in 1..10) acc += i
        return acc
    }

    //17. 대상값에서 1까지 거꾸로 출력하는 for문을 작성하세요.
    fun reverse(value: Int) {
        for (i in value downTo 1) println(i)

    }
}

