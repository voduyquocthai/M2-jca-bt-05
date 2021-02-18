package Views;

import Behaviors.PersonManagement;
import Behaviors.Town;
import Entities.House;
import Entities.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    static PersonManagement pm = new PersonManagement();
    static Town town = new Town();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        startMenu:
        do{
            System.out.println("1. Person Management:");
            System.out.println("2. House Management:");
            int choice = Integer.parseInt(input.nextLine());
            if(choice == 1){
                do{
                    System.out.println("-----Person Management-----");
                    System.out.println("1. Add Person");
                    System.out.println("2. Delete Person");
                    System.out.println("3. Show All Persons");
                    System.out.println("4. Show Person By Id");
                    System.out.println("0. Back");
                    int choice1 = Integer.parseInt(input.nextLine());
                    switch (choice1){
                        case 1:
                            Person person = Menus.getPersonInfo();
                            pm.addPerson(person);
                            break;
                        case 2:
                            System.out.println("Enter person's Id that you want to remove:");
                            int id = Integer.parseInt(input.nextLine());
                            pm.deletePersonById(id);
                            break ;
                        case 3:
                            pm.showAllPerson();
                            break ;
                        case 4:
                            int id1 = Integer.parseInt(input.nextLine());
                            Person person1 = pm.searchPersonById(id1);
                            System.out.println(person1.toString());
                            break ;
                        case 0:
                            continue startMenu;
                        default:
                            System.out.println("Try Again !");
                            continue ;
                    }
                }
                while (true);
            } else if(choice == 2) {
                do {
                    System.out.println("-----House Management-----");
                    System.out.println("1. Add New House");
                    System.out.println("2. Add Person to Existed House");
                    System.out.println("3. Delete House");
                    System.out.println("4. Show All House");
                    System.out.println("5. Show House By Address");
                    System.out.println("0. Back");
                    int choice1 = Integer.parseInt(input.nextLine());
                    switch (choice1) {
                        case 1:
                            ArrayList<Person> personOfHouse = new ArrayList<>();
                            House house = new House();
                            System.out.println("Enter the amount of people in this house:");
                            int amountOfPeople = Integer.parseInt(input.nextLine());
                            for (int i = 0; i < amountOfPeople; i++) {
                                System.out.println("Enter the person's Id: ");
                                int id = Integer.parseInt(input.nextLine());
                                Person p = pm.searchPersonById(id);
                                personOfHouse.add(p);
                                int a = house.getAmountOfPeople();
                                a++;
                                house.setAmountOfPeople(a);
                            }
                            house.setPersonList(personOfHouse);
                            System.out.println("Enter the house's address: ");
                            String address = input.nextLine();
                            house.setAddress(address);
                            town.addHouse(house);
                            break;
                        case 2:
                            System.out.println("Enter the address of house that you want to add person:");
                            String address1 = input.nextLine();
                            ArrayList<House> houses = town.getHouses();
                            for (House h : houses) {
                                if (h.getAddress().equals(address1)) {
                                    System.out.println("Enter the amount of people that you want to add:");
                                    int amount = Integer.parseInt(input.nextLine());
                                    for (int i = 0; i < amount; i++) {
                                        System.out.println("Enter the Id of person that you want to add:");
                                        int id = Integer.parseInt(input.nextLine());
                                        Person person = pm.searchPersonById(id);
                                        h.getPersonList().add(person);
                                        int a = h.getAmountOfPeople();
                                        a++;
                                        h.setAmountOfPeople(a);
                                    }
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Enter the house's address that you want to remove: ");
                            String address3 = input.nextLine();
                            town.deleteHouseByAddress(address3);
                            break;
                        case 4:
                            town.showAllHouse();
                            break;
                        case 5:
                            System.out.println("Enter the house's address: ");
                            String address2 = input.nextLine();
                            System.out.println(town.searchHouseByAddress(address2).toString());
                            break;
                        case 0:
                            continue startMenu;
                        default:
                            System.out.println("Try Again !");
                            continue;
                    }
                } while (true);
            }else {
                continue startMenu;
            }
        }
        while (true);
    }
}
