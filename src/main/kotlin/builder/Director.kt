package org.example.builder

class Director // コンストラクタ
    (private val builder: Builder) {
    // 文書を作るメソッド
    fun construct() {
        builder.makeTitle("Greeting")
        builder.makeString("一般的なあいさつ")
        builder.makeItems(
            arrayOf(
                "How are you?",
                "Hello.",
                "Hi.",
            )
        )
        builder.makeString("時間帯に応じたあいさつ")
        builder.makeItems(
            arrayOf(
                "Good morning.",
                "Good afternoon.",
                "Good evening.",
            )
        )
        builder.close()
    }
}