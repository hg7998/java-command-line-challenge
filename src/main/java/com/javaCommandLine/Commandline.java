package com.javaCommandLine;

public class Commandline {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please specify a name and email.");
        }
        else if (args.length == 1) {
            String name = args[0];
            System.out.println("Please specify an email for " + name);
        }
        else {
            String firstArgument = args[0];
            String secondArgument = args[1];
            System.out.println(firstArgument + " <" + secondArgument + ">");
        }
    }

}
