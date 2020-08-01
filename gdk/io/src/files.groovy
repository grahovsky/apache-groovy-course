// create a new file
def file = new File('dummy.txt')
file.write("This is some new text \n")

// or new File('dummy.txt').text = 'this is a one liner'

// append
file.append("I am appending text...\n")

// readLines
List lines = file.readLines()
println lines
lines.each { line ->
     println line
}

// create a new file with a bunch of text and read it
// println new File('dummy.txt').text

// list all the files in a directory
// eachFile(closure)
String dir = '../../../'
new File(dir).eachFile { fileInDir ->
    // show all first
    if( fileInDir.isFile() ){
        println fileInDir.name
    }

}

// eachFileRecurse
String groovyCourse = '../../../'
new File(groovyCourse).eachFileRecurse { fileRecurse ->
    // show all first
    if( fileRecurse.isFile() && fileRecurse.name != '.git' ){
        println fileRecurse.name
    }

}


// list only certain files from this directory
new File('.').eachFile { fileGroovy ->
    if( fileGroovy.name.endsWith('.groovy') ) {
        println fileGroovy.name
    }
}