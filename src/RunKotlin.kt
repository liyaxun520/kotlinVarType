fun main() {
    print()
    changVarVal()
}

fun print() {
    println("========================>已执行")
}

fun changVarVal(){
    var name :String ="lison"
    var age:Int = 20
    val city:String  ="XA"
    //系统推断功能
    var secondName = "lison"
    var secondAge = 20
    /**
     * Byte 	8
        Short 	16
        Int 	32
        Long 	64
        Float 	32
        Double 	64
     */

    arrayOf("a","b","c","d")
        .forEach {
            println("遍历后的值  $it")
        }

    //Kotlin的字符串是现代化的字符串，支持原始字符串(raw string)，用三个引号包起来
    println("""
    床前明月光，疑是地上霜；
    举头望明月，低头思故乡。""".trimIndent())  //字符串的内容会原样输出

    println("""
        问世间情为何物，
        直教人生死相许。
    """.trimIndent())

    for (i in 1..5){
        println("当前值  $i")
    }

    (1..5).forEach{
        println("========>$it")
    }

    for (i in 1 until 5){
        println("半开区间  $i")
    }

    var weight = 110
    when(weight){
        // in可以判断一个值是否在一个区间之内
        in 100..110 -> println("正常")
        in 120..140 -> println("微胖")
    }

    var na = if(age >30){
        println("我是中年啦，体力不支了")
        "中年"
    }else{
        println("我还是很年轻，精力很充沛哦")
        "青年"
    }

    println(na)
}
