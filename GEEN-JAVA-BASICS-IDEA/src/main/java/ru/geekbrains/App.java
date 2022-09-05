package ru.geekbrains;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут?");
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        System.out.printf("Привет! %s\n", name);
    }
}