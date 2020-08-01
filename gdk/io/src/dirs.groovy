String groovyCourse = '../../../'


// list all the directories in a given path
List hidden = []
new File(groovyCourse).eachFile { file ->

    if( file.isDirectory() ){
        println file.name
    }

    if( file.isHidden() ) {
        hidden << file.name
    }

}

println hidden

new File(groovyCourse).eachDir { subfolder ->
    println subfolder.getCanonicalPath()
}


def groovyCourseDir = new File(groovyCourse)
println groovyCourseDir.directorySize()/1024/1024


// create a new directory
new File('dummy').mkdir()


// create a bunch of directories
new File('one/two/three').mkdirs()


new File('dummy').deleteDir()
new File('one').deleteDir()