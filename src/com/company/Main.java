package com.company;

public class Main {

    public static void main(String[] args) {
//        String string = "I am a string. yeppy";
//        System.out.println(string);
//        String test = string.replaceAll("I", "You");
//        System.out.println(test);
//
//        String alphanumeric = "abcDeeef12Ghii";
//        System.out.println(alphanumeric.replaceAll(".","Y")); // dot is a wild card for any character
//
//        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY")); // ^ only does beginning of string
//
//        System.out.println(alphanumeric.matches("^hello"));
//
//        alphanumeric = "helloaFbcDeeef12Ghii";
//
//        System.out.println(alphanumeric.matches("^hello")); // matches has to match as ahold, otherwise false.
//        System.out.println(alphanumeric.matches("helloabcDeeef12Ghii"));
//
//
//        // replaces only if it's at the end ($)
//        System.out.println(alphanumeric.replaceAll("ijkl99z$", "END")); // $ is boundary match for the end
//        System.out.println(alphanumeric.replaceAll("[aei]", "X")); // replaces all occurances with X
//        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X")); // replaces only if followed by

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        String newalpha = "sajdateestjq";
        System.out.println(newalpha.replaceAll("[^ej]", "working")); // ^ not operator (character class)
        System.out.println(newalpha.replaceAll("[abcdef345678]", "X")); // regular expressions are case sensitive
        System.out.println(newalpha.replaceAll("[a-f3-8]", "nice"));
        System.out.println(newalpha.replaceAll("(?i)[a-f3-8]", "X")); // (?i) negates case sensitivity, put ?u if in unicode
        System.out.println(newalpha.replaceAll("\\d", "XX")); // \d for 0-9
        System.out.println(newalpha.replaceAll("\\D", "X")); // replaces all NON DIGITS

        String hasWhiteSpace = "I have blanks and \ta tab and also a new line";
        System.out.println(hasWhiteSpace);
        System.out.println(hasWhiteSpace.replaceAll("\\s", "")); // removes white space
        System.out.println(hasWhiteSpace.replaceAll("\t", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\S", "")); // replaces all non-white space characters, only tab, space and newline remain
        System.out.println(hasWhiteSpace.replaceAll("\\w", "X")); // replaces whitespace
        System.out.println(hasWhiteSpace.replaceAll("\\b","X")); // replaces first/last character of each word

    }
}
