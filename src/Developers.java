import java.time.LocalDate;
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
       LocalDate date=LocalDate.now();
       double year=date.getYear();
       double WorkingYears=year - yearWhenEmploy;
       for(int i=1; i<=WorkingYears; i++){
           salary+=1000;

           for(Technology technology: technologies){
               salary+=technology.prem;
           }


    }



}
