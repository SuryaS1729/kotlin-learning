//groupBy returns a map from a list of events,
// where the keys are what I put in the lambda,
// and the values are lists, where each item is an event which has that property of the key.



data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)//task1
enum class Daypart{
    MORNING,AFTERNOON,EVENING
}//task2
val Event.durationOfEvent: String
    get() = if (durationInMinutes < 60) "short" else "long"

val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 65)
val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)

val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)//task3


val shortEvents = events.filter{
    it.durationInMinutes<60
}//task4

val groupedEvents = events.groupBy { it.daypart }//task5


fun main() {
    
    println("You have ${shortEvents.size} short events.")//task4

    
  groupedEvents.forEach { (daypart, events) ->
    println("$daypart: ${events.size} events")//task5
} 
  
  println("Last event of the day: ${events.last().title}")//task6
  
  
  
      println("Duration of first event of the day: ${events[1].durationOfEvent}")//task7

}