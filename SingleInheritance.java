class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    String employeeId;
    String department;

    public Employee(String name, int age, String employeeId, String department) {
        super(name, age); 
        this.employeeId = employeeId;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

public class SingleInheritance{
    public static void main(String[] args) {
        Employee employee = new Employee("Alice", 30, "E123", "HR");
        employee.displayInfo();
    }
}
