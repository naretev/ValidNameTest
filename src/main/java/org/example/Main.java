package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a full name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (NameIsValid(name)) {
            System.out.println("Valid name");
        } else {
            System.out.println("Invalid name");
        }
    }

    /**
     * A function that checks if a name is valid. A valid name must be 2-3 sets long, a set being either a name or an
     * initial, each seperated by a space. A name must begin with an uppercase letter and be followed by one or more
     * lowercase letters. An initial must be only one uppercase letter followed by a dot. The last set must always be a
     * name. Finally, if there are three sets, the first set can be an initial if, and only if, the second set also is
     * an initial.
     * @param name
     * @return
     */
    public static boolean NameIsValid(String name) {
        Pattern p = Pattern.compile("(([A-Z][a-z]+ (([A-Z][a-z]+|[A-Z]\\.) )?)|([A-Z]\\. ([A-Z]\\. )?))[A-Z][a-z]+");
        Matcher m = p.matcher(name);
        return m.matches();
    }
}