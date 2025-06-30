//making a resusable class with generics


class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)






fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", "medium")
    val question2 = Question<Boolean>("The sky is green. True or false", false, "easy")
    val question3 = Question<Int>("How many days are there between full moons?", 28, "hard")
}

// ENUMS IN KOTLIN


class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)

enum Difficulty {
    EASY, MEDIUM, HARD
}




fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
}