package com.dmgburg.blocks.nodes

import com.dmgburg.blocks.Block

/**
 * Created by Denis on 17.09.2016.
 */

class Nodes: Block(){
    override fun render(builder: StringBuilder, indent: String) {
        builder.append("$indent\"nodes\": (\n")
        super.render(builder, "  $indent")
        builder.append("$indent)\n")
    }
}