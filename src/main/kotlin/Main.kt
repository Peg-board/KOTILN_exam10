abstract class Animal{
    var name : String = ""
    abstract fun move()
}

interface iAnimal{
    abstract fun eat()

//    // 추상 메소드만 가능하다고 하지만 일반 메소드 사용 가능
//    fun drink(){
//        println("마신다.")
//    }
}

// iAnimal 인터페이스를 구현하여 iCat 클래스를 생성한다.
class iCat : iAnimal{
    override fun eat(){
        println("생선을 좋아한다.")
    }
}

class iTiger : Animal(), iAnimal{
    override fun move(){
        println("네발로 이동한다.")
    }

    override fun eat() {
        println("멧돼지를 잡아먹는다.")
    }
}

class Eagle : Animal(){
    var home : String = ""
    override fun move() {
        println("날개로 날아간다.")
    }
}



fun main(args: Array<String>) {

    var cat : iCat = iCat()
    cat.eat()
//    cat.drink()

    var tiger = iTiger()
    tiger.move()
    tiger.eat()

}


