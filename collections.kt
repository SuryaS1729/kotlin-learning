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

// sets in kotlin

fun main() {
val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
println(solarSystem.size)
solarSystem.add("Pluto")
println(solarSystem.size)
println(solarSystem.contains("Pluto"))
solarSystem.add("Pluto")
println(solarSystem.size)
solarSystem.remove("Pluto")
println(solarSystem.size)
println(solarSystem.contains("Pluto"))
} 

//maps in kotlin

fun main() {
val solarSystem = mutableMapOf(
    "Mercury" to 0,
    "Venus" to 0,
    "Earth" to 1,
    "Mars" to 2,
    "Jupiter" to 79,
    "Saturn" to 82,
    "Uranus" to 27,
    "Neptune" to 14)
println(solarSystem.size)
solarSystem["Pluto"] = 5
    println(solarSystem.size)
    println(solarSystem["Pluto"])
    println(solarSystem.get("Theia"))
    solarSystem.remove("Pluto")
    println(solarSystem.size)
    solarSystem["Jupiter"] = 78
println(solarSystem["Jupiter"])
}