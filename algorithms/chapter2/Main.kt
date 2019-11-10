/**
 * 挿入ソート
 */
fun insertionSort(list: MutableList<Int>): MutableList<Int> {
    
    for (j in 1 .. list.size) {
        var key: Int = list.get(j)
        var i: Int = j-1
    
        while (i > 0 && list.get(i) < key) {
            var tmp: Int = list.get(i)
            list.set(i, list.get(i+1))
            list.set(i+1, tmp)

            i -= 1
        }

        if(list.get(0) < list.get(1)) {
            var tmp: Int = list.get(0)
            list.set(i, list.get(1))
            list.set(i+1, tmp)
        }
    }

    return list
}

/**
 * マージソート
 */
fun mergeSort(_a: MutableList<Int>, p: Int, r: Int): MutableList<Int> {

    // kotlinでは、メソッド引数は常にread-onlyなので引数のポインタを上書きしたいときはvar変数として用意する
    var a: MutableList<Int> = _a

    if (p < r) {

        var q: Int = (p+r)/2

        println("p: ${p.toString()}")
        println("q: ${q.toString()}")
        println("r: ${r.toString()}")

        mergeSort(a, p, q)
        mergeSort(a, q+1, r)
        merge(a, p, q, r)
    }

    return a
}

/**
 * 深さiの部分問題に対するソート
 * @param p, q, r 配列の添字
 */
fun merge(_a: MutableList<Int>, p: Int, q: Int, r: Int): MutableList<Int> {

    var a: MutableList<Int> = _a;

    // 1つ目の配列の要素数
    var n1: Int = q-p+1
    // 2つ目の配列の要素数
    var n2: Int = r-q

    var left: MutableList<Int> = sizedArrayListOf(n1+1)
    var right: MutableList<Int> = sizedArrayListOf(n2+1)

    println("left size: ${left.size}")
    println("right size: ${right.size}")

    // 2つの山にそれぞれ配列を分割
    for (i in 0..n1) {
        left.set(i, a.get(p+i))
    }

    for (j in 0..n2) {
        right.set(j, a.get(q+j))
    }

    println("left : ${left.toString()}")
    println("right : ${right.toString()}")

    var i: Int = 0
    var j: Int = 0

    for (k in p..r) {
        if (left.get(i) <= right.get(j)) {
            a.set(k, left.get(i))
            i += 1
        } else {
            a.set(k, right.get(j))
            j += 1
        }
    }

    println("a: ${a.toString()}")

    return a
}

fun main(args: Array<String>) {

    /**
     * mergeSort(a, p, r) -> mergeSort(a, 0, 7)
	 * p=0,q=3,r=7
	 * mergeSort(a, 0, 3)
	    mergeSort(a, 0, 1)
	    mergeSort(a, 2, 3)
	    merge(a, 0, 1, 3)
	 * mergeSort(a, 4, 7)
	    mergeSort(a, 4, 5)
	    mergeSort(a, 6, 7)
	    merge(a, 4, 5, 7)
	 * merge(a, 0, 3, 7)
     */
    var list: MutableList<Int> = mutableListOf(3, 41, 52, 26, 38, 57, 9, 49)

    println(merge(list, 0, 1, 3))
    println(merge(list, 4, 5, 7))
    
}
