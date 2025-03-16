package org.example.builder

import java.io.FileWriter
import java.io.IOException
import java.io.Writer

class HTMLBuilder : Builder() {
    var hTMLResult: String = "untitled.html"
        private set
    private val sb = StringBuilder()

    override fun makeTitle(title: String?) {
        hTMLResult = "$title.html"
        sb.append("<!DOCTYPE html>\n")
        sb.append("<html>\n")
        sb.append("<head><title>")
        sb.append(title)
        sb.append("</title></head>\n")
        sb.append("<body>\n")
        sb.append("<h1>")
        sb.append(title)
        sb.append("</h1>\n\n")
    }

    override fun makeString(str: String?) {
        sb.append("<p>")
        sb.append(str)
        sb.append("</p>\n\n")
    }

    override fun makeItems(items: Array<String?>?) {
        sb.append("<ul>\n")
        if (items != null) {
            for (s in items) {
                sb.append("<li>")
                sb.append(s)
                sb.append("</li>\n")
            }
        }
        sb.append("</ul>\n\n")
    }

    override fun close() {
        sb.append("</body>")
        sb.append("</html>\n")
        try {
            val writer: Writer = FileWriter(hTMLResult)
            writer.write(sb.toString())
            writer.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}