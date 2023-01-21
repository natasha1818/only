fun main() {
    val user = agoToText("Оля", 1260)
    val user2 = agoToText("Петя", 300_000)
}

fun agoToText(userName: String, exitTime: Int) {
    when (exitTime) {
        in 0..60 -> println("$userName был(а) в сети только что")
        in 61..3600 -> minutesText(userName, exitTime)
        in 3601..86400 -> hourText(userName, exitTime)
        in 86401..172800 -> println("$userName был(а) в сети вчера")
        in 175801..259200 -> println("$userName был(а) в сети позавчера")
        else -> println("$userName был(а) в сети очень давно")
    }
}

fun minutesText(userName: String, exitTime: Int) {
    val minutesTime = exitTime / 60
    when (minutesTime) {
        1 -> println("$userName был(а) в сети $minutesTime минуту назад")
        in 2..4 -> println("$userName был(а) в сети $minutesTime минуты назад")
        in 5..20 -> println("$userName был(а) в сети $minutesTime минут назад")
        21, 31, 41, 51 -> println("$userName был(а) в сети $minutesTime минуту назад")
        else -> println("$userName был(а) в сети $minutesTime минут назад")
    }

}

fun hourText(userName: String, exitTime: Int) {
    val hourTime = exitTime / 1440
    when (hourTime) {
        1 -> println("$userName был(а) в сети $hourTime час назад")
        in 2..4 -> println("$userName был(а) в сети $hourTime часа назад")
        in 5..20 -> println("$userName был(а) в сети $hourTime часов назад")
        21 -> println("$userName был(а) в сети $hourTime часа назад")
        else -> println("$userName был(а) в сети $hourTime часов назад")
    }
}
