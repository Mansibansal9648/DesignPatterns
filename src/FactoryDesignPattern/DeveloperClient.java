package FactoryDesignPattern;

public class DeveloperClient {
    public static void main(String[] args) {

        //making application tightly coupled and client is creating object based on requirement
//        Employee employee = new AndroidDeveloper();
        Employee employee1=EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        System.out.println(employee1);
        int salary1=employee1.salary();
        System.out.println("Salary : "+salary1);

        Employee employee2=EmployeeFactory.getEmployee("WEB DEVELOPER");
        System.out.println(employee2);
        int salary2=employee2.salary();
        System.out.println("Salary : "+salary2);
    }
}
