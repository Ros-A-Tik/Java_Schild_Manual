package JAVA_LIBRARY.STRING_Handling;

public class Java_LIBRARY_String_Concatenation {

    static String age = "9";
    static String str;
    static String str_1 = "He is ";
    static String str_2 = " years old.";

    static byte b_1 = 2;
    static String str_byte_concat = "four: ";

    static String str_pw (String a, String b, String c) {
        str = a+b+c;
        System.out.println(str);
        return  str;
    }

    public static void main (String[] args) {

        System.out.println("This is an example of String concatenation (str_1 + age + str_2):");
        str_pw(str_1, age, str_2);

        System.out.println();
        System.out.println(str_byte_concat + b_1 + b_1);
        System.out.println(str_byte_concat + (b_1 + b_1));
    }
}
