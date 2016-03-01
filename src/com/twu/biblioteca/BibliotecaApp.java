package com.twu.biblioteca;


import com.twu.biblioteca.component.InterfaceSwitcher;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("BibliotecaApp.main");

        InterfaceSwitcher interfaceSwitcher = new InterfaceSwitcher();//welcome message
        interfaceSwitcher.switchToWelcomeInterface();

        Scanner scanner = new Scanner(System.in);//press any key to continue
        String s = scanner.next();
        System.out.println(s);

        interfaceSwitcher.switchToMainMenuInterface();//main menu

        interfaceSwitcher.switcher();//run the library system

        System.out.println("\t\t\t\t~~~~~~~~~~(End)~~~~~~~~~~");
    }
}
