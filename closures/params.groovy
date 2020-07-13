// implicit parameter
def foo = {
    println it
}

foo('dan')
//dan

def noparams = { ->
    println "no params..."
}

noparams()
//no params...


def sayHello = { String first, String last ->
    println "Hello, $first $last"
}

sayHello("Dan","Vega")
//Hello, Dan Vega


// default values
def greet = { String name, String greeting = "Howdy" ->
    println "$greeting, $name"
}

greet("Dan","Hello")
//Hello, Dan
greet("Joe")
//Howdy, Joe



// var-arg
def concat = { String... args -> 
    args.join('')
}

println concat('abc','def')
//abcdef
println concat('abc','def','123','456')
//abcdef123456


def someMethod(Closure c) {
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def someClosure = { int x, int y -> x + y }
someMethod(someClosure)
//...
//2
//[int, int]

//someMethod { int x, int y -> x + y } other form



