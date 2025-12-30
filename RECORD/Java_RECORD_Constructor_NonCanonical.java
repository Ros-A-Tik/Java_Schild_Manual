package RECORD;

public class Java_RECORD_Constructor_NonCanonical {

    record Pass (String s, int n){
        static int pendinN = -1;

        public Pass {
            s = s.trim();
        }

        public Pass (String nam) {
            this (nam, pendinN);
        }
    }

    public static void main (String [] args) {

        Pass[] pasList = new Pass[4];

        pasList[0] = new Pass("Rostik", 100);
        pasList[1] = new Pass ("Sonya", 200);
        pasList[2] = new Pass("Kira", 300);
        pasList[3] = new Pass("Leonid");

        for(Pass e: pasList) {
            System.out.println(e.n() + ", " + e.s());
        }
    }
}