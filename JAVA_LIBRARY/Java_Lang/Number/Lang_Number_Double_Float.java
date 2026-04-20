package JAVA_LIBRARY.Java_Lang.Number;

public class Lang_Number_Double_Float {
    public static String float_Const = "The Float constructions are:\n\tFloat(double num);\n\tFloat(float num);\n\tFloat(String str) throws NumberFormatException";
    public static String double_Const = "The Float constructions are:\n\tDouble(double num);\n\tFloat(String str) throws NumberFormatException";

    public static void main(String[] args) {
        Float f = 2.33f;
        Double d = 3.363636;
        Double d_1 = 4.45454545;

        System.out.println(f.valueOf(f));
        System.out.println(f.BYTES);
        System.out.println(f.MAX_EXPONENT);
        System.out.println(f.MAX_VALUE);
        System.out.println(f.MIN_EXPONENT);
        System.out.println(f.MIN_NORMAL);
        System.out.println(f.MIN_VALUE);
        System.out.println(f.POSITIVE_INFINITY);
        System.out.println(f.NEGATIVE_INFINITY);
        System.out.println(f.SIZE);
        System.out.println(f.TYPE);

        System.out.println();

        System.out.println(d.valueOf(d));
        System.out.println(d.BYTES);
        System.out.println(d.MAX_EXPONENT);
        System.out.println(d.MAX_VALUE);
        System.out.println(d.MIN_EXPONENT);
        System.out.println(d.MIN_NORMAL);
        System.out.println(d.MIN_VALUE);
        System.out.println(d.POSITIVE_INFINITY);
        System.out.println(d.NEGATIVE_INFINITY);
        System.out.println(d.SIZE);
        System.out.println(d.TYPE);

        System.out.println();

        System.out.println(d + " = " + d_1 + " -> " + d.equals(d_1));
        System.out.println(d + " = " + d_1 + " -> " + d.compareTo(d_1));
        System.out.println(d + " = " + d_1 + " -> " + d.hashCode());
        System.out.println(d + " = " + d_1 + " -> " + d.isNaN());


    }
}
