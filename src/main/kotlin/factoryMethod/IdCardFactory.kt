package org.example.factoryMethod

class IdCardFactory: Factory() {
    override fun createProduct(owner: String): Product {
        return IdCard(owner)
    }

    override fun registerProduct(product: Product) {
        println("登録します")
    }
}