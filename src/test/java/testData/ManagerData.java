package testData;

import homeworkEight2.Manager;

public class ManagerData {

    public static Manager[] getManagerData() {
        Manager man1 = new Manager("Joe", 1000, 100);
        Manager man2 = new Manager("Joseph", 2000, 200);
        Manager man3 = new Manager("Joye", 3000, 300);
        Manager[] managers = {man1, man2, man3};
        return managers;
    }
}