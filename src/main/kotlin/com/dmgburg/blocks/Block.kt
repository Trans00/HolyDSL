package com.dmgburg.blocks

/**
 * Created by Denis on 17.09.2016.
 */

abstract class Block: Element{
    val children = arrayListOf<Element>()

    override fun render(builder: StringBuilder, indent: String) = children.forEach { it.render(builder, "  $indent")}

    override fun toString(): String {
        val builder = StringBuilder()
        render(builder, "")
        return builder.toString()
    }

    fun <T : Element> initElement(element: T, init: T.() -> Unit) : T{
        element.init()
        children.add(element)
        return element
    }
}
