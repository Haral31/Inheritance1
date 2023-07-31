import java.util.*

fun main(){

    var robot = ROBOT("BANDU")
    println("Hey, hello my name is ${robot.name} and i am your personl assistent!!")
    println()

    robot.ringTheAlarm(7)
    println()

    robot.makeCoffee(Coffee(true,4))
    println()

    robot.heatWater(79)
    println()

    robot.packTheBag(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    println()

    robot.cook()
    println()

    robot.ironClothse("blue","black")
    println()



}
