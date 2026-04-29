package JAVA_LIBRARY.STRING_Handling;

public class Java_LIBRARY_String_Literals {

    static char [] chars = {'a', 'b', 'c'};
    static String str;
    static String str_1 = new String (chars);
    static String str_2 = "abe";

    static  String str_pw (String v) {
        str = v;
        System.out.println(str);
        return str;
    };

    public static void main (String[] args) {
        str_pw(str_1);
        System.out.println();
        str_pw(str_2);
        System.out.println();
        if (str_1.equals(str_2)) {
            System.out.println("str_1 length is equal with str_2 length and is:" + str_1.length());
        } else {
            System.out.println("Str_1 not equal with str_2.\nstr_1 length is: " + str_1.length() + "\nstr_2 length is: " +str_2.length());
        }
    }
}
