import java.util.ArrayList;

public class Developers extends Employee {

    public Developers(String name, String lastName, String address, String email, String pesel, int yearWhenEmploy ) {
        super(name, lastName, address, email, pesel, yearWhenEmploy);
    }
    public ArrayList<String> technologies;

    @Override
    public void displayInfo() {
        System.out.println("Developer: " + name + " " + lastName + " " + address +" " + email + " " + pesel + " " + technologies );
    }

    @Override
    public double calculateSalary() {
        double salary=super.calculateSalary();
        salary+=technologies.size();
        return salary;
    }
}
