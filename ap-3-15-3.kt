/**
 * Banzragch Ganchimeg(BZ), 2016139
 * March 15th, 2019
 */

fun main(){
	val madeupnames = arrayListOf("Superman", "Spider man", "Wonder woman", "Thor", "Black Panther", "Batman", "Cat", "Invisible Woman", "Iron man", "Hulk", "Aquaman")
  val realnames = arrayListOf("Clark Kent","Peter Parker", "Diana", "Thor", "T'Challa", "Bruce Wayne", "???", "Susan Storm-Richards", "Tony Stark", "Bruce Banner", "Orin")
	val powerlvl = arrayListOf("100", "85", "90", "95", "80", "92", "75", "92", "97", "85", "75")
	val gender = arrayListOf("M", "M", "F", "M", "M", "M", "F", "F", "M", "M", "M")
	val mapHero = HashMap<String,List<String>>()
  var choose: String
	val size: Int

	size = madeupnames.size-1
	for(i in 0..size) mapHero.put(madeupnames[i], listOf(realnames[i], powerlvl[i], gender[i]))

	choose = "Batman"
	println("Made Up Name, Real Name, Power, Gender]")
	println("$choose ${mapHero[choose]}")

	choose = "100"
	for(key in mapHero.keys){
		val power = (mapHero[key] as List)[0]
		if(power == choose) println("\nSuperhero who has power $choose is $key")
	}
 }
