package com.dmgburg

fun main(args: Array<String>) {
    val output =
dsl {
  raw {
            +"""
#parse("/holy/macros/macro1.macro")
#parse("/holy/macros/macro2.macro")

"""
  }
  body {
     raw { +""""Some raw input here"""" }
     result{+"Standard, Details, History"}
     nodes {
        entity {name="SettProfTable"; id="SettProfiles";}
        entity {
           name="ClientSettProfTable"
           id="ClientSettProfiles"
           fields{
               field{name="RecordID"; expression="RecordID"}
               field{name="OrdCorrId"; expression="objectToLong(OrdCorrId)"}
           }
       }
     }
  }
}

    println(output)
}