package JAVA_LIBRARY.Java_Lang.Number;

public class Lang_Number_Byte {
    public static String byteConstructors = "THe Byte Class Constructions are:\n\t\"Byte (Byte num);\"\n\t\"Byte (String str) throws NumberFormatException;\"";
    public static Byte b_byte;
    public static Byte b_str;
    public static String str;

    public static void main (String [] args) {

        System.out.println(byteConstructors);
        System.out.println();
        b_byte = 12;
        System.out.println("The Byte (Byte num) \"b\" is: " + b_byte);
        System.out.println();
        str = "120";
        b_str = Byte.valueOf(str);
        System.out.println("The Byte (String str) \"b\" is: " + b_str);
        System.out.println();
        System.out.println("THe Byte \"b\" methods are:");
        System.out.println("THe b_byte \".byteValue()\": " + b_byte.byteValue());
        System.out.println("THe b_str \".byteValue()\": " + b_str.byteValue());
        System.out.println("\".compareTo()\": " + b_byte.compareTo(b_str));
        System.out.println("\".equals()\": " + b_byte.equals(b_str));
        System.out.println("The b_byte \".hashCode()\": " + b_byte.hashCode());
        System.out.println("The b_str \".hashCode()\": " + b_str.hashCode());
        System.out.println("The b_byte \".describeConstable()\": " + b_byte.describeConstable());
        System.out.println("The b_str \".describeConstable()\": " + b_str.describeConstable());
        System.out.println("The b_byte \".doubleValue()\": " + b_byte.doubleValue());
        System.out.println("The b_str \".doubleValue()\": " + b_str.doubleValue());
        System.out.println("The b_byte \".floatValue()\": " + b_byte.floatValue());
        System.out.println("The b_str \".floatValue()\": " + b_str.floatValue());
        System.out.println("The b_byte \".shortValue()\": " + b_byte.shortValue());
        System.out.println("The b_str \".shortValue()\": " + b_str.shortValue());
        System.out.println("The b_byte \".inttValue()\": " + b_byte.intValue());
        System.out.println("The b_str \".intValue()\": " + b_str.intValue());
        System.out.println("The b_byte \".longValue()\": " + b_byte.longValue());
        System.out.println("The b_str \".longValue()\": " + b_str.longValue());
        System.out.println("The b_byte \"toString()\": " + b_byte.toString());
        System.out.println("The b_str \"toString()\": " + b_str.toString());
        System.out.println("The b_byte \".MAX_VALUE\": " + b_byte.MAX_VALUE);
        System.out.println("The b_byte \".MIN_VALUE\": " + b_byte.MIN_VALUE);
        System.out.println("The b_byte \".SIZE\": " + b_byte.SIZE);
        System.out.println("The b_byte \".TYPE\": " + b_byte.TYPE);
        System.out.println("The b_str \".MAX_VALUE\": " + b_str.MAX_VALUE);
        System.out.println("The b_str \".MIN_VALUE\": " + b_str.MIN_VALUE);
        System.out.println("The b_str \".SIZE\": " + b_str.SIZE);
        System.out.println("The b_str \".TYPE\": " + b_str.TYPE);

    }

}
