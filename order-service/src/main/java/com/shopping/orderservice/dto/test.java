package com.shopping.orderservice.dto;

import java.util.regex.*;

public class test {
    public static void main(String[] args) {
        String a = "//EC2AMAZ-Q8BKA7R/default/main/OCBC/WORKAREA/default";
        String regex = "//[^/]+(.*)"; // Matches "//" followed by any characters except "/", capturing the rest

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(a);

        if (matcher.find()) {
            String result = matcher.group(1);
            String replaced = result.replaceAll("/", "\\\\"); // Replace '/' with '\\'
            System.out.println(replaced); // Output: \default\main\OCBC\WORKAREA\default
        }
    }
}
