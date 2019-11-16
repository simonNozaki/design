fun main(args: Array<String>) {

    var instance1: Singleton = Singleton.getInstance()
    var instance2: Singleton = Singleton.getInstance()

    if (instance1 == instance2) {
        println(instance1)
        println(instance2)
        println("インスタンスは同一の参照です.")
    } else {
        println("インスタンスは同一の参照ではありません.")
    }

}