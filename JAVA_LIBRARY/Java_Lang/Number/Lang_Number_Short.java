package JAVA_LIBRARY.Java_Lang.Number;

public class Lang_Number_Short {

    public static String short_Constructions = "The \"Short\" Constructions are:\n\tShort(short num);\n\tShort(String str) throws NUmberFormatException;";
    public static Short short_Num;
    public static Short short_Str;
    public static String str_Short, str_var;

    public static void main (String[] args) {

        short_Num = 25;
        str_Short = "225";
        short_Str = Short.valueOf(str_Short);

        System.out.println("The \"Short(short num)\" constructor has value of: " + short_Num);
        System.out.println("The \"Short(String str) constructor has value of: " + short_Str);
        System.out.println();

        System.out.println("The methods of the Short constructions are:");
        System.out.println("The short_Num with \".shortValue()\" method result: " + short_Num.shortValue());
        System.out.println("THe short_Str with \".shortValue()\" method result: " + short_Str.shortValue());
        System.out.println("The short_Num with \".toString()\" method result: " + short_Num.toString());
        System.out.println("THe short_Str with \".toString()\" method result: " + short_Str.toString());
        System.out.println("The short_Num with \".byteValue()\" method result: " + short_Num.byteValue());
        System.out.println("THe short_Str with \".byteValue()\" method result: " + short_Str.byteValue());
        System.out.println("The short_Num with \".doubleValue()\" method result: " + short_Num.doubleValue());
        System.out.println("THe short_Str with \".doubleValue()\" method result: " + short_Str.doubleValue());
        System.out.println("The short_Num with \".floatValue()\" method result: " + short_Num.floatValue());
        System.out.println("THe short_Str with \".floatValue()\" method result: " + short_Str.floatValue());
        System.out.println("The short_Num with \".intValue()\" method result: " + short_Num.intValue());
        System.out.println("THe short_Str with \".intValue()\" method result: " + short_Str.intValue());
        System.out.println("The short_Num with \".longValue()\" method result: " + short_Num.longValue());
        System.out.println("THe short_Str with \".longValue()\" method result: " + short_Str.longValue());
        System.out.println("The short_Num with \".compare()\" method result: " + short_Num.compare(short_Num, short_Str));
        System.out.println("THe short_Str with \".compare()\" method result: " + short_Str.compare(short_Str, short_Num));
        System.out.println("The short_Num with \".compareTo()\" method result: " + short_Num.compareTo(short_Str));
        System.out.println("THe short_Str with \".compareTo()\" method result: " + short_Str.compareTo(short_Num));
        System.out.println("The short_Num with \".equals()\" method result: " + short_Num.equals(short_Str));
        System.out.println("THe short_Str with \".equals()\" method result: " + short_Str.equals(short_Num));
        System.out.println("The short_Num with \".describeConstable()\" method result: " + short_Num.describeConstable());
        System.out.println("THe short_Str with \".describeConstable()\" method result: " + short_Str.describeConstable());
        System.out.println("The short_Num with \".getClass()\" method result: " + short_Num.getClass());
        System.out.println("THe short_Str with \".getClass()\" method result: " + short_Str.getClass());
        System.out.println();
        System.out.println("The ENUMS of the Short Class are:");
        System.out.println("The short_Num with \"MAX_VALUE\" enum result: " + short_Num.MAX_VALUE);
        System.out.println("THe short_Str with \"MAX_VALUE\" enum result: " + short_Str.MAX_VALUE);
        System.out.println("The short_Num with \"MIN_VALUE\" enum result: " + short_Num.MIN_VALUE);
        System.out.println("THe short_Str with \"MIN_VALUE\" enum result: " + short_Str.MIN_VALUE);
        System.out.println("The short_Num with \"SIZE\" enum result: " + short_Num.SIZE);
        System.out.println("THe short_Str with \"SIZE\" enum result: " + short_Str.SIZE);
        System.out.println("The short_Num with \"TYPE\" enum result: " + short_Num.TYPE);
        System.out.println("THe short_Str with \"TYPE\" enum result: " + short_Str.TYPE);

    }
}
