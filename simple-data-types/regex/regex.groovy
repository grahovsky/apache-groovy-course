// Java Sample Pattern

import java.util.regex.*;
Pattern pattern = Pattern.compile("a\\\\b")
println pattern
//a\\b
println pattern.class
//class java.util.regex.Pattern

// What patterns will look like in Groovy

String slashy = /a\b/
//a\b
String url = $/http://threaldanvega.com/blog/$

println slashy.class
//class java.lang.String

def pattern = ~/a\b/
println pattern.class
//class java.util.regex.Pattern


// Find | Match

def text = "Being a Cleveland Sports Fan is no way to go through life" // true
def pattern = ~/Cleveland Sports Fan/
def finder = text =~ pattern
def matcher = text ==~ pattern

println finder
//java.util.regex.Matcher[pattern=Cleveland Sports Fan region=0,57 lastmatch=]
println finder.size()
//1
println matcher
//false


// ----------------------------------------------------------------------------------

def text = "Cleveland Sports Fan"
def pattern = ~/Cleveland Sports Fan/
def matcher = text ==~ pattern

println matcher
//true

if( matcher ) { // do something }


// ----------------------------------------------------------------------------------

def text = "Being a Cleveland Sports Fan is no way to go through life" // true
def pattern = ~/Cleveland/

text = text.replaceFirst(pattern,"Buffalo")
println text
//Being a Buffalo Sports Fan is no way to go through life

def text2 = "Being a Cleveland Sports Fan is no way to go through life" // true
def pattern2 = ~/.*Cleveland (.*) is no way (.*) life/
def result = (text2 =~ pattern2)[0][1]
println result
//Sports Fan
println "${(text2 =~ pattern2)[0][2]}"
//to go through


