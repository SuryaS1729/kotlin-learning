// 2. Mobile Notifications
fun main() {
    val morningNotification = 51
    val eveningNotification = 135
    
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}


fun printNotificationSummary(numberOfMessages: Int) {
    // Fill in the code.
    if(numberOfMessages<100){
        println("You have $numberOfMessages notifications")
    }else{
        println("Your phone is blowing up! You have 99+ notifications")
    }
}

fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    
    val isMonday = true
    
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

// 3. Movie Ticket Prices

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    // Fill in the code.
    
    if(age<0){
        return -1
    }else if(age<=12){
        return 15

    }else if (age<=60){
        if(isMonday){
            return 25
        }else{
            return 30
        }
        
    }else if(age<=100){
        return 20
    }else{
        return -1
    } 
}

// 4. Temp Calc

fun main() {
    // Fill in the code.
   printFinalTemperature(27.0,"Celsius","Fahrenheit",::cToF)
    printFinalTemperature(350.0,"Kelvin","Celsius",::kToC)
     printFinalTemperature(10.0,"Fahrenheit","Kelvin",::fToK)
}


fun printFinalTemperature(
    initialMeasurement: Double, 
    initialUnit: String, 
    finalUnit: String, 
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

fun cToF(temp: Double): Double{
    val Fresult = ((9.0/5.0)*temp)+32
    return Fresult
}

fun kToC(temp: Double): Double{
    val Cresult = temp - 273.15
    return Cresult
}


fun fToK(temp: Double): Double{
    val Kresult = ((5.0/9.0)*(temp-32))+273.15
    return Kresult
}

//4.Temp Calc with lambda functions

fun main() {    
        printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
        printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
        printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }
}


fun printFinalTemperature(
    initialMeasurement: Double, 
    initialUnit: String, 
    finalUnit: String, 
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

//5. Song catalog
fun main(){
       val brunoSong = Song("We Don't Talk About Bruno", "Encanto Cast", 2022, 1_000_000)
    brunoSong.printDescription()
    println(brunoSong.isPopular)
}
class Song(val title: String, val artist: String, val yearPublished: Int, val playCount: Int){
        val isPopular: Boolean
          get() = playCount >= 1000

        fun printSongDescription(){
            println("$title, performed by $artist, was released in $yearPublished.")
        }
      
        

}


//6. Internet Profile
fun main() {    
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    
    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if(hobby != null) {
            print("Likes to $hobby. ")
        }
        if(referrer != null) {
            print("Has a referrer named ${referrer.name}")
            if(referrer.hobby != null) {
                print(", who likes to ${referrer.hobby}.")
            } else {
                print(".")
            }
        } else {
            print("Doesn't have a referrer.")
        }
        print("\n\n")
    }
}

// 7. Foldable Phone

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }
    
    fun switchOff() {
        isScreenLightOn = false
    }
    
    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = true): Phone() {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }
    
    fun fold() {
        isFolded = true
    }
    
    fun unfold() {
        isFolded = false
    }
}

fun main() {    
    val newFoldablePhone = FoldablePhone()
    
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
    newFoldablePhone.unfold()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
}

//8. Special Auction

fun main() {
    val winningBid = Bid(5000, "Private Collector")
    
    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)
 
fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
   // Fill in the code.
    
    if(bid != null){
        return bid.amount
    }else{
        return minimumPrice
    }
    
    //bid?.amount ?: minimumPrice
}