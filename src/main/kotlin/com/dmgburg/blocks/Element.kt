package com.dmgburg.blocks

interface Element {
    fun render(builder: StringBuilder, indent: String)
}