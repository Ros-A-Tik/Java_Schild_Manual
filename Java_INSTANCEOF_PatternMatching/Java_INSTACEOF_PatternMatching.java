package Java_INSTANCEOF_PatternMatching;

public class Java_INSTACEOF_PatternMatching {

    public static void main (String[] args) {

        Number myObj;

        myObj = Integer.valueOf(9);
        if (myObj instanceof Integer intObj) {
            System.out.println("intObj refers to an integer and is equal to: " + intObj);
        }

        if (myObj instanceof Integer) {
            Integer intObj = (Integer) myObj;
            System.out.println("intObj refers to an integer and is equal to: " + intObj);
        }

        Object [] someObj = {
                new String ("Alpha"),
                new String ("Beta"),
                new String ("Gama"),
                new String ("Omega"),
                Integer.valueOf(10)
        };

        int i;

        for(i = 0; (someObj[i] instanceof String str) && (i < someObj.length); i++) {
            System.out.println("Processing: " + str);
        }
    }
}
