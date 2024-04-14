import java.util.ArrayList;

public class Manager extends Employee{

    public ArrayList<Purposes>purposes;

    public Manager(String name, String lastName, String address, String email, String pesel, int yearWhenEmploy) {
        super(name, lastName, address, email, pesel, yearWhenEmploy);
    }

    @Override
    public void displayInfo() {
        System.out.println("Developer: " + name + " " + lastName + " " + address +" " + email + " " + pesel + " ");
    }
    public void addCompletedPurpose(Purposes purposes){

    }

    @Override
    public double calculateSalary() {
        double salary=super.calculateSalary();
        salary+=purposes.size();
        return salary;


    }
}
