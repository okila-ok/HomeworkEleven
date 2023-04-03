import testData.DirectorData;
import testData.EmployeeData;
import testData.ManagerData;
import testData.WorkerData;
import homeworkEight2.EmployeeUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeUtilsTest {
    @Test
    public void findByNameTest(){

        Assert.assertEquals(EmployeeUtils.findByName(EmployeeData.name, EmployeeData.getEmployeeData()), 1); // string name created in EmployeeData
        Assert.assertEquals(EmployeeUtils.findByName(EmployeeData.names[0], EmployeeData.getEmployeeData()), 0 ); // array names created in EmployeeData
        Assert.assertNotEquals(EmployeeUtils.findByName(EmployeeData.names1[3], EmployeeData.getEmployeeData()), 0);;
    }

    @Test
    public void findBySubNameTest(){
        Assert.assertEquals(EmployeeUtils.findBySubName(EmployeeData.names[3], EmployeeData.getEmployeeData()),1);
        Assert.assertNotEquals(EmployeeUtils.findBySubName(EmployeeData.names[6], EmployeeData.getEmployeeData()), 2);
    }

    @Test
    public void salarySumTest(){
        Assert.assertEquals(EmployeeUtils.salarySum(WorkerData.getWorkerData()), 600);
        Assert.assertNotEquals(EmployeeUtils.salarySum(WorkerData.getWorkerData()), 200);
    }

    @Test
    public void findMaxSalaryTest(){
        Assert.assertEquals(EmployeeUtils.findMaxSalary(WorkerData.getWorkerData()), 300);
        Assert.assertNotEquals(EmployeeUtils.findMaxSalary(WorkerData.getWorkerData()), 100);
    }

    @Test
    public void findMinSalaryTest() {
        Assert.assertEquals(EmployeeUtils.findMinSalary(ManagerData.getManagerData()), 3000);
        Assert.assertNotEquals(EmployeeUtils.findMinSalary(ManagerData.getManagerData()), 7000);
    }

    @Test
    public void findMinNumberOfSubordinatesTest(){
        Assert.assertEquals(EmployeeUtils.findMinNumberOfSubordinates(DirectorData.getDirectorData()), 1);
        Assert.assertNotEquals(EmployeeUtils.findMinNumberOfSubordinates(DirectorData.getDirectorData()), 5);
    }

    @Test
    public void findMaxNumberOfSubordinatesTest(){
        Assert.assertEquals(EmployeeUtils.findMaxNumberOfSubordinates(ManagerData.getManagerData()), 300);
        Assert.assertNotEquals(EmployeeUtils.findMaxNumberOfSubordinates(ManagerData.getManagerData()),1000);
        Assert.assertNotEquals(EmployeeUtils.findMaxNumberOfSubordinates(ManagerData.getManagerData()),100);
    }

    @Test
    public void findMaxIncrementTest(){
        Assert.assertEquals(EmployeeUtils.findMaxIncrement(ManagerData.getManagerData()),24000);
        Assert.assertNotEquals(EmployeeUtils.findMaxIncrement(ManagerData.getManagerData()), 2000);
    }

    @Test
    public void findMinIncrementTest(){
        Assert.assertEquals(EmployeeUtils.findMinIncrement(ManagerData.getManagerData()), 2000);
        Assert.assertNotEquals(EmployeeUtils.findMinIncrement(ManagerData.getManagerData()), 30000);
    }

    @Test
    public void findSumOfSalariesTest(){
        Assert.assertEquals(EmployeeUtils.findSumOfSalaries(EmployeeData.getEmployeeData()), 600);
        Assert.assertNotEquals(EmployeeUtils.findSumOfSalaries(EmployeeData.getEmployeeData()), 0);
        Assert.assertEquals(EmployeeUtils.findSumOfSalaries(EmployeeData.getAllEmployeeData()), 60010);
        Assert.assertNotEquals(EmployeeUtils.findSumOfSalaries(EmployeeData.getAllEmployeeData()), 5010);
    }
}


