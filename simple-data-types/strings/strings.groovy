// Working with Strings in Groovy


// Java :: 

char c = 'c'
println c.class
//class java.lang.Character

String str = "this is a string"
println str.class
//class java.lang.String

// Groovy ::

def c2 = 'c'
println c2.class
//class java.lang.String

def str2 = 'this is a string'
println str2.class
//class java.lang.String

// string interpolation

String name = "Dan"
String msg = "Hello " + name + "..."
println msg
//Hello Dan...

String msg2 = "Hello ${name}"
println msg2
//Hello Dan

String msg3 = 'Hello ${name}'
println msg3
//Hello ${name}

String msg4 = "We can evaulate expressions here: ${1 + 1}"
println msg4
//We can evaulate expressions here: 2

// multiline strings

def aLargeMsg = """
A 
Msg
goes 
here and 
keeps going ${1+1}
"""

println aLargeMsg

// dollar slashy

def folder = $/C:\groovy\dan\foo\bar${1+1}/$
println folder
//C:\groovy\dan\foo\bar2


