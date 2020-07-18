@groovy.transform.ToString
class Person {
    
    String first,last

    // constructor
    Person(String fullName) {
        List parts = fullName.split(' ')
        first = parts[0]
        last = parts[1]
    }
    
    // methods
    public void foo(String a, String b) {
        // do stuff
    }
    
    String getFullName(){
        "$first $last"
    }
    
    def bar(){
        "bar testing.."
    }
    
    static String doGoodWork(){
        println "doing good work..."
    }
    
    List someMethod(List numbers = [1,2,3], Boolean canAccessAll = false ){
    
    }
    
    def concat(String... args) {
        println args.length
    }

}

//Person p = new Person(first:'Dan',last:'Vega')
//println p
//Person(Dan, Vega, Dan Vega)
 
Person p = new Person("Dan Vega")
println p
//Person(Dan, Vega, Dan Vega)

Person.doGoodWork()
//doing good work...

p.concat('a','b','c','d')
//4
