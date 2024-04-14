import java.time.LocalDate;
import java.util.ArrayList;

public class Employee {

    protected String name;
    protected String lastName;
    protected String address;
    protected String email;
    protected String pesel;
    protected int yearWhenEmploy;
    protected double baseSalary;
    public ArrayList<Employee>employees;

    public Employee(String name, String lastName, String address, String email, String pesel, int yearWhenEmploy) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.yearWhenEmploy = yearWhenEmploy;
    }

    public void displayInfo(){

        System.out.println("Employee " + name + " " + lastName + " " + address +" " + email + " " + pesel + " " + yearWhenEmploy);
    }

    public void displayEmployeesInfo(){
        for(Employee e: employees){
            e.displayInfo();
        }
    }


    public double calculateSalary(){
        baseSalary=3000;
        return baseSalary;
    }


}
