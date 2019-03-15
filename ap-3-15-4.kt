/**
 * Banzragch Ganchimeg(BZ), 2016139
 * March 15th, 2019
 */

fun main(){
 val madeupnames = arrayListOf("Superman", "Spider man", "Wonder woman", "Thor", "Black Panther", "Batman", "Cat", "Invisible Woman", "Iron man", "Hulk", "Aquaman")
 val realnames = arrayListOf("Clark Kent","Peter Parker", "Diana", "Thor", "T'Challa", "Bruce Wayne", "???", "Susan Storm-Richards", "Tony Stark", "Bruce Banner", "Orin")
 val powers = arrayListOf("100", "85", "90", "95", "80", "92", "75", "92", "97", "85", "75")
 val genders = arrayListOf("M", "M", "F", "M", "M", "M", "F", "F", "M", "M", "M")
 val mapHero = HashMap<String,List<String>>()
 val size: Int


 size = madeupnames.size-1
 for(i in 0..size) mapHero.put(madeupnames[i], listOf(realnames[i], powers[i], genders[i]))

 println("Superhero Real Name, Power, Gender")
 for(key in mapHero.keys) println("$key ${mapHero[key]}")
 println()

 println("Male Heroes")
 for(key in mapHero.keys){
   val male = (mapHero[key] as List)[2]
   if(male == "M") println(key)
 }
 println()


 println("Heros that have power level above 90")
 for(key in mapHero.keys){
   val power = (mapHero[key] as List)[1].toInt()
   if(power > 89) println(key)
 }
}
