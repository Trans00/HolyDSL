package com.dmgburg.blocks.nodes

import com.dmgburg.blocks.Block
import kotlin.properties.Delegates

/**
 * Created by Denis on 17.09.2016.
 */

class NodeField : Block(){
    var name by Delegates.notNull<String>()
    var expression by Delegates.notNull<String>()

    override fun render(builder: StringBuilder, indent: String) {
        builder.append(indent).append("{")
                .append(" \"name\": \"$name\"")
                .append(", \"expression\": \"$expression\"")
                .append("},")
    }
}