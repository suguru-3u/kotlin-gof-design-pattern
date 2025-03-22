package strategy

class Player // 名前と戦略を授けてプレイヤーを作る
    (private val name: String, private val strategy: Strategy) {
    private var wincount = 0
    private var losecount = 0
    private var gamecount = 0

    // 戦略におうかがいを立てて次の手を決める
    fun nextHand(): Hand? {
        return strategy.nextHand()
    }

    // 勝った
    fun win() {
        strategy.study(true)
        wincount++
        gamecount++
    }

    // 負けた
    fun lose() {
        strategy.study(false)
        losecount++
        gamecount++
    }

    // 引き分け
    fun even() {
        gamecount++
    }

    override fun toString(): String {
        return ("["
                + name + ":"
                + gamecount + " games, "
                + wincount + " win, "
                + losecount + " lose"
                + "]")
    }
}
