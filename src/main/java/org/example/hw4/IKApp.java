package org.example.hw4;

import java.util.List;

public class IKApp {
    public static void main(String[] args) {
        // İK Departmanı oluşturulması ve personel eklenmesi
        Department hrDepartment = new Department("İK Departmanı");
        hrDepartment.addEmployee(new Employee("Ahmet", "Yılmaz", "İK Uzmanı"));
        hrDepartment.addEmployee(new Employee("Ayşe", "Demir", "İK Asistanı"));
        hrDepartment.addEmployee(new Employee("Mehmet", "Kaya", "İK Müdürü"));

        // Departmandaki personellerin listelenmesi
        List<Employee> employeesList = hrDepartment.getEmployees();
        System.out.println(hrDepartment.getName() + " Departmanı Personelleri:");
        for (Employee employee : employeesList) {
            System.out.println("İsim: " + employee.getName() + " " + employee.getSurname() + ", Ünvan: " + employee.getTitle());
        }
    }
}
