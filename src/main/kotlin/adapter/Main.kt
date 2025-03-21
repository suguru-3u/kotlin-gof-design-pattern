package org.example.adapter

/**
 * Adapterパターン
 * Gofのデザインパターンの一つ
 *
 * 以下のケースで使用される
 * 既存のクラスに対して新しいインターフェースを追加する場合。
 * 既存のクラスと新しいクラスとの間に互換性を持たせる場合。
 *
 * デメリット
 * Adapterパターンを過剰に使用すると、コードが複雑になり理解しにくくなる可能性がある
 * クラスが多く作成される
 *
 * 詳細
 * Target - 期待されるインターフェースを定義するクラス
 * Adaptee - 既存のインターフェースを持つクラス
 * Adapter - AdapteeのインターフェースをTargetのインターフェースに適合させるクラス
 *
 *
 */

fun main() {
    val adaptee = Adaptee()
    val adapter = Adapter(adaptee)
    val adapterRes = adapter.changeDate("Yeeeee!")
    adapterRes.forEach {
        println(it.first)
        println(it.second)
    }
}

// インターフェイス
interface Target {
    fun changeDate(value: String): List<Pair<String, String>>
}

// 既存クラス
// 受け取った文字を配列に変換する
class Adaptee() {
    fun changeList(value: String): List<String> {
        return listOf(value, "Hello", "こんにちわ")
    }
}

// 新規クラス
// 受け取った文字を配列から変換する
class Adapter(val adaptee: Adaptee) : Target {
    override fun changeDate(value: String): List<Pair<String, String>> {
        val result = adaptee.changeList(value)
        return result.map { "str" to it }
    }
}

