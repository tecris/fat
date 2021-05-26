package org.playground.poc;

public class Main {
    public static void main(String []a){
        new Main().runMyApplication();
    }

    public void runMyApplication(){
        Address mateiAddress = new Address();
        System.out.println("matei street name = " + mateiAddress.getStreetName());
        String safe = "woodstock";
        mateiAddress.setStreetName(safe);
        mateiAddress.unit = "A";
        System.out.println("matei street name = " + mateiAddress.getStreetName());
        mateiAddress.setStreetName("Nileroad");
        System.out.println("matei street name = " + mateiAddress.getStreetName());


        Address matAddress = new Address();
        matAddress.setStreetName("cypress");
        System.out.println("mat street name = " + matAddress.getStreetName());
        System.out.println("matei street name = " + mateiAddress.getStreetName());
        Person mat = new Person();
        mat.setAddress(matAddress);

    }
}
