package testData;

import homeworkEight2.Worker;

public class WorkerData {


    public static Worker[] getWorkerData() {
        Worker wr1 = new Worker("Sherlock", 100);
        Worker wr2 = new Worker("Watson", 200);
        Worker wr3 = new Worker("Hudson", 300);
        Worker[] workers = {wr1, wr2, wr3};
        return workers;
    }
}