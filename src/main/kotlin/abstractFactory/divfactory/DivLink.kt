package abstractFactory.divfactory

import factory.Link

class DivLink(caption: String?, url: String?) : Link(caption, url) {
    fun makeHTML(): String {
        return "<div class=\"LINK\"><a href=\"$url\">$caption</a></div>\n"
    }
}
