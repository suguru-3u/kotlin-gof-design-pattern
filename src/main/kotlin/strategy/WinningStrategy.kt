package strategy

import java.util.*

class WinningStrategy(seed: Int) : Strategy {
    private val random = Random(seed.toLong())
    private var won = false
    private var prevHand: Hand? = null

    override fun nextHand(): Hand? {
        if (!won) {
            prevHand = Hand.Companion.getHand(random.nextInt(3))
        }
        return prevHand
    }

    override fun study(win: Boolean) {
        won = win
    }
}
