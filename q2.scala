import scala.io.StdIn.readInt
object q2{
    def isEven(num:Int):Boolean={ num%2==0 match{
        case true=>true
        case false=>false
    }
    }

    def checkNum(num:Int):Unit={
        num>0 match{
            case true=> isEven(num) match{
                case true=>println("Even Number is given")
                case false=>println("Odd Number is given")
            }
            case false=>println("Negative/Zero")
        }
    }    
    def main(args:Array[String]):Unit={
        print("Enter a number : ")
        checkNum(readInt())
    }
    }
