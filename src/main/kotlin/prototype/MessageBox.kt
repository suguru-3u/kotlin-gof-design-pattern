package org.example.prototype

class MessageBox(internal val decochar: Char) : Product() {

    // コピーコンストラクト
    constructor(messageBox: MessageBox) : this(messageBox.decochar)

    override fun use(str: String) {
        val decolen = 1 + str.length + 1
        for (i in 0 until decolen) {
            print(decochar)
        }
        println()
        println(decochar.toString() + str + decochar)
        for (i in 0 until decolen) {
            print(decochar)
        }
        println()
    }

    override fun createCopy(): Product? {
        var p: Product? = null
        try {
            p = clone() as Product
        } catch (e: CloneNotSupportedException) {
            e.printStackTrace()
        }
        return p
    }
}