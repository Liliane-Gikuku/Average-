fun main(){
    getSum()
    findAvg()


}
fun getSum():Int{
    var a=2
    var b=4
    var c=6
    var sum= a+b+c
    return sum
    }

    fun findAvg(){
        var sum= getSum()
        var average=sum/3
        println(average)
    }
