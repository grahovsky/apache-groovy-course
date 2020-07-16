import groovy.transform.*

@ToString
class MyClass {

    String name

    def clo = { text ->
        
        println text  
        println this
        println owner
        println delegate
        
    
    }
    
    def test() {
    
        println "in procedure test()"  
        println this
    
        clo("in closure in class")
    }
    
    def doit(closure) {
    
       closure()
    
    } 
}

def my = new MyClass(name: "testclass")
my.test()

def doto = { ->
    println "in closure from out"
    println this
    println owner
    println delegate
    }
    
//my.doit(doto)

my.doit { 
    println "in closure from out"
    println this
    println owner
    println delegate
       
    }
    
    
    
    
    
    
   