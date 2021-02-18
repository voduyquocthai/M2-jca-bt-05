package Entities;

import java.util.ArrayList;
import java.util.List;

public class House {

    private List<Person> personList = new ArrayList<>();

    private int amountOfPeople;

    private String address;

    public House() {
    }

    public House(List<Person> personList, String address) {
        this.personList = personList;
        this.address = address;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(int amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "House{" +
                "personList=" + personList +
                ", amountOfPeople=" + amountOfPeople +
                ", address='" + address + '\'' +
                '}';
    }
}
