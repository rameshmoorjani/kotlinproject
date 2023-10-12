fun main() {
    print(sortArray(arrayListOf(1,3,2,6,8,3)))
}

fun sortArray(arr: MutableList<Int>): MutableList<Int>{
    if(arr.size==1) {
        return arr
    }
    val lastValue = arr.last()
    arr.removeLast()
    sortArray(arr)
    insert(arr, lastValue)
    return arr
}

fun insert (arr: MutableList<Int>, value: Int): MutableList<Int> {
    if(arr.size == 0 || arr.last() < value) {
        arr.add(value)
        return arr
    }
    val lastValue = arr.last()
    arr.removeLast()
    insert(arr, value)
    arr.add(lastValue)
    return arr
}