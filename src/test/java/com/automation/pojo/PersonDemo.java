package com.automation.pojo;

class Person extends Object {
    String name;

    @Override
    public boolean equals(Object o){
        return ((Person)o).name.equals(this.name);
    }
}


public class PersonDemo{
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Yash";

        Person person2 = new Person();
        person2.name = "Yash";

        System.out.println(person1.equals(person2));
    }
}


