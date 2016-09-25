package com.dmgburg.blocks.nodes

import com.dmgburg.blocks.Block
import kotlin.properties.Delegates

/**
 * Created by Denis on 17.09.2016.
 */

abstract class Node(val type: NodeType) : Block() {
    var id by Delegates.notNull<String>()
    var name : String? = null

    override fun render(builder: StringBuilder, indent: String) {
        with(builder) {
            append("$indent{")
            append("\"type\":\"${type.typeName}\"")
            append(", \"id\": \"$id\"")
            if (name != null) {
                append(", \"name\": \"$name\"")
            }
            if (children.size > 0) {
                append(",\n")
            }
            super.render(builder, indent)
            append("$indent}\n")
        }
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