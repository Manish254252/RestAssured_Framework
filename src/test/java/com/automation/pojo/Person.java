package com.automation.pojo;


import java.util.Objects;

class Person extends Object {
    String name;

//    @Override
//    public boolean equals(Object o){
//        return ((Person)o).name.equals(this.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}