package Views;

import Entities.Person;

import java.util.Scanner;

public class Menus {

    static Scanner input = new Scanner(System.in);

    public static Person getPersonInfo(){
        System.out.println("-------------------------------");
        System.out.println("Enter person's name: ");
        String name = input.nextLine();
        System.out.println("Enter person's id: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter person's date of birth: ");
        String dob = input.nextLine();
        System.out.println("Enter person's job: ");
        String job = input.nextLine();
        Person person = new Person(name, dob, job, id);
        return person;
    }
}
