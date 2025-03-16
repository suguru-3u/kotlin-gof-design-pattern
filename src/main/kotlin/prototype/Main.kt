package org.example.prototype

/**
 *　prototypeはクラスをコピーするが管理が大変そう
 *  実際に使うときは、ファクトリークラスやコピーコンストラクタを使用する方が良さそう
 *  Kotlinにはdata classがあるのでそっちを使う方が簡単。
 */

fun main(args: Array<String>) {
    // 準備
    val manager = Manager()
    val upen = UnderlinePen('-')
    val mbox = MessageBox('*')
    val sbox = MessageBox('/')

    // 登録
    manager.register("strong message", upen)
    manager.register("warning box", mbox)
    manager.register("slash box", sbox)

    // 生成と使用
    val p1 = manager.create("strong message")
    p1!!.use("Hello, world.")

    val p2 = manager.create("warning box")
    p2!!.use("Hello, world.")

    val p3 = manager.create("slash box")
    p3!!.use("Hello, world.")

}