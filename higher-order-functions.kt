//forEach()
class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)
val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut", 
        softBaked = true, 
        hasFilling = false, 
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)
//forEach
fun main() {
	 cookies.forEach {
        println("Menu item: ${it.name}")
    }
}
//map
fun main() {
	val fullMenu = cookies.map {
    "${it.name} - $${it.price}"
}
    println("Full Menu:")
    fullMenu.forEach{
        println(it)
    }
}
//filter()
fn main(){
      val softBakedMenu = cookies.filter {
    it.softBaked
}
    println("")
    println("Soft cookies:")
softBakedMenu.forEach {
    println("${it.name} - $${it.price}")
}
}
//groupBy
fn main(){
       
  val groupedMenu = cookies.groupBy { it.softBaked }
  val softBakedMenu = groupedMenu[true] ?: listOf()
val crunchyMenu = groupedMenu[false] ?: listOf()

println("Soft cookies:")
softBakedMenu.forEach {
    println("${it.name} - $${it.price}")
}
println("Crunchy cookies:")
crunchyMenu.forEach {
    println("${it.name} - $${it.price}")
}
}

//fold

fun main() {   
    val totalPrice = cookies.fold(0.0) {total, cookie ->
    total + cookie.price
}
    println("Total price: $${totalPrice}")   
}

//sortedBy

fun main(){
val alphabeticalMenu = cookies.sortedBy {
    it.name
}
println("Alphabetical menu:")
alphabeticalMenu.forEach {
    println(it.name)
}
}