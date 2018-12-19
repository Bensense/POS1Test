package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println();
        System.out.println("A Useless Calculator");
        System.out.println();

        System.out.print("1. Zahl eingeben: ");
        int zahl1 = intEingabe();

        System.out.print("2. Zahl eingeben: ");
        int zahl2 = intEingabe();

        int ergebnis = zahl1 + zahl2;

        System.out.println();
        System.out.println("Das Ergebnis ist: " + ergebnis);

    }

    public int intEingabe() {
        int eingabe = 0;
//        System.out.print("Eingabe: ");
        try
        {
            eingabe = scan.nextInt();
        }
        catch(InputMismatchException e)
        {
            scan.next();
            System.out.println("Falsche Eingabe");
            intEingabe();

        }
        return eingabe;
    }
}

