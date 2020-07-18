package com.therealdanvega

import com.therealdanvega.traits.Bird

Bird b = new Bird()
assert b.fly() == "I'm Flying!"
assert b.speak() == "I'm Speaking!"

b.runFeature()
//print b.bar()
//Caught: groovy.lang.MissingMethodException: No signature of method: