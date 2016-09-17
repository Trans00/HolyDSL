package com.dmgburg.blocks

/**
 * Created by Denis on 17.09.2016.
 */

class QuotedTextElment(val text: String) : Element{
    override fun render(builder: StringBuilder, indent: String) {
        builder.append("$indent\"$text\"")
    }

}