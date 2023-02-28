fun main(){
var name =Human("Mary",24,68.6)
var foodWeight=5
println("i am eating $foodWeight kg of food")

  name.eat(5)
  println(name.weight)
  name.Speak("I am a woman in Tech")
  name.birthday(1)
  var names =User("Kelly","Klein","kellyklein@gmail.com","0724329898",".....")
  println(names.email)
    println(names.phoneNumber)
}
class Human(var name:String, var age:Int,var weight:Double){
    fun eat (foodWeight:Int){
     weight+=foodWeight
    }

   fun Speak(Speech :String){
     println(Speech)
   }
    fun birthday(sum:Int){
      age+=1
      println(age)
    }
}
data class User (var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String){

}


