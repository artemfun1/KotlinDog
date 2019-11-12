
fun main(){
    val myDod = Dog("Fido", 70, "Mixed")
    myDod.bark()
    myDod.weigth= 75
    println("Weigth is Kgs is ${myDod.weigthInKgs}")
    myDod.weigth = - 2
    println("Weigth is ${myDod.weigth}")
    myDod.activities = arrayOf("Walks", "Fetching balls", "Frisbee")
    for (item in myDod.activities){
        println("My dog enjoys $item")
    }
    val dogs = arrayOf(Dog("Kelpie", 15, "Westie"),
        Dog("Ropper", 10, "Poodle" ))
    dogs[1].bark()
    dogs[1].weigth = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].weigth}")

}
class Dog (val name:String, weigth_param:Int, breed_param:String){
    init {
        print("Dog $name has been created.")
    }
    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()
    init{
        println("The breed is $breed.")
    }
    var weigth = weigth_param
        set(value) {
            if (value>0) field = value
        }
    val weigthInKgs:Double
    get()=weigth/2.2
    fun bark() {
        println(if (weigth<20) "Yip!" else "Woof!")
    }
}