package com.company;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. yeppy";
        System.out.println(string);
        String test = string.replaceAll("I", "You");
        System.out.println(test);

        String alphanumeric = "abcDeeef12Ghii";
        System.out.println(alphanumeric.replaceAll(".","Y")); // dot is a wild card for any character

        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY")); // ^ only does beginning of string

        System.out.println(alphanumeric.matches("^hello"));

        alphanumeric = "helloaFbcDeeef12Ghii";

        System.out.println(alphanumeric.matches("^hello")); // matches has to match as ahold, otherwise false.
        System.out.println(alphanumeric.matches("helloabcDeeef12Ghii"));


        // replaces only if it's at the end ($)
        System.out.println(alphanumeric.replaceAll("ijkl99z$", "END")); // $ is boundary match for the end
        System.out.println(alphanumeric.replaceAll("[aei]", "X")); // replaces all occurances with X
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X")); // replaces only if followed by
    }
}
