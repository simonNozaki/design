/**
 * シミュレータのエージェントクラス。
 * エージェントは、Pairwise-Fermiモデルに基づいて戦略を変更します。
 */
class Agent {

    var point: Float = 0.toFloat()
    var strategy = null
    var nextStrategy = null
    var neighborsId: MutableList<Int> = mutableListOf()

    /**
     * 次の戦略を決定します。
     */
    fun decideNextStrategy(agents: MutableList<Agent>): Unit {
        var opponentId: Int = this.neighborsId[0]
        var opponent: Agent = agents[opponentId]

        if (opponent.strategy != this.strategy) this.nextStrategy = opponent.strategy 
    }

    /**
     * 戦略を更新します。
     */
    fun updateStrategy(): Unit {
        this.strategy = this.nextStrategy
    }
}