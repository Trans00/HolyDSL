package com.dmgburg.blocks
class AbstractElement() : Element {
    override fun render(builder: StringBuilder, indent: String) {
        builder.append(indent)
    }
}