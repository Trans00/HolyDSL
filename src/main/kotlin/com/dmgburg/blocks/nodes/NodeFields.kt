package com.dmgburg.blocks.nodes

import com.dmgburg.blocks.Block

/**
 * Created by Denis on 17.09.2016.
 */

class NodeFields : Block() {

    override fun render(builder: StringBuilder, indent: String) {
        builder.append("$indent\"fields\": (\n")
        children.forEach {
            it.render(builder, "  $indent")
            builder.append("\n")
        }
        builder.append("$indent)\n")
    }
}