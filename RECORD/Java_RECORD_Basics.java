package RECORD;

public class Java_RECORD_Basics {
    public static String recordBasics = """
            record recordName (component-list) {
            // optional body statements
            }
            """;

    public record Employee (String empName, String empIdNum) {}

    public static Employee emp;

    public static void main(String[] args) {
        System.out.println(recordBasics);

        emp = new Employee("Rostislav", "000");
        System.out.println("The example of the \"record\": \npublic static record Employee (String name, int idNum) { }" +
        "\nAnd of the it's result. Which are: " + emp.empName + ", " + emp.empIdNum);

    }
}