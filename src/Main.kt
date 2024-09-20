interface Cleaning {
    fun doCleaning()
}
interface Cooking {
    fun doCooking()
}

class Son : Cleaning {
    override fun doCleaning() {
        println("Son did the cleaning!")
    }
}

class Daughter : Cooking {
    override fun doCooking() {
        println("Daughter did the cooking!")
    }
}
class Mother(son: Son, daughter: Daughter) : Cleaning by son, Cooking by daughter {
    fun setTable() {
        println("Mom set the table")
    }
}

fun main() {
    val mother = Mother(Son(), Daughter())
    // waiting guests
    mother.doCleaning()
    mother.doCooking()
    mother.setTable()
}
/*
В коде выше написаны два интерфейса — Cleaning и Cooking. Их наследуют классы Son и Daughter.
 Если мы посмотрим класс Mother, то увидим, что уборку и готовку мама делегирует сыну и дочке через ключевое слово by.
 Можно делегировать больше одного интерфейса. А вот абстрактные классы и открытые для наследования классы делегировать не получится.
 */