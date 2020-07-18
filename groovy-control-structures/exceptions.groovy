// Exceptions 
// ---------------------------------------
/*
public void foo() throws Exception {
    throw new Exception()
}
*/

def foo() {
    // do stuff
    throw new Exception("Foo Exception")
}

List log = []

try {
  foo()  
} catch( Exception e ) {
    log << e.message
} finally {
    log << 'finally'
}

println log
//[Foo Exception, finally]


// Java 7 introduced a multi catch syntax
try {
    throw new FileNotFoundException("file not found") 
    // do stuff
} catch( FileNotFoundException | NullPointerException e ) {
    println e.class.name
    println e.message
}
//java.io.FileNotFoundException
//file not found
 