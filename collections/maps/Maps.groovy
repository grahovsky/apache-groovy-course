def map = [:]
println map
println map.getClass().getName()
//java.util.LinkedHashMap


def person = [first:"Dan",last:"Vega",email:"danvega@gmail.com"]
println person
//[first:Dan, last:Vega, email:danvega@gmail.com]
println person.first
//Dan
f = "first"
println person.(f)
//Dan
println person."$f"
//Dan


person.twitter = "@therealdanvega"
println person
//[first:Dan, last:Vega, email:danvega@gmail.com, twitter:@therealdanvega]


def emailKey = "EmailAddress"
def twitter = [username:"@therealdanvega",(emailKey):"danvega@gmail.com"]
//def twitter = [username:"@therealdanvega","$emailKey":"danvega@gmail.com"]
//[username:@therealdanvega, EmailAddress:danvega@gmail.com]


println person.size()
//4
println person.sort()
//[email:danvega@gmail.com, first:Dan, last:Vega, twitter:@therealdanvega]


// looping through person
for( entry in person ) {
    println entry
}
//first=Dan
//last=Vega
//email=danvega@gmail.com
//twitter=@therealdanvega


for( key in person.keySet() ) {
    println "$key:${person[key]}"
}
//first:Dan
//last:Vega
//email:danvega@gmail.com
//twitter:@therealdanvega


// each | eachWithIndex
person.each { key, value ->
    println "$key is ${value}"
}
//first is Dan
//last is Vega
//email is danvega@gmail.com
//twitter is @therealdanvega
