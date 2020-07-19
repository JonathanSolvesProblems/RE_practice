package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

//        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));
//
//        String newalpha = "sajdateestjq";
//        System.out.println(newalpha.replaceAll("[^ej]", "working")); // ^ not operator (character class)
//        System.out.println(newalpha.replaceAll("[abcdef345678]", "X")); // regular expressions are case sensitive
//        System.out.println(newalpha.replaceAll("[a-f3-8]", "nice"));
//        System.out.println(newalpha.replaceAll("(?i)[a-f3-8]", "X")); // (?i) negates case sensitivity, put ?u if in unicode
//        System.out.println(newalpha.replaceAll("\\d", "XX")); // \d for 0-9
//        System.out.println(newalpha.replaceAll("\\D", "X")); // replaces all NON DIGITS
//
//        String hasWhiteSpace = "I have blanks and \ta tab and also a new line";
//        System.out.println(hasWhiteSpace);
//        System.out.println(hasWhiteSpace.replaceAll("\\s", "")); // removes white space
//        System.out.println(hasWhiteSpace.replaceAll("\t", "X"));
//        System.out.println(hasWhiteSpace.replaceAll("\\S", "")); // replaces all non-white space characters, only tab, space and newline remain
//        System.out.println(hasWhiteSpace.replaceAll("\\w", "X")); // replaces whitespace
//        System.out.println(hasWhiteSpace.replaceAll("\\b","X")); // replaces first/last character of each word

        String alpha3 = "dwqdwaJJJDW2123";
        System.out.println(alpha3.replaceAll("^d{1}", ""));
        System.out.println(alpha3.replaceAll("^abcDe+","YY")); // don't care how many e's follow. 1 or more, can also use * for 0 e's
        System.out.println(alpha3.replaceAll("^d{2,5}", "YYY")); // looing between 2 and 5 e's
        // ahh h, followed by any number of i\s woth y
        System.out.println(alpha3.replaceAll("h+i*y", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2></h2>");
        htmlText.append("<p></p>");

        System.out.println(htmlText);

        String h2Pattern = "<h2>"; // parenthesis is a groupe
        Pattern pattern = Pattern.compile(h2Pattern); // compiling pattern into var pattern
        Matcher matcher = pattern.matcher(htmlText); // compiling string into match with compariing to pattern
        System.out.println(matcher.matches()); // check if they match, can only use matcher once, have to reset.

        matcher.reset();

        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end()); // end is index of first character after match.
        }

        String h2GroupPattern = "(<h2>.*?</h2>)"; // question mark turns it into a lazy quantifier.
        Pattern groupePattern = Pattern.compile(h2GroupPattern);
        Matcher groupeMatcher = groupePattern.matcher(htmlText);
        System.out.println(groupeMatcher.matches());

        groupeMatcher.reset(); // greedy and lazy quandtifiers, greedy will keep trying to find a match

        while(groupeMatcher.find()) {
            System.out.println("Occurrence " + groupeMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while(h2TextMatcher.find()) {
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }

        // and or and not

        // "abc" a followed by b - and operator implicit, folled by
        System.out.println("harry".replaceAll("[H|h]arry", "L")); // | is or operator

        // [^abc] not operator, can only use !, but in negative expression
        String tTest = "tstvast";
        String nTest = "t(?!v)"; // look a head syntax with ?
        Pattern not = Pattern.compile(nTest);
        Matcher notMatch = not.matcher(tTest);

        count = 0;
        while(notMatch.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + notMatch.start() + " to " + notMatch.end());
        }
        // t(?=v) positive look ahead

    }
}
