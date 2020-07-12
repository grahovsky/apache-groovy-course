Range r = 1..10
println r
//1..10
println r.class.name
//groovy.lang.IntRange
println r.from
//1
println r.to
//10

assert (0..10).contains(0)
assert (0..10).contains(10)
assert (0..10).contains(-1) == false
assert (0..10).contains(11) == false

assert (0..<10).contains(0)
assert (0..<10).contains(10) == false

Date today = new Date()
Date oneWeekAway = today + 7 // thank the GDK for that simple statement

println today
//Sun Jul 12 22:18:53 MSK 2020
println oneWeekAway
//Sun Jul 19 22:18:53 MSK 2020


Range days = today..oneWeekAway
println days
//Sun Jul 12 22:19:20 MSK 2020..Sun Jul 19 22:19:20 MSK 2020

Range letters = 'a'..'z'
println letters
//println letters