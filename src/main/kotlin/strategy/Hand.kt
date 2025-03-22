package strategy

enum class Hand(val name2: String, private val handvalue: Int) {// コンストラクタ
    // じゃんけんの手を表す3つのenum定数
    ROCK("グー", 0),
    SCISSORS("チョキ", 1),
    PAPER("パー", 2);

    // thisがhより強いときtrue
    fun isStrongerThan(h: Hand?): Boolean {
        return fight(h) == 1
    }

    // thisがhより弱いときtrue
    fun isWeakerThan(h: Hand?): Boolean {
        return fight(h) == -1
    }

    // 引き分けは0, thisの勝ちなら1, hの勝ちなら-1
    private fun fight(h: Hand?): Int {
        return if (this == h) {
            0
        } else if ((this.handvalue + 1) % 3 == h!!.handvalue) {
            1
        } else {
            -1
        }
    }

    // じゃんけんの「手」の文字列表現
    override fun toString(): String {
        return name2
    }

    companion object {
        // 手の値から定数を得るための配列
        private val hands = arrayOf(
            ROCK, SCISSORS, PAPER
        )

        // 手の値からenum定数を得る
        fun getHand(handvalue: Int): Hand {
            return hands[handvalue]
        }
    }
}
