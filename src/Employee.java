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
        return baseSalary;
    }

    public int DeveloperSalary(){
        int salary=3000;
        LocalDate date=LocalDate.now();
        int year=date.getYear();
        int WorkingYears = year - yearWhenEmploy;
        for(int i=1; i<=WorkingYears;i++){
            salary+=1000;
        }
        return salary;
    }
}
