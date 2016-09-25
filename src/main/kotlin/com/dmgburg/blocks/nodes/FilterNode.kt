package com.dmgburg.blocks.nodes

import kotlin.properties.Delegates

/**
 * Created by Denis on 17.09.2016.
 */

class FilterNode : Node(NodeType.FILTER){
    var inputRef by Delegates.notNull<String>()
    var condition by Delegates.notNull<String>()

    override fun render(builder: StringBuilder, indent: String) {
        super.render(builder, indent)
        builder.append("$indent\"inputRef\":").append(inputRef).append("\n")
        builder.append("$indent\"condition\":").append(" \"$condition\"").append("\n")
    }
}