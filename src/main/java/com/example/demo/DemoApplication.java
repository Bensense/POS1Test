package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {


    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("A Useless Calculator");
        System.out.println();

        System.out.print("1. Zahl eingeben: ");
        int zahl1 = scan.nextInt();

        System.out.print("2. Zahl eingeben: ");
        int zahl2 = scan.nextInt();

        int ergebnis = zahl1 + zahl2;

        System.out.println();
        System.out.println("Das Ergebnis ist: " + ergebnis);
    }



}

