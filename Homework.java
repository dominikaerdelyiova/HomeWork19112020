package sk.kosickaakademia.dominika.erdelyiova.names;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Homework {
    public static void main(String[] args) {
        Set<String> names;
        names = readFile("names.txt");
        int length = getLenght(names);
        System.out.println("There are " + length + " names in your document");
        System.out.println(sortNames(names));
        printLongestName(names);
        findMostUsedName(names);


    }

    private static Set<String> readFile(String s) {
    }

    private static int getLenght(Set<String> names) {
    }

    private static char sortNames(Set<String> names) {
    }

    private static void findMostUsedName(Set<String> names) {
    }

    private static void printLongestName(Set<String> names) {
    }
}
