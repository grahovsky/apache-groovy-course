//public class Person {
class Person {

    String firstName, lastName
    def dob
    // private | protected | public
    protected String f1,f2,f3
    private Date createdOn = new Date() 
    
    static welcomeMsg = 'HELLO'
    public static final String WELCOME_MSG = 'HELLO'    

    // local variables
    def foo() {
        String msg = "Hello"
        String firstName = "Dan"
        println "$msg, $firstName"
    }
    
    

}

println Person.welcomeMsg
//HELLO

Person.welcomeMsg = 'HI'
println Person.welcomeMsg
//HI

println Person.WELCOME_MSG
//HELLO
//Person.WELCOME_MSG = 'HI'
//groovy.lang.ReadOnlyPropertyException: Cannot set readonly property: WELCOME_MSG for class: Person

def person = new Person()
println person.foo()
//Hello, Dan