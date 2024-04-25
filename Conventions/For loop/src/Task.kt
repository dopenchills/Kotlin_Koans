class DateRange(val start: MyDate, val end: MyDate): Iterable<MyDate> {

    override fun iterator(): Iterator<MyDate> {
        return object: Iterator<MyDate> {
            var date = start.copy()

            override fun next(): MyDate {
                val dateToReturn = date.copy()
                date = dateToReturn.followingDate()
                return dateToReturn
            }

            override fun hasNext(): Boolean {
                return date <= end
            }

        }
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}