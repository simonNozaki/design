class Main

/**
 * マージソート
 */
fun mergeSort(a: MutableList<Int>, p: Int, r: Int): MutableList<Int> {

    var merged: MutableList<Int> = mutableListOf()

    if (p < r) {
        var q: Int = (p+r)/2
        mergeSort(a, p, q)
        mergeSort(a, q+1, r)
        merged = merge(a, p, q, r)
    }
    
    return merged
}

/**
 * a[p~q], a[q+1~r]はそれぞれソート済みであると仮定する
 * @param p, q, r 配列の添字
 */
fun merge(a: MutableList<Int>, p: Int, q: Int, r: Int): MutableList<Int> {

    // 1つ目の配列の要素数
    var n1: Int = q-p+1
    // 2つ目の配列の要素数
    var n2: Int = r-q

    var left: MutableList<Int> = ArrayList(n1 + 1)
    var right: MutableList<Int> = ArrayList(n2 + 1)

    // 2つの山にそれぞれ配列を分割
    for (i in 1..n1) {
        left.add(a.get(p+i-1))
    }

    for (j in 1..n2) {
        right.add(0, a.get(q+j))
    }

    var i: Int = 1
    var j: Int = 1

    for (k in p..r) {
        if (left.get(i) <= right.get(j)) {
            a.set(k, left.get(i))
            i += 1
        } else {
            a.set(k, right.get(j))
            j += 1
        }
    }

    return a
}

fun main(args: Array<String>) {

    var result: MutableList<Int> = mutableListOf(2, 9, 6, 3, 5, 1, 7, 0, 3)
    
    println(result.toString())
    
}