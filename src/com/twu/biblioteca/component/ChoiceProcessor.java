package com.twu.biblioteca.component;

import java.util.regex.Pattern;

public class ChoiceProcessor {

    public boolean toQuitMenu(String option){
        if ( option.equals("q") | option.equals("Q") ){
            return true;
        }

        if ( option.equals("4") ){
            return true;
        }

        return false;
    }

    public boolean isMainMenuOptionValid(String mainMenuOption){        //test

        if (!Pattern.matches("^[1234]$", mainMenuOption)) {//main menu optional check -> choice processor
            System.out.println("error : " + PromptMsg.OPTION_INVALID);
            System.out.printf("Please select an option again: ");
            return false;
        }
        return true;

    }

}
