package org.example.factoryMethod

/**
 * Factory Method
 *
 * Template Methodと同様に親クラスが処理の流れを決めて
 * 詳細なロジックは子クラスで実装していくパターン
 *
 * 使う場面としては、似たような種類のクラスを作成するに使えそう。
 * クラスを作成する際にif文があるとよりいいかも
 *
 */

fun main(){
    val factory = IdCardFactory()
    val idCard = factory.create("田中")
    idCard.use()
}