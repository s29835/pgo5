import java.util.ArrayList;

public class Tester extends Employee {


    public Tester(String name, String lastName, String address, String email, String pesel, int yearWhenEmploy) {
        super(name, lastName, address, email, pesel, yearWhenEmploy);
    }
    private ArrayList<String>tests;

    @Override
    public void displayInfo() {
        System.out.println("Developer: " + name + " " + lastName + " " + address +" " + email + " " + pesel + " " + tests );
    }

    @Override
    public double calculateSalary() {
        double salary=super.calculateSalary();
        salary+=tests.size()*300;
        return salary;
    }
}

