class Main {
    
    companion object MainCompanion {

        fun factorial(number: Int): Int {
            var _number: Int = number

            if (number > 1) {
                _number = number * factorial(_number - 1)
                return _number
            }

            return _number
        }
    }
}

class Node(_data: Int, _next: Node?) {

    var data: Int
    var next: Node?

    init {
        data = _data
        next = _next
    }

}

class Stack {
    var head: Node?
    var tail: Node?
    var current: Node?

    init {
        head = null
        tail = null
        current = null
    }

}

fun push(stack: Stack, data: Int): Unit {

    var node: Node = Node(data, null)

    if (stack.head == null) {
        stack.head = node
        stack.tail = node
    } else {
        node.next = stack.head
        stack.head = node
    }

}

fun pop(stack: Stack): Unit {

    if (stack.tail != null) {
        // kotlinでは、明示的にメモリ解放しないでよいので参照しなくなったノードは気にかけない
        stack.current = stack.head
        while(stack.current?.next != null) {
            stack.current = stack.current?.next
        }
        // 最後尾をn-1番目のノードに差し替える
        stack.tail = stack.current
    }

}

fun main(args: Array<String>) {

    println(Main.factorial(5))
    
}