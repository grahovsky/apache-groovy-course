package other

import com.therealdanvega.Employee

class test {

    public static void main(String[] args) {

        Employee emp = new Employee()

        emp.first = "Dan"
        println emp.first

        emp.@first = "Dan"
        println emp.@first

    }

}


