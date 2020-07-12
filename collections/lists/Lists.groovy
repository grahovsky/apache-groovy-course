List nums = [1,2,3,6,7,9,4,5,3,6,8,9]
println nums
//[1, 2, 3, 6, 7, 9, 4, 5, 3, 6, 8, 9]
println nums.class.name
//java.util.ArrayList

//List nums = [1,2,3,6,7,9,4,5,3,6,8,9] as LinkedList
//println nums.class.name
//java.util.LinkedList


// add | remove | get | clear

nums.push(99)
println nums
//[99, 1, 2, 3, 6, 7, 9, 4, 5, 3, 6, 8, 9]
nums.putAt(0,77)
println nums
//[77, 1, 2, 3, 6, 7, 9, 4, 5, 3, 6, 8, 9]
nums[0] = 78
println nums
//[78, 1, 2, 3, 6, 7, 9, 4, 5, 3, 6, 8, 9]
println nums + 7
//[78, 1, 2, 3, 6, 7, 9, 4, 5, 3, 6, 8, 9, 7] - create a new object for result
nums + 7 //original list unchanged
println nums
//[78, 1, 2, 3, 6, 7, 9, 4, 5, 3, 6, 8, 9]
nums << 66
println nums
//[78, 1, 2, 3, 6, 7, 9, 4, 5, 3, 6, 8, 9, 66]

nums.pop()
println nums
//[1, 2, 3, 6, 7, 9, 4, 5, 3, 6, 8, 9, 66]
nums.removeAt(0)
println nums
//[2, 3, 6, 7, 9, 4, 5, 3, 6, 8, 9, 66]
def newList = nums - 3
println newList
//[2, 6, 7, 9, 4, 5, 6, 8, 9, 66]

println nums.getAt(0..3)
//[2, 3, 6, 7]

for (x in nums) {
    print x
}
//2367945368966

nums.clear()
nums = []

// flatten
nums << [3,4,5]
nums << [1,2]
println nums
//[[3, 4, 5], [1, 2]]
println nums.flatten()
//[3, 4, 5, 1, 2]

// equals
def myNumbers = [1,2,3]
def myNumbers2 = [1,2,3]
println myNumbers.equals(myNumbers2)
//true

// findAll
println nums.findAll { it == 4 }
//[]
println nums.flatten().findAll { it < 5 }
//[3, 4, 1, 2]

// getAt(Range)
//println nums.getAt(0..5)
//java.lang.IndexOutOfBoundsException: toIndex = 6

// reverse list
nums = [1,2,3,4]
println nums.reverse()
//[4, 3, 2, 1]


// unique
nums = [1,2,3,4,2,2,2]
println nums.unique()
//[1, 2, 3, 4]


// Java Collections List(LinkedList) (Set,SortedSet)
def evens = [10,2,8,4,24,14,2] as Set
println evens
//[10, 2, 8, 4, 24, 14]
println evens.class.name
//java.util.LinkedHashSet
