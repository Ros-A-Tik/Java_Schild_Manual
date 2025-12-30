package JAVA_LIBRARY.STRING_Handling;

public class Java_LIBRARY_STRING_Constructions {
    //General form of String Constructor
    public static String str = new String();

    //The String Constructor to create a String initialized by an array of characters:
    public static String strCharArray = "String(char[ ] chars)";
    public static String strCharArray_01 = "String(char[ ] chars, int startIndex, int numChars)";
    public static String strCharArray_Copy = "String(String strObj)";

    //An Example of String initialized by an array of characters
    public static char [] strCharArray_Example = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

    public static void main (String [] args) {

        //An Example of String initialized by an array of characters
        System.out.println(strCharArray);
        str = new String(strCharArray_Example);
        System.out.println("An example of \"strArray\" is: " + str);

        System.out.println(strCharArray_01);
        str = new String(strCharArray_Example, 3, 4);
        System.out.println("Another example of String Char Array Constructor using start index and number of chars for display: " + str);

        System.out.println(strCharArray_Copy);
        String strCopy = new String(str);
        System.out.println("An example of copy of the String \"str\" to another String object \"strCopy\" \nby using a constructor " + strCharArray_Copy + " is: " + strCopy);

        byte[] strByte = {63, 64, 65, 66, 67, 68, 69, 70, 71};
        String strString = new String(strByte);
        System.out.println(strString);
        System.out.println(new String(strByte, 3, 5));


    }
}