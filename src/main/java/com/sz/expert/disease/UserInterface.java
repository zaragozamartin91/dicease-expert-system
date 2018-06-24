package com.sz.expert.disease;

import java.util.Scanner;

public class UserInterface {
    private static UserInterface ourInstance = new UserInterface();

    public static UserInterface ask() {
        return ourInstance;
    }

    private UserInterface() {
    }

    public boolean bool(String question) {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("%s ? [S/N]: ", question);
        String answer = keyboard.next().trim();

        if ("no".equalsIgnoreCase(answer)
                || "n".equalsIgnoreCase(answer)) {
            return false;
        }

        if ("si".equalsIgnoreCase(answer)
                || "yes".equalsIgnoreCase(answer)
                || "s".equalsIgnoreCase(answer)
                || "y".equalsIgnoreCase(answer)) {
            return true;
        }

        return bool(question);
    }
}
