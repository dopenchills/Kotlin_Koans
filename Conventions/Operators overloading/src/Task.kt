import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval {
    DAY, WEEK, YEAR;

    operator fun times(i: Int): Pair<TimeInterval, Int> = Pair(this, i)
}

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate {
    return this.addTimeIntervals(timeInterval, 1)
}

operator fun MyDate.plus(timeIntervalAndAmount: Pair<TimeInterval, Int>): MyDate {
    return this.addTimeIntervals(timeIntervalAndAmount.first, timeIntervalAndAmount.second)
}


fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
