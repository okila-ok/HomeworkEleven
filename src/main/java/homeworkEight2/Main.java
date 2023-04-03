package homeworkEight2;

public class Main {

    public static void main(String[] args) {
        EmployeeUtils empUtils = new EmployeeUtils();

        Employee emp1 = new Employee("Arnold", 10);
        Employee emp2 = new Employee("Phoebe", 20);
        Employee emp3 = new Employee("Helga", 30);
        Employee[] employees = {emp1, emp2, emp3};
        System.out.println(EmployeeUtils.findByName("Arnold", employees));
        System.out.println(EmployeeUtils.findByName("Anna", employees));
        System.out.println(empUtils.findBySubName("Ph", employees));
        System.out.println(empUtils.findBySubName("ph", employees));

        Worker wr1 = new Worker("Pete", 10);
        Worker wr2 = new Worker("Tim", 20);
        Worker[] workers = {wr1, wr2};
        System.out.println(empUtils.findMaxSalary(workers));
        System.out.println(empUtils.salarySum(workers));

        // N.B. regarding findMinSalary, the code will give 0 for small baseSalary and small numberOfSubordinates
        Manager man1 = new Manager("Joe", 1000, 100);
        Manager man2 = new Manager("John", 2000, 200);
        Manager man3 = new Manager("Lee", 3000, 300);
        Manager[] managers = {man1, man2, man3};
        System.out.println(EmployeeUtils.findMinSalary(managers));
        System.out.println(EmployeeUtils.findMaxNumberOfSubordinates(managers));
        System.out.println(EmployeeUtils.findMaxIncrement(managers));
        System.out.println(EmployeeUtils.findMinIncrement(managers));

        Director dir1 = new Director("Chris", 10, 1);
        Director dir2 = new Director("Kyle", 20, 2);
        Director dir3 = new Director("Jasper", 30, 3);
        Director[] directors = {dir1, dir2, dir3};
        System.out.println(EmployeeUtils.findMinNumberOfSubordinates(directors));



        Worker wr3 = new Worker("Chandler", 10);
        Manager man4 = new Manager("Monica", 2000, 100);
        Director dir4 = new Director("Ross", 3000, 200);
        Employee[] empExtended = {wr3, man4, dir4}; // masking Worker, Manager, Director to put them into the Employee array

        System.out.println(wr3.getSalary());
        System.out.println(man4.getSalary());
        System.out.println(dir4.getSalary());
        System.out.println(EmployeeUtils.findSumOfSalaries(empExtended));

        System.out.println(wr3.getSalary());
        System.out.println(empExtended[0].getSalary());
        System.out.println(((Worker) empExtended[0]).getSalary()); // unmasking Worker


        System.out.println(man4.getSalaryManager());
        System.out.println(empExtended[1].getSalary());
        System.out.println(((Manager) empExtended[1]).getSalaryManager()); // unmasking Manager

        System.out.println(dir4.getSalaryManager());
        System.out.println(empExtended[2].getSalary());
        System.out.println(((Director) empExtended[2]).getSalaryManager()); // unmasking Director

    }
}