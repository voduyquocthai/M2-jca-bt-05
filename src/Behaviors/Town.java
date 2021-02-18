package Behaviors;


import Entities.House;
import sun.jvm.hotspot.debugger.Address;

import java.util.ArrayList;

public class Town {

    ArrayList<House> houses = new ArrayList<House>();

    public Town(ArrayList<House> houses) {
        this.houses = houses;
    }

    public Town() {

    }

    public ArrayList<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }



    public void addHouse(House h){
        houses.add(h);
    }

    public void deleteHouseByAddress(String a) {
        for (House h : houses) {
            if (h.getAddress().equals(a)) {
                houses.remove(h);
            }
        }
    }

    public void showAllHouse(){
        for (House h: houses) {
            System.out.println(h.toString());
        }
    }

    public House searchHouseByAddress(String a){
        House house = null;
        for (House h: houses) {
            if(h.getAddress().equals(a)){
                house = h;
            }
        }
        return house;
    }
}
