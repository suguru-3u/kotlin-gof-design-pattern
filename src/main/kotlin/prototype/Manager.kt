package org.example.prototype

class Manager {
    private val showcase: MutableMap<String, Product> = HashMap()

    fun register(name: String, prototype: Product) {
        showcase[name] = prototype
    }

    fun create(prototypeName: String): Product? {
        val p = showcase[prototypeName]
        return p?.createCopy()
    }
}