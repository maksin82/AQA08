
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Ivanov Ivan Ivanych", "Engineer",
                "ivivan@mailbox.com", "892312312", 80000, 30);

        System.out.println("_________Task 1_________");
        employee.getEmployeeInfo();

        System.out.println("_________Task 2_________");
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan Ivanych", "Engineer",
                "ivivan@mailbox.com", "892312312", 80000, 30);
        persArray[1] = new Person("Ekaterina Sergeevna Ivanova", "Developer",
                "ekaterina.ivanova@example.com", "1234567890", 90000, 30);
        persArray[2] = new Person("Natalya Mikhaylovya Petrova", "Project manager",
                "nataly.petrova@example.com", "0987654321", 95000, 35);
        persArray[3] = new Person("Sergey Pavlovich Voronov", "Database administrator",
                "sergey.voronov@example.com", "3344556677", 85000, 33);
        persArray[4] = new Person("Maria Dmitrievna Popova", "Tester",
                "maria.popova@example.com", "2233445566", 70000, 24);

        for (Person emp : persArray) {
            System.out.println(emp);
        }

        System.out.println("_________Task 3_________");
        Park park = new Park("Itchy & Scratchy Land");
        park.addAttraction("Insano", 12.20, "11:00 AM - 23:00 PM");
        park.addAttraction("White Cyclone", 52.45, "11:00 AM - 23:00 PM");
        park.addAttraction("Formula Rossa", 28.13, "11:00 AM - 23:00 PM");

        park.getAttractionInfo();
        park.deleteAttraction(1);
        park.updatePrice("Insano", 46.88);
        park.updateWorkingHours("Formula Rossa","Temporarily not working");
        park.getAttractionInfo();
    }
}

