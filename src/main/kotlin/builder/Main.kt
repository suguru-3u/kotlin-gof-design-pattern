package org.example.builder

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        if (args.size != 1) {
            usage()
            System.exit(0)
        }
        if (args[0] == "text") {
            val textbuilder: TextBuilder = TextBuilder()
            val director = Director(textbuilder)
            director.construct()
            val result: String = textbuilder.textResult
            println(result)
        } else if (args[0] == "html") {
            val htmlbuilder = HTMLBuilder()
            val director = Director(htmlbuilder)
            director.construct()
            val filename: String = htmlbuilder.hTMLResult
            println("HTMLファイル" + filename + "が作成されました。")
        } else {
            usage()
            System.exit(0)
        }
    }

    // 使い方を表示する
    fun usage() {
        println("Usage: java Main text       テキストで文書作成")
        println("Usage: java Main html       HTMLファイルで文書作成")
    }
}
