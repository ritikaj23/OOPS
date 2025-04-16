public class TestEncapsulation {
    public static void main(String[] args) {
        // Step 1: Create an instance of the Employee class
        Employee emp = new Employee();

        // Step 2: Use setter methods to set values for name, age, and salary
        emp.setName("Alice");
        emp.setAge(30);           // valid age
        emp.setSalary(50000);     // valid salary

        // Step 3: Call the method to print employee details
        System.out.println("=== Valid Employee Details ===");
        System.out.println(emp.toString());

        // Step 4: Try setting invalid values for age and salary
        emp.setAge(-5);           // invalid age
        emp.setSalary(-10000);    // invalid salary

        // Step 5: Call the method to print employee details again
        System.out.println("\n=== After Attempting Invalid Updates ===");
        System.out.println(emp.toString());
    }
}
