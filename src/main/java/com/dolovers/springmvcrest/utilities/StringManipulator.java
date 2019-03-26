package com.dolovers.springmvcrest.utilities;

public class StringManipulator {


    // Convert camel cases to words for headers
    static String camelCaseToWords(String s) {
        String s1 =  s.replaceAll(
                String.format("%s|%s|%s",
                        "(?<=[A-Z])(?=[A-Z][a-z])",
                        "(?<=[^A-Z])(?=[A-Z])",
                        "(?<=[A-Za-z])(?=[^A-Za-z])"
                ),
                " "
        );

        String output = s1.substring(0, 1).toUpperCase() + s1.substring(1);
        return output;
    }

}
