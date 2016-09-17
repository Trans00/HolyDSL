package com.dmgburg.blocks

class BlockWithText() : Block() {
    operator fun String.unaryPlus(){
        children.add(TextElement(this))
    }
}