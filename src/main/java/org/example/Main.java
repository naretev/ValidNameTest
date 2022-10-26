package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (NameIsValid(name)) {
            System.out.println("Valid Name");
        } else {
            System.out.println("Invalid Name");
        }
    }

    /**
     * A function that checks if a name is valid. A valid name must be 2-3 sets long, a set being either a spelled out
     * name or just an initial, each seperated by a space. A name must begin with an uppercase letter and be followed by
     * one or more lowercase letters. An initial must be only one uppercase letter followed by a dot. Finally, the last
     * set in the string must always be a name and cannot be an initial.
     * @param name
     * @return
     */
    public static boolean NameIsValid(String name) {
        Pattern p = Pattern.compile("(([A-Z]\\w+ (([A-Z]\\w+|[A-Z]\\.) )?)|([A-Z]\\. ([A-Z]\\. )?))[A-Z]\\w+");
        Matcher m = p.matcher(name);
        return m.matches();
    }
}