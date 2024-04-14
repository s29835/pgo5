import java.time.LocalDate;
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
        LocalDate date=LocalDate.now();
        int year=date.getYear();
        int month=date.getMonthValue();
        int WorkingYears = year - yearWhenEmploy;

        for(int i=1; i<=WorkingYears;i++) {
            salary += 1000;

        }
        return salary;
    }


}
