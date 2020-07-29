class IntegerCategory {

    static Integer timesThree(Integer num) {
        num * 3
    }

//    static def timesFour = { it ->
//        it * 4
//    }

}

use(IntegerCategory) {

    println 2.timesThree()
    println 4.timesThree()
    println 5.timesThree()
    println 10.timesThree()

//    println IntegerCategory.timesFour(10)

}
