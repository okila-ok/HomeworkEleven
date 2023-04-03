package testData;

import homeworkEight2.Director;

public class DirectorData {

    public static Director[] getDirectorData() {
        Director dir1 = new Director("Arnold", 10, 1);
        Director dir2 = new Director("Helga", 20, 2);
        Director dir3 = new Director("Phoebe", 30, 3);
        Director[] directors = {dir1, dir2, dir3};
        return directors;
    }
}