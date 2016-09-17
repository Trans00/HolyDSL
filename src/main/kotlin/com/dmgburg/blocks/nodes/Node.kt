package com.dmgburg.blocks.nodes

import com.dmgburg.blocks.Block
import com.dmgburg.fields
import kotlin.properties.Delegates

/**
 * Created by Denis on 17.09.2016.
 */

abstract class Node(val type: NodeType) : Block() {
    var id by Delegates.notNull<String>()
    var name by Delegates.notNull<String>()

    override fun render(builder: StringBuilder, indent: String) {
        builder.append("$indent{")
                .append("\"type\":\"${type.typeName}\"")
                .append(", \"id\": \"$id\"")
                .append(", \"name\": \"$name\"")
        if (children.size > 0) {
            builder.append(",\n")
        }
        super.render(builder, indent)
        builder.append("$indent}\n")
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other?.javaClass != javaClass) return false

        other as Node

        if (type != other.type) return false

        return true
    }

    override fun hashCode(): Int {
        return type.hashCode()
    }

}