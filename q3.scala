object q3{
    def toUpper(text:String):String=text.toUpperCase()
    def toLower(text:String):String=text.toLowerCase()
    def formatNames(name:String,formatFun:String => String):String=formatFun(name)
    def main(args:Array[String]):Unit={
        val Names=Array("Benny","Niroshan","Saman","Kumara")
        println(formatNames(Names(0),toUpper))
        println(formatNames(Names(1).substring(0,2),toUpper)+formatNames(Names(1).substring(2),toLower))
        println(formatNames(Names(2),toLower))
        println(Names(3).substring(0,5)+formatNames(Names(3).substring(5),toUpper))
    }
}