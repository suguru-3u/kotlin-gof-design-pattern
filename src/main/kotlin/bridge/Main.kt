package bridge

/**
 * bridgeパターンについて
 *
 * ・ジャンル
 * 構造に関するデザインパターン
 * 構造の柔軟性と効率を維持しつつ、 オブジェクトとクラスを大きな構造に束ねる方法
 *
 * ・複雑度
 * 星3
 *
 * ・人気度
 * 星1
 *
 * ・そもそも何？
 * 一つのクラスでなんでも行っていることを複数のクラスに分割することで、変更に強いクラスを作成するパターン
 * クラスの分け方は、機能クラスと実装クラスのグループに分ける。
 * クライアントは機能クラスとのみやりとりを行い、機能クラスはリクエストを受けたら詳細の実装を行っている
 * 実装クラスを呼び出して、処理を実行する
 *
 * ・どういった場面で使用される？
 *  機能にちょっとした違い変種がある場合、 一枚岩のコードを分割して組織するために、Bridge パターンを使用する
 *  例としては、大盛りスパゲッティーのように見えるクラスが対象で、様々な API と様々な GUI を接続する何百もの条件文が、
 *  コード全体に散らばっている場合が特に有効。
 *
 * ・使用すべきではない場面
 *
 */

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val d1 = Display(StringDisplayImpl("Hello, Japan."))
        val d2: Display = CountDisplay(StringDisplayImpl("Hello, World."))
        val d3 = CountDisplay(StringDisplayImpl("Hello, Universe."))
        d1.display()
        d2.display()
        d3.display()
        d3.multiDisplay(5)
    }
}
