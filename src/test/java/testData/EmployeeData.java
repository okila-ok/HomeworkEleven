package testData;

import homeworkEight2.Director;
import homeworkEight2.Employee;
import homeworkEight2.Manager;
import homeworkEight2.Worker;

public class EmployeeData {

    public static String name = "Alex";
    public static String[] names = {"Jack", "Alex", "Peter", "Al", "ac", "ete", "haha"};
    public static String[] names1 = {"Jack", "Alex", "Peter", "John"}; //negative

    public static Employee[] getEmployeeData(){
        Employee emp1 = new Employee("Jack", 100);
        Employee emp2 = new Employee("Alex", 200);
        Employee emp3 = new Employee("Peter", 300);
        Employee[] employees = {emp1, emp2, emp3};
        return employees;
    }

    public static Employee[] getAllEmployeeData(){
        Worker wr = new Worker("Chandler", 10);
        Manager man = new Manager("Monica", 2000, 100);
        Director dir = new Director("Ross", 3000, 200);
        Employee[] empExtended = {wr, man, dir}; // masking Worker, Manager, Director to put them into the Employee array
        return empExtended;
    }
}
