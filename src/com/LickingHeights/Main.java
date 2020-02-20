package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare
        String number;
        String adjective1;
        String pluralNoun1;
        String noun1;
        String verb1;
        String pluralNoun2;
        String adjective2;
        String femaleName;
        String adjective3;
        String adjective4;
        String partOfBody1;
        String articleOfClothing;
        String place;
        String noun2;
        String adjective5;
        String city;
        String pluralNoun3;
        String pluralNoun4;
        String celebrityName;
        String adjective6;
        String letterOfAlphabet;
        String partOfBody2;
        Scanner keyboard;

        // initialize
        keyboard= new Scanner(System.in);
        System.out.println("What is your age?");
        number=keyboard.nextLine();

        System.out.println("What word would you describe yourself with?");
        adjective1=keyboard.nextLine();

        System.out.println("Give me a plural noun");
        pluralNoun1=keyboard.nextLine();

        System.out.println("Give me a noun");
        noun1=keyboard.nextLine();

        System.out.println("Give me a verb (present tense, no -ing)");
        verb1=keyboard.nextLine();

        System.out.println("Give me a plural noun again please");
        pluralNoun2=keyboard.nextLine();

        System.out.println("Give me a adjective(no colors)");
        adjective2=keyboard.nextLine();

        System.out.println("What is your mom's name?");
        femaleName=keyboard.nextLine();

        System.out.println("Give me a adjective again please (no colors)");
        adjective3=keyboard.nextLine();

        System.out.println("another adjective(no colors)");
        adjective4=keyboard.nextLine();

        System.out.println("Name a body part");
        partOfBody1=keyboard.nextLine();

        System.out.println("What is your favorite article of clothing?");
        articleOfClothing=keyboard.nextLine();

        System.out.println("Name a type of building");
        place=keyboard.nextLine();

        System.out.println("please name another noun");
        noun2=keyboard.nextLine();

        System.out.println("name another adjective please (no colors)");
        adjective5=keyboard.nextLine();

        System.out.println("What is your favorite city?");
        city=keyboard.nextLine();

        System.out.println("please name a plural noun");
        pluralNoun3=keyboard.nextLine();

        System.out.println("one more plural noun. I promise");
        pluralNoun4=keyboard.nextLine();

        System.out.println("Who is your favorite celebrity?");
        celebrityName=keyboard.nextLine();

        System.out.println("Last adjective please (no colors)");
        adjective6=keyboard.nextLine();

        System.out.println("Choose any letter of the alphabet(capital)");
        letterOfAlphabet=keyboard.nextLine();

        System.out.println("Name one more body part");
        partOfBody2=keyboard.nextLine();

        //Phase 3
        System.out.println("There are many "+adjective1+" ways to choose a/an "+noun1+" to read.");
        System.out.println("First you could ask for a recommendation from your friends or "+pluralNoun1+".");
        System.out.println("Just don’t ask aunt "+femaleName+" she only reads "+adjective2+" books with "+articleOfClothing+" ripping goddesses on the covers.");
        System.out.println("If your friends and family are of no use. Try asking the "+noun2+" Reviews in The "+city+ " Times.");
        System.out.println("If the "+pluralNoun2+" featured there are too "+adjective3+" for your taste, try something a little less "+partOfBody1+" grabbing");
        System.out.println("Like "+letterOfAlphabet+ ":The " +celebrityName+ " Magazine,or "+pluralNoun3+" Magazine");
        System.out.println("You could also choose a book the "+adjective4+"-way.");
        System.out.println("Head to your local library or "+place+" and browse the shelves until you find something "+partOfBody2+"-catching.");
        System.out.println("Or you save yourself a lot of "+adjective5+" trouble and go to www.amazon.com");
        System.out.println("The very "+adjective6+" website to "+verb1+" anything!");
        System.out.println("With all that time you’ll save not having to search for "+pluralNoun4+" you can read "+number+" more books!");

    }
}
