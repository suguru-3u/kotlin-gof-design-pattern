package org.example.templateMethod

class StringDisplay(
    private val str: String,
    private val width: Int
) : AbstractDisplay() {
    override fun open() {
        printLine()
    }

    override fun print() {
        println("| $str |")
    }

    override fun close() {
        printLine()
    }

    private fun printLine() {
        print("+ ")
        repeat(width) {
            print("-")
        }
        println(" +")

    }
}