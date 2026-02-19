package id.ac.polban.employee;

import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.EmployeeService;

public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();

        Department itDept = new Department("IT");
        Department hrDept = new Department("HR");
        Department financeDept = new Department("Finance");

        Employee emp1 = Employee.createFullTimeEmployee("Budi Santoso", itDept, 8000000);
        Employee emp2 = Employee.createPartTimeEmployee("Siti Nurhaliza", hrDept, 4000000);
        Employee emp3 = Employee.createContractEmployee("Andi Wijaya", financeDept, 6000000);

        service.addEmployee(emp1);
        service.addEmployee(emp2);
        service.addEmployee(emp3);

        System.out.println("=== Data Karyawan ===");
        printEmployee(service.getEmployee(1));
        printEmployee(service.getEmployee(2));
        printEmployee(service.getEmployee(3));
        System.out.println("\n--- Kenaikan gaji Budi Santoso sebesar 10% ---\n");
        service.raiseSalary(1, 10);

        System.out.println("=== Data Karyawan Setelah Kenaikan Gaji ===");
        printEmployee(service.getEmployee(1));
        printEmployee(service.getEmployee(2));
        printEmployee(service.getEmployee(3));
    }

    private static void printEmployee(Employee emp) {
        if (emp != null) {
            System.out.println("ID         : " + emp.getId());
            System.out.println("Nama       : " + emp.getName());
            System.out.println("Department : " + emp.getDepartment().getName());
            System.out.println("Tipe       : " + emp.getType().getType());
            System.out.println("Gaji       : Rp " + String.format("%,.0f", emp.getSalary()));
            System.out.println("-----------------------------");
        }
    }
}
