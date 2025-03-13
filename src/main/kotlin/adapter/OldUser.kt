package org.exmaple.adapter

interface Target {
    fun printMessage()
}

class TargetIml : Target {
    override fun printMessage(){
        println("TargetIml")
    }
}

class Adaptee(){
    fun showMessage(){
        println("Adapter Hello")
    }
}

class Adapter(val adaptee:Adaptee): Target{
    override fun printMessage() {
        adaptee.showMessage()
    }
}

