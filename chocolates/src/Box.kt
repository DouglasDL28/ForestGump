import java.util.*

abstract class Box<T> (val buffer: ArrayList<T>) {
    fun PickOne (): T? {
       val pick = buffer.removeAt(Random().nextInt(buffer.size))
        return pick
    }
}