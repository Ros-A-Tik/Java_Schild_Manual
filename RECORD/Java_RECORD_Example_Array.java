package RECORD;

import java.util.Scanner;

public class Java_RECORD_Example_Array extends Java_RECORD_Basics {

    public static String empName, empIdNum;

    public static Employee[] empArrayList = new Employee[4];

    public static void inputMethod () {
        Scanner input = new Scanner(System.in);

        for( int i = 0; i < empArrayList.length; i++) {
            System.out.println("Input a employee No." + i + " name, please:");
            empName = input.nextLine();
            System.out.println("Input a employee No." + i + " id number, please:");
            empIdNum = input.nextLine();
            empArrayList[i] = new Employee(empName, empIdNum);
        }

        System.out.println("The Employee's list of name's ad id's are: " );
        for(Employee e: empArrayList) {
            System.out.println("The name of the employee is " + e.empName() + ", id_number is: " +e.empIdNum());
        }
    }

    public static void main (String[] args) {
        inputMethod();
    }
}
