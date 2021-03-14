package com.acme.dbo.txlog;

public class Facade {
    public static final String PRIMITIVE_PREFIX = "primitive: ";
    public static final String STRING_PREFIX = "string: ";
    private static final String PRIMITIVE_POSTFIX = "";
    private static final String STRING_POSTFIX = "";


    public static void log(int message) {

       print(decorate(PRIMITIVE_PREFIX, message, PRIMITIVE_POSTFIX));
    }

    public static void log(byte message) {

        print(decorate(PRIMITIVE_PREFIX, message, PRIMITIVE_POSTFIX));
    }

    public static void log(String message) {
        print(decorate(STRING_PREFIX, message, STRING_POSTFIX));
    }


    private static void print(Object message)  {
        print(decorate("", message, ""));
    }

    private static String decorate(String prefix, Object message, String postfix) {
        return prefix + message + postfix;
    }
}
