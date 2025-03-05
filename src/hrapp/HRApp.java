/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hrapp;

/**
 *
 * @author mariohmis
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HRApp Starts");

        Employee e1 = new Employee(230, "Mario ", 15000);
        Employee e2 = new Employee(340, "Laura ", 15000);
        Employee e3 = new Employee(531, "Ale ", 15000);

        Department dept = new Department("Education");
        dept.addEmp(e2);
        dept.addEmp(e3);
        dept.addEmp(new Employee(772, "Jack", 15000));

        Employee[] emps = dept.getEmployees();

        for (Employee emp : emps) {

            System.out.println("Emp " + emp);

        }
        System.out.println("Department: " + dept.getName());
        System.out.println("Total Salary of the employees are: " + dept.getTotalSalary());
        System.out.println("The Avarage Salary is: " + dept.getAverageSalary());
        
        System.out.println("Emp " + dept.getEmployeeByID(531));
    }

}
