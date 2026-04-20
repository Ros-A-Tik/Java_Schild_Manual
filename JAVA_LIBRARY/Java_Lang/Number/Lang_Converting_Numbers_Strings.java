package JAVA_LIBRARY.Java_Lang.Number;

import java.io.*;

public class Lang_Converting_Numbers_Strings {

    public static void main (String[] args) throws IOException {

        String str_r;
        int i;
        int sum = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));

        System.out.println("Enter numbers, 0 to quit");

        do {
            str_r = br.readLine();
            try {
                i = Integer.parseInt(str_r);
            } catch (Exception e) {
                System.out.println("Invalid format: " + e);
                i = 0;
            }
            sum += i;
            System.out.println("Current sum is: " + sum);
            System.out.println("The \"sum\" using \"Integer.toString()\" is: " + Integer.toString(sum));
            System.out.println("The \"sum\" using \"Integer.toBinaryString()\" is: " + Integer.toBinaryString(sum));
            System.out.println("The \"sum\" using \"Integer.toOctalString()\" is: " + Integer.toOctalString(sum));
            System.out.println("The \"sum\" using \"Integer.toHexString()\" is: " + Integer.toHexString(sum));

        } while (i != 0);

    }
}
