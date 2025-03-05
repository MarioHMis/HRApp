/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hrapp;

/**
 *
 * @author mariohmis
 */
public class Departament {

    private String name;

    private Employee[] employees = new Employee[10];

    private int lastAddedEmployeeIndex = -1;

    public Departament(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmp(Employee anEmployee) {
        if (lastAddedEmployeeIndex < employees.length) {
            lastAddedEmployeeIndex++;
            employees[lastAddedEmployeeIndex] = anEmployee;
        }
    }
        
    public Employee[] getEmployees() {
        Employee[] actualEmployees = new Employee[lastAddedEmployeeIndex+1];
        
        for(int i = 0; i < actualEmployees.length; i++) {
            actualEmployees[i] = employees[i];
        }
        return actualEmployees;
    }
    }


