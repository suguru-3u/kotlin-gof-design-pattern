package org.example.prototype

abstract class Product : Cloneable {
    abstract fun createCopy() : Product?

    abstract fun use(str: String)
}