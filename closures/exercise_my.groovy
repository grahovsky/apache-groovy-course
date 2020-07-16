
def testMethod(Closure clo) {

    clo(5)

}

def testClosure = { x ->

    x *= x
    println x

}

testMethod(testClosure)

def testList = [1, 3, 5, 7, 9, 11]

testList.each { print "$it " }

def testMap = [one: 1, 
                three: 3, 
                five: 5, 
                seven: 7,
                eleven: 11]

testMap.each { entryset ->
    println "entryset: $entryset"
}
                
testMap.each { key, value ->
    println "key: $key, value: $value"
}

//curry

def hello = { String name, Date today, String msg -> 
    println "today: $today. $msg $name!"
}

hello("Max",new Date(),"Hi my frend...")

def helloOnToday = hello.ncurry(1,new Date())
helloOnToday("Kostyan", "Hi my Honkgonk frend...")


def testCollect = [1, 2, 2, 2, 2, 3, 4, 5, 6, 7]

testCollect.find { it < 3 }
//1
testCollect.findAll { it < 3 }.collect{ it*10 }
//[10, 20, 20, 20, 20]

def testAny = testCollect.any { it > 3 }
println testAny.getClass()
//class java.lang.Boolean
println testAny
//true

def testEvery = testCollect.every { it > 3 }
println testEvery.getClass()
//class java.lang.Boolean
println testEvery
//false

def testGroupBy = testCollect.groupBy{ it }
//[1:[1], 2:[2, 2, 2, 2], 3:[3], 4:[4], 5:[5], 6:[6], 7:[7]]
def testGroupBy2 = testCollect.groupBy{ it < 4 }
//[true:[1, 2, 2, 2, 2, 3], false:[4, 5, 6, 7]]











