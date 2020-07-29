// MetaClass Demo


//Expando e = new Expando()
//e.name = 'Dan'
//e.writeCode = { -> println "$name loves to write code..."}
//e.writeCode()

class Developer {

}

// per instance
Developer dan = new Developer()
dan.metaClass.name = 'Dan'
dan.metaClass.writeCode = { -> println "$name loves to write code..."}
dan.writeCode()

//Developer dan2 = new Developer()
//dan2.writeCode()
//groovy.lang.MissingMethodException

// every instance
String.metaClass.shout = { -> toUpperCase() }
println "hello dan".shout()

Developer.metaClass.customProperties = 'Developer'
Developer.metaClass.customMethod = { -> println "$customProperties loves to write code..."}

Developer dan2 = new Developer()
dan2.customMethod()