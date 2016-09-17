package com.dmgburg.blocks

/**
 * Created by Denis on 17.09.2016.
 */

class Body() : Block() {
    override fun render(builder: StringBuilder, indent: String) {
        builder.append("$indent{\n")
        super.render(builder, indent)
        builder.append("$indent}\n")
    }
}

abstract class NamedElement(val name: String) : Element {
    abstract fun element(): Element
    override fun render(builder: StringBuilder, indent: String) {
        builder.append("$indent\"$name\": ")
        element().render(builder, "")
        builder.append("$indent\n")
    }
}


class Result() : NamedElement("result") {
    var text: QuotedTextElment = QuotedTextElment("")

    override fun element(): Element {
        return text
    }

    operator fun String.unaryPlus(){
        text = QuotedTextElment(this)
    }
}

