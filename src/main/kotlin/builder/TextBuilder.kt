package org.example.builder

class TextBuilder : Builder() {
    private val sb = StringBuilder()

    override fun makeTitle(title: String?) {
        sb.append("==============================\n")
        sb.append("『")
        sb.append(title)
        sb.append("』\n\n")
    }

    override fun makeString(str: String?) {
        sb.append("■")
        sb.append(str)
        sb.append("\n\n")
    }

    override fun makeItems(items: Array<String?>?) {
        if (items != null) {
            for (s in items) {
                sb.append("　・")
                sb.append(s)
                sb.append("\n")
            }
        }
        sb.append("\n")
    }

    override fun close() {
        sb.append("==============================\n")
    }

    val textResult: String
        get() = sb.toString()
}