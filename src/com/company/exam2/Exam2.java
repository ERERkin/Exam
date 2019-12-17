package com.company.exam2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;

public class Exam2 {

    static void add(Person person, LinkedList<Person> people, Set<Person> people1) throws SecondPersonException{
        int n = people.size();
        people1.add(person);
        if(people1.size() == n){
            throw new SecondPersonException(person.getFirstName() + " "
            + person.getLastName() + " " + person.getPatronymic() + " уже есть!");
        }else{
            people.add(person);
        }
    }

    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();
        Set<Person> people1 = new HashSet<>();
        Person person = new Person("A","A","A");
        people.add(person);
        people1.add(person);
        try {
            Person person1 = new Person("A","A","A");
            add(person1,people,people1);
        }catch (SecondPersonException ex){
            ex.printStackTrace();
        }
    }
}

class Person{
    private String firstName;
    private String lastName;
    private String Patronymic;

    public Person(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        Patronymic = patronymic;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(Patronymic, person.Patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, Patronymic);
    }
}

class SecondPersonException extends Exception{
    public SecondPersonException(String message) {
        super(message);
    }
}