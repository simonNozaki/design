/**
 * 引数の大きさで0埋めしたリストを初期化する
 * @param size リストの大きさ
 * @return 0埋めしたリスト
 */
fun sizedArrayListOf(size: Int): MutableList<Int> {

    var output: MutableList<Int> = mutableListOf()

    for (i in 0..size) {
        output.add(0)
    }

    return output
}

/**
 * null埋めした、リストを初期化する
 * @param size リストの大きさ
 * @param T? 型引数、null許容
 * @return null埋めした、sizeのリスト
 */
fun <T> MutableList<T?>.initWithSize(size: Int): MutableList<T?> {

    for (i in 0..size) {
        this.add(null)
    }

    return this
}