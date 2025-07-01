

//arrays in kotlin

fun main() {
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
   val solarSystem = rockPlanets + gasPlanets
    
    println(solarSystem[0])
println(solarSystem[1])
println(solarSystem[2])
println(solarSystem[3])
println(solarSystem[4])
println(solarSystem[5])
println(solarSystem[6])
println(solarSystem[7])
}

//lists in kotlin

fun main() {
//     val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
//     println(solarSystem.size)
//     println(solarSystem[1])
//     println(solarSystem.get(3))
//     println(solarSystem.indexOf("Earth"))
//     println(solarSystem.indexOf("pluto"))
    
//     for (planet in solarSystem) {
//     println(planet)}
    
        val solarSystemMut = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
        solarSystemMut.add("Pluto")
        solarSystemMut.add(3, "Theia")

        solarSystemMut[3] = "Future Moon"
println(solarSystemMut[3])
println(solarSystemMut[9])
solarSystemMut.removeAt(9)
solarSystemMut.remove("Future Moon")
println(solarSystemMut.contains("Pluto"))

}

