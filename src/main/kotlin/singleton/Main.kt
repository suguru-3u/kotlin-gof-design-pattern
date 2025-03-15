package org.example.singleton

/**
 * Kotlinでシングルトンパターンを実装する場合
 * objectを使用すると簡単に実装できそう
 */

fun main(){
    println("Start")
    Singleton.hello()
    println("End")
    Singleton.hello()

}