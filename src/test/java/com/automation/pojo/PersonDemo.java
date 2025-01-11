package com.automation.pojo;

public class PersonDemo{
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Yash";

        Person person2 = new Person();
        person2.name = "Yash";

        System.out.println(person1.equals(person2));
    }
}


