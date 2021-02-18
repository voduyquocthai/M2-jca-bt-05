package Behaviors;

import Entities.Person;

import java.util.ArrayList;

public class PersonManagement {

    ArrayList<Person> persons = new ArrayList<>();


    public void addPerson(Person person){
        persons.add(person);
    }

    public void deletePersonById(int id){
        persons.removeIf(p -> p.getId() == id);
    }

    public void showAllPerson(){
        for (Person p: persons) {
            System.out.println(p.toString());
        }
    }

    public Person searchPersonById(int id){
        Person person = null;
        for (Person p: persons) {
            if(p.getId() == id){
                person = p;
            }
        }
        return person;
    }
}
