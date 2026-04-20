package JAVA_LIBRARY.Java_Lang.Number;

public class Lang_Number_Int {

    public static String int_Constructions = "The Integer Class Constructions are: \n\tInt(int num);\n\tInt(String str) trows NumberFormatException";
    public static Integer int_num;
    public static Integer int_str;
    public static String str_int = "345";

    public static void main (String[] args) {

        System.out.println(int_Constructions);

        int_num = 12;
        int_str = Integer.valueOf(str_int);
        System.out.println();
        System.out.println("The methods of the Integer Class are:");
        System.out.println("The int_num with \".byteValue()\" method result: " + int_num.byteValue());
        System.out.println("THe int_str with \".byteValue()\" method result: " + int_str.byteValue());
        System.out.println("The int_num with \".shortValue()\" method result: " + int_num.shortValue());
        System.out.println("THe int_str with \".shortValue()\" method result: " + int_str.shortValue());
        System.out.println("The int_num with \".longValue()\" method result: " + int_num.longValue());
        System.out.println("THe int_str with \".longValue()\" method result: " + int_str.longValue());

        System.out.println("The int_num with \".doubleValue()\" method result: " + int_num.doubleValue());
        System.out.println("THe int_str with \".doubleValue()\" method result: " + int_str.doubleValue());
        System.out.println("The int_num with \".floatValue()\" method result: " + int_num.floatValue());
        System.out.println("THe int_str with \".floatValue()\" method result: " + int_str.floatValue());
        System.out.println("The int_num with \".toString()\" method result: " + int_num.toString());
        System.out.println("THe int_str with \".toString()\" method result: " + int_str.toString());

        System.out.println("The int_num with \".compare()\" method result: " + int_num.compare(int_num, int_str));
        System.out.println("THe int_str with \".compare()\" method result: " + int_str.compare(int_str, int_num));
        System.out.println("The int_num with \".compareTo()\" method result: " + int_num.compareTo(int_str));
        System.out.println("THe int_str with \".compareTo()\" method result: " + int_str.compareTo(int_num));
        System.out.println("The int_num with \".equals()\" method result: " + int_num.equals(int_str));
        System.out.println("THe int_str with \".equals()\" method result: " + int_str.equals(int_num));
        System.out.println("The int_num with \".describeConstable()\" method result: " + int_num.describeConstable());
        System.out.println("THe int_str with \".describeConstable()\" method result: " + int_str.describeConstable());
        System.out.println("The int_num with \".getClass()\" method result: " + int_num.getClass());
        System.out.println("THe int_str with \".getClass()\" method result: " + int_str.getClass());
        System.out.println();
        System.out.println("The ENUMS of the Short Class are:");
        System.out.println("The int_num with \"MAX_VALUE\" enum result: " + int_num.MAX_VALUE);
        System.out.println("THe int_str with \"MAX_VALUE\" enum result: " + int_str.MAX_VALUE);
        System.out.println("The int_num with \"MIN_VALUE\" enum result: " + int_num.MIN_VALUE);
        System.out.println("THe int_str with \"MIN_VALUE\" enum result: " + int_str.MIN_VALUE);
        System.out.println("The int_num with \"SIZE\" enum result: " + int_num.SIZE);
        System.out.println("THe int_str with \"SIZE\" enum result: " + int_str.SIZE);
        System.out.println("The int_num with \"TYPE\" enum result: " + int_num.TYPE);
        System.out.println("THe int_str with \"TYPE\" enum result: " + int_str.TYPE);

        System.out.println();
        System.out.println("The \"Integer.max(int x, int y)\" method result: " + Integer.max(int_num, int_str));
        System.out.println("The \"Integer.min(int x, int y)\" method result: " + Integer.min(int_num, int_str));
        System.out.println("The \"Integer.toString(int x)\" method result: " + Integer.toString(int_num));
        System.out.println("The \"Integer.toString(int x, int radix)\" method result: " + Integer.toString(int_str, int_str));
        System.out.println("The \"Integer.toBinaryString(int_num)\" method result: " + Integer.toBinaryString(int_num));
        System.out.println("The \"Integer.toBinaryString(int_str)\" method result: " + Integer.toBinaryString(int_str));
        System.out.println("The \"Integer.toHexString(int_num)\" method result: " + Integer.toHexString(int_num));
        System.out.println("The \"Integer.toHexString(int_str)\" method result: " + Integer.toHexString(int_str));
        System.out.println("The \"Integer.toOctalString(int_num)\" method result: " + Integer.toOctalString(int_num));
        System.out.println("The \"Integer.toOctalString(int_str)\" method result: " + Integer.toOctalString(int_str));
        System.out.println("The \"Integer.toUnsignedString(int_num)\" method result: " + Integer.toUnsignedString(int_num));
        System.out.println("The \"Integer.toUnsignedString(int_str)\" method result: " + Integer.toUnsignedString(int_str));
        System.out.println("The \"Integer.toUnsignedString(int_num)\" method result: " + Integer.toUnsignedString(int_num, int_str));
        System.out.println("The \"Integer.toUnsignedString(int_str)\" method result: " + Integer.toUnsignedString(int_str, int_num));

        System.out.println(Integer.bitCount(int_num));
        System.out.println(Integer.bitCount(int_str));
        System.out.println(Integer.sum(int_num, int_str));

    }

}