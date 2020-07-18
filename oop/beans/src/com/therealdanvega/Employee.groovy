package com.therealdanvega

@groovy.transform.ToString
class Employee implements Serializable {

    String first ,last,email

    String fullName

    void setFirst(String first) {
        this.first = "$first (setter)"
    }

    void setFullName(String name){
        fullName = name
    }

    String getFullName(){
        "Full Name: ${fullName}"
    }

}
