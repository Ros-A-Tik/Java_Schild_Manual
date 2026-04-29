package JAVA_LIBRARY.STRING_Handling;

import java.util.Arrays;

public class Java_LIBRARY_String_Conversation_toString {

    static String box;
    static double width;
    static double height;
    static double depth;

    Java_LIBRARY_String_Conversation_toString (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public String toString() {
        return "Dimensions of the Box are:\n\twidth\t- " + width + "\n\theight\t- " + height + "\n\tdepth\t- " + depth +".";
    }

    public static void main (String [] args) {
        Java_LIBRARY_String_Conversation_toString boxConstructor = new Java_LIBRARY_String_Conversation_toString(10, 20, 30);
        box = " " + boxConstructor;
        System.out.println(boxConstructor);
        System.out.println();
        System.out.println(box);
    }
}
