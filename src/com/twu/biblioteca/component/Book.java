package com.twu.biblioteca.component;

import java.util.ArrayList;

public class Book {
//    private String bookName;
//    private String author;
//    private int publishedYear;
//    private boolean isBorrowed;
//
//    public String getBookName() {
//        return bookName;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public int getPublishedYear() {
//        return publishedYear;
//    }
//
//    public boolean getIsBorrowed() {
//        return isBorrowed;
//    }

    private ArrayList<String> bookNameList = new ArrayList<String>();
    private ArrayList<String> authorList = new ArrayList<String>();
    private ArrayList<Integer> publishedYearList = new ArrayList<Integer>();
    private ArrayList<Boolean> flagList = new ArrayList<Boolean>();

    public Book() {
        bookNameList.add(0, "Agility Methodology");
        bookNameList.add(1, "TDD for java");

        authorList.add(0, "Martin");
        authorList.add(1, "Kent");

        publishedYearList.add(0, 2000);
        publishedYearList.add(1, 1999);

        flagList.add(0, false);
        flagList.add(1, false);
    }

    public void returningBook(String returningBookName) {
        System.out.println(returningBookName);
        int index = findBookIndexInLibrary(returningBookName);

        if (index == -1){
            printInvalidMsgForBookNotFound();
        }else {
            checkoutBook(index);
        }

    }

    private void checkoutBook(int bookIndex){
        flagList.add(bookIndex, true);
        printMsgForCheckoutBookSuccessfully();
    }

    private int findBookIndexInLibrary(String returningBookName){                //test
        for (int i = 0; i < bookNameList.size(); i++) {
            if (returningBookName.equals(bookNameList.get(i))){
                return i;
            }
        }
        return -1;
    }

    private void printMsgForCheckoutBookSuccessfully(){
        System.out.println("This book you entered is returned successfully ! ");
        System.out.printf("You can continue to enter the book name which you want to return");
    }

    private void printInvalidMsgForBookNotFound(){

        System.out.println("error : " + PromptMsg.INVALID_BOOK_NAME);
        System.out.printf("Please input a valid book name: ");
    }
}
