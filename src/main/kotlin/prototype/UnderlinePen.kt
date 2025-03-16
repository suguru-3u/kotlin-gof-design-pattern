package org.example.prototype

class UnderlinePen(private val ulchar: Char) : Product() {
    override fun use(str: String) {
        val ulen = str.length
        println(str)
        for (i in 0 until ulen) {
            print(ulchar)
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
