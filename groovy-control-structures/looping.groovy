// Looping
// --------------------------------------------

// while
List numbers = [1,2,3]
while( numbers ) {
    // do something
    print numbers[0]
    numbers.remove(0)
}

assert numbers == []

// for 

//for( variable in iterable ) {
//}

List nums = [1,2,3]
for( Integer i in 1..10 ) {
    println i
}

for( i in 1..5 ) { 

}

Closure c = { } 


// return/break/continue

String getFoo() {
    "foo"
}

Integer a = 1
while( true ) { // infinite loop
    a++
    break
}
assert a == 2

for( String s in 'a'..'z' ){
    if( s == 'a') continue
    print "$s "
    if( s > 'e' ) break
}
//b c d e f 

(1..100).each() { it ->
   
    if (it < 11) {
        println it
    }
    
}

