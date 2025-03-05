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

        Employee e1 = new Employee(230, "Mario ", 15500);
        Employee e2 = new Employee(340, "Laura ", 35000);
        Employee e3 = new Employee(531, "Ale ", 800);

        System.out.println("Emp " + e1);
        System.out.println("Emp " + e2);
        System.out.println("Emp " + e3);
    }

}
