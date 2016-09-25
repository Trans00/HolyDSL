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
               raw { +""""Some raw input even here"""" }
               field{name="RecordID"; expression="RecordID"}
               field{name="OrdCorrId"; expression="objectToLong(OrdCorrId)"}
           }
        }
        filter {
            id = "StandardSpOrdHistory";
            inputRef = "RawOrdHistory";
            condition = "and(SenderCompId == \"\${ord.blott.taps.comp-i})\", #StandSpOrd(\"Product\",\"Type\"))"
        }
        calccol {
            id = "All StandSpOrd"
            inputRef = "FilteredStandSpOrd"
            fields {
                field { name = "WorkingAmount"; expression = "longToDouble(WorkingAmount, WorkingAmountScale)" }
                field { name = "FilledAmount"; expression = "longToDouble(FilledAmount, FilledAmountScale)" }
            }
        }
     }
  }
}

    println(output)
}