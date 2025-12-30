package RECORD;

public class Java_RECORD_Constructor_Canonical extends Java_RECORD_Example_Array {

    record Passport (String passName, String passNum) {
//        public Passport (String pName, String pNum) {
//            this.passName = pName.trim();
//            this.passNum = pNum;
//        }

        public Passport {
            passName = passName.trim();
        }
    }

    public static Employee[] empList = new Employee[4];

    public static void main (String [] args) {
        Passport[] passList = new Passport[4];
        passList[0] = new Passport("Sonya", "000");
        passList[1] = new Passport("Kira", "001");
        passList[2] = new Passport("Leonid", "002");
        passList[3] = new Passport("Sonya", "003");

        for (Passport list: passList) {
            System.out.println(list.passName() + ", " + list.passNum());
        }

        empList[0] = new Employee("Rostik", "000");
        empList[1] = new Employee("Sonya", "001");
        empList[2] = new Employee("Kira", "002");
        empList[3] = new Employee("Leonid", "003");

        for (Employee el: empList) {
            System.out.println(el.empName() + ", " + el.empIdNum());
        }

        inputMethod();
    }
}