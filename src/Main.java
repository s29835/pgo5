import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

      ArrayList<Employee> employees = new ArrayList<>();



        Developers dev =new Developers("John", "Doe", "New York" , "john@doe.com" , "123456789" , 2020);
        Technology tech=new Technology("Java",800);
        employees.add(dev);


        Tester tester = new Tester("Jane", "Smith" , "Los Angeles", "jane@smith.com", "987654321", 2021);
        TestType t=new TestType("UX/UI");
        employees.add(tester);


        Manager manager = new Manager("Bob","Johnson", "Chicago", "bob@johnson.com", "1122334455",2019);
        Purposes p=new Purposes( "Implementing FB login", "15.10.2010", 1000);
        manager.addCompletedPurpose(p);
        employees.add(manager);










    }
}