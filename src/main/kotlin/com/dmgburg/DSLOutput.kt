package com.dmgburg

import com.dmgburg.blocks.Block

class DSLOutput() : Block() {
    fun render(): String {
        val builder = StringBuilder()
        render(builder, "")
        return builder.toString()
    }
}