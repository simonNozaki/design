class Main {
    
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
}

fun main(args: Array<String>) {

    var result: MutableList<Int>  = Main().insertionSort(mutableListOf(3, 9 , 10, 2))

    println(result.toString())
    
}
