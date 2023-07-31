
import java.util.*


class ROBOT(var name: String){

    fun ringTheAlarm(time:Int) = println("Good moring!! Its $name, its $time to wake up bhava")

    fun makeCoffee(coffee: Coffee) {
        if (coffee.Black){
            println("your black coffee ready with ${coffee.numberOfSuger}")
        } else {
            println("your coffee is redy with ${coffee.numberOfSuger}")
        }
    }

    fun heatWater(temp: Int) = println("Bath of tihs $temp is ready . take the bath now")

    fun packTheBag(day:Int) {
        val messageTemplate = "the books kept for today are: "

        val subject = arrayOf("MATHS", "CHEM", "PHY", "ENGLISH", "MARATHI")

        when (day) {
            Calendar.MONDAY -> println("$messageTemplate ${subject[0]},${subject[1]}")
            Calendar.THURSDAY -> println("$messageTemplate ${subject[0]},${subject[2]},${subject[1]}")
            Calendar.WEDNESDAY -> println("$messageTemplate ${subject[4]},${subject[3]}")
            Calendar.TUESDAY -> println("$messageTemplate ${subject[3]},${subject[2]}")
            Calendar.FRIDAY -> println("$messageTemplate ${subject[3]},${subject[1]}")
            Calendar.SATURDAY -> println("$messageTemplate ${subject[0]},${subject[3]},${subject[2]}")

            else -> println("invalid day or it must the sunday")
        }
    }

    fun cook(){
        val breakFast = mutableListOf("pohe","ladu","biskits","eggs","uupmaa")
        val lunch = mutableListOf("muttan","chikan","dalRiec","poli","khadan")

        println("for today breakfast is ${breakFast.random()} and lunch is ${lunch.random()}")
    }


    fun ironClothse(shirtColor: String, trouserColor: String){
        val shirtColor = mutableListOf("blue", "black","green","yello","red")
        val trouserColor = mutableListOf("violet", "pink", "orange")

        if (shirtColor.contains<Any>(shirtColor)){
            if (trouserColor.contains<Any>(trouserColor)){
                println("the clothes are ready")
            } else {
                println("you not have this type of color becuse you are garib so go and shop in chor bajar")
            }

        } else {

            println("you not have this type of color becuse you are garib so go and shop in chor bajar")

        }
    }


    }




