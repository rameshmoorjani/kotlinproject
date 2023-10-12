fun main(args: Array<String>) {
    val abc = 1
    var xyz =2
    var myChar:Char = 'c'
    val myBooleanValue:Boolean = true;
    println("$myChar")
    println("x+y= $")
    if(myBooleanValue==true){

        print("$myBooleanValue")
    }

    val alarm=28;
    val   text  =when(alarm){

        15-> {"good noon"}
        17 -> {"good morning"}
        in 1..10 -> {" have a good time"}
        else -> "else"

    }

    println(text)

 }
