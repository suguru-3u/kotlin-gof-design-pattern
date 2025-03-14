package org.example.factoryMethod

class IdCard(
    val owner: String
) : Product() {
    override fun use() {
        println("{$owner}が使用します")
    }
}