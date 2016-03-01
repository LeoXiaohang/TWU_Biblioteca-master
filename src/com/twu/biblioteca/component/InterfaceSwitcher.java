package com.twu.biblioteca.component;

import java.util.Scanner;

public class InterfaceSwitcher {

    public void switcher() {
        boolean quitMainMenu = false;
        Scanner scanner = new Scanner(System.in);
        ChoiceProcessor choiceProcessor = new ChoiceProcessor();
        Book book = new Book();

        while (!quitMainMenu) {
            boolean quitTopMenu = false;

            switchToMainMenuInterface();

            String mainMenuOption = scanner.nextLine();
            System.out.println(mainMenuOption);

            if (!choiceProcessor.isMainMenuOptionValid(mainMenuOption)) {
                continue;
            }

            if (quitMainMenu = choiceProcessor.toQuitMenu(mainMenuOption)) {//if not to quit go continue
                break;
            }

            switch (Integer.parseInt(mainMenuOption)) {
                case 1:
                    switchToListLibraryInterface();
                    break;

                case 2:
                    switchToCheckoutBookInterface();
                    break;

                case 3: {
                    switchToReturningBookInterface();

                    while (!quitTopMenu) {
                        String topMenuOption = scanner.nextLine();
                        System.out.println(topMenuOption);

                        if (quitTopMenu = choiceProcessor.toQuitMenu(topMenuOption)) {
                            break;
                        }

                        book.returningBook(topMenuOption);

                    }
                    break;
                }

                default:
                    continue;
            }
        }

    }

    public void switchToWelcomeInterface() {
        spacingLinesOfAsterisk();
        spacingBlankLines();
        System.out.println("\t\t\t\tWelcome to Bangalore Public Library ! (Please press any key to proceed)");
        System.out.println("");
    }

    public void switchToMainMenuInterface() {
        spacingLinesOfAsterisk();
        spacingBlankLines();
        System.out.println("Welcome to Main Menu of Bangalore Public Library: ");
        System.out.println("1, List Books");
        System.out.println("2, Check-out Book");
        System.out.println("3, return Book");
        System.out.println("4, Quit");
        spacingBlankLines();
        System.out.println("(You can select any options above to get what you need, enter the option number and press enter key to confirm)");
    }

    public void switchToListLibraryInterface() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("~");
        }
        spacingBlankLines();
        System.out.println("List Library Interface !");
    }

    public void switchToCheckoutBookInterface() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("~");
        }
        spacingBlankLines();
        System.out.println("Checkout Book Interface !");
    }

    public void switchToReturningBookInterface() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("~");
        }
        spacingBlankLines();
        System.out.println("Return Book Interface (Please enter the key q/Q to come to main menu) !");
        System.out.printf("Please enter the book name you want to return back (Press the enter key to confirm): ");
    }

    private void spacingBlankLines() {
        System.out.println("");
        System.out.println("");
    }

    private void spacingLinesOfAsterisk() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("*");
        }
    }
}
