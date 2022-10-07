package com.spsmb;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Pet> pets = new ArrayList<>();

    public static void main(String[] args) {
        run();







        /*Pet myPet = new Pet("Nemo",5,"male","fish",0);
        System.out.println(myPet);
        System.out.println(myPet.getName());
        myPet.walk();
        Pet myNextPet = new Pet("Stepan", 15, "maybeMale","human", 3);
        myNextPet.walk();

        ArrayList<String> names = new ArrayList<>();
        names.add("Petr");
        names.add("Jan");
        names.add("Radek");
        names.add("Stepan");
        names.add("Ondra");
        names.add("Simon");
        names.add("Jindra");
        names.add("Maruska");
        names.add("Eva");
        names.add("Rostik");
        names.add("Arnost");
        names.add("Tomas");
        names.add("Kristyna");
        names.add("Marek");
        names.add("Pavel");
        names.add("Vaclav");
        names.add("Daniel");
        names.add("Lukas");
        names.add("Mikes");
        names.add("Matej");
        AtomicInteger pocetAcek = new AtomicInteger();
        names.forEach(name -> {
            name.toLowerCase(Locale.ROOT);
            if (name.contains("a")) {
                pocetAcek.getAndIncrement();
            }
        });


        System.out.println("Jmena dohromady obsahovala " + pocetAcek + " acek.");

        System.out.println(names);
        names.remove("Petr");
        System.out.println(names);
        if (names.contains("Petr")){
            System.out.println("Kolekce obsahuje Petra.");
        }else{
            System.out.println("Kolekce neobsahuje Petra.");
            names.clear();
            names.add("Petr");
            System.out.println(names);

        }*/
    }
    private static void run(){
        System.out.println("Spousti se program");
        menu();
    }

    private static void menu(){
        System.out.println("Zadejte 1 pro pridani zviratka");
        System.out.println("Zadejte 2 pro odebrani zviratka");
        System.out.println("Zadejte 3 pro vypis");
        System.out.println("Zadejte cislo: ");
        String action = sc.nextLine();
        int num = Integer.parseInt(action);
        switch (num){
            case 1 -> addPet();
            case 2 -> removePet();
            case 3 -> printAllPets();
            case 4 -> System.exit(1);
            default -> menu();
        }

    }

    private static void addPet(){
        System.out.println("Akce: AddPet");
        System.out.println("Zadejte jmeno: ");
        String name = sc.nextLine();
        System.out.println("Zadejte vek: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte pohlavi: ");
        String gender = sc.nextLine();
        System.out.println("Zadejte druh: ");
        String type = sc.nextLine();
        System.out.println("Zadejte pocet nohou: ");
        int numberOfLegs = Integer.parseInt(sc.nextLine());
        pets.add(new Pet(name, age, gender, type, numberOfLegs));
        menu();

    }

    private static void removePet(){
        System.out.println("Action: removePet");
        System.out.println("Zadejte jmeno zviratka: ");
        String name = sc.nextLine();
        pets.removeIf(pet -> pet.getName().equals(name));

        menu();
    }

    private static void printAllPets(){
        System.out.println("Action: printAllPets");
        System.out.println(pets);
        menu();
    }



}