
fun main (args: Array<String>){

    val chocolates = arrayListOf(Chocolate("Hershey"),
            Chocolate("Granada"),
            Chocolate("Ferrero")) //ArrayList de chocolates para incluirlos en la Box

    val chocolateBox = BoxofChocolate(chocolates)

    val forrest = Forrest(chocolateBox)

    forrest.PickaChocolate()
}