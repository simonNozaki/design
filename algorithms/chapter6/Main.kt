var size: Int = 0

fun left(list: MutableList<Int>, index: Int): Int {
    return 2 * list[index]
}

fun right(list: MutableList<Int>, index: Int): Int {
    return (2 * list[index]) + 1
}

fun maxHeapify(list: MutableList<Int>, index: Int): Unit {
    var left: Int = left(list, index)
    var right: Int = right(list, index)
    var largest: Int

    if (left <= size && list[left] > list[index]) {
        largest = left
    } else {
        largest = index
    }

    if(right <= size && list[left] > list[index]) {
        largest = right
    }

    if (largest != index) {
        list[index] = list[largest]
        maxHeapify(list, largest)
    }

}

fun buildMaxHeap(list: MutableList<Int>): Unit {
    for (i in list.size/2 downTo 0) {
        maxHeapify(list, i)
    }
}

fun heapSort(list: MutableList<Int>): Unit {
    buildMaxHeap(list)

    for (i in list.size downTo 1) {
        size -= 1
        maxHeapify(list, i)
    }
}

fun main(args: Array<String>) {
    var source: MutableList<Int> = mutableListOf(23, 17, 14, 6, 13, 10, 1)
    size = source.size

    heapSort(source)

    println(source.toString())
}