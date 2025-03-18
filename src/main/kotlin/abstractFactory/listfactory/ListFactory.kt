package abstractFactory.listfactory

import factory.Factory

class ListFactory : Factory() {
    fun createLink(caption: String?, url: String?): Link {
        return ListLink(caption, url)
    }

    fun createTray(caption: String?): Tray {
        return ListTray(caption)
    }

    fun createPage(title: String?, author: String?): Page {
        return ListPage(title, author)
    }
}
