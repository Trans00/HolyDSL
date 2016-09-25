package com.dmgburg

import com.dmgburg.blocks.*
import com.dmgburg.blocks.nodes.*

fun dsl(init: DSLOutput.()-> Unit): String{
    val output = DSLOutput()
    output.init()
    return output.render()
}

fun Block.raw(init: BlockWithText.() -> Unit) = initElement(BlockWithText(), init)

fun DSLOutput.body(init: Body.() -> Unit) = initElement(Body(), init)

fun Body.result(init: Result.() -> Unit) = initElement(Result(), init)

fun Body.nodes(init: Nodes.() -> Unit) = initElement(Nodes(), init)
fun Nodes.entity(init: EntityNode.() -> Unit) = initElement(EntityNode(), init)
fun Nodes.filter(init: FilterNode.() -> Unit) = initElement(FilterNode(), init)
fun Nodes.calccol(init: CalcolNode.() -> Unit) = initElement(CalcolNode(), init)
fun Node.fields(init: NodeFields.() -> Unit) = initElement(NodeFields(), init)
fun NodeFields.field(init: NodeField.() -> Unit) = initElement(NodeField(), init)