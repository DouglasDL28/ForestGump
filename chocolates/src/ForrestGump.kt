
abstract class ForrestGump<T> (val life: Box<T>) {
    fun PickaChocolate (): T? {
        val pick = life.PickOne()
        if(pick != null) {
            println(pick)
            println("La vida es un chocolate!")
        } else {
            print("Life sucks!")
        }
        return pick
    }
}
