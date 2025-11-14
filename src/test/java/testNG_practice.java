import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNG_practice {

    @Test (groups = {"smoke"})
    public void test1(){
        System.out.println("test 1 ");
    }

    @Test(groups = {"regression"})
    public void test2(){
        System.out.println("test 2 ");
    }

    @Test(groups = {"smoke"})
    public void test3(){
        System.out.println("test 3 ");
    }

    @Test(groups = {"regression"})
    public void test4(){
        System.out.println("test 4 ");
    }

    @Test(groups = {"smoke" , "sanity" , "regression"})
    public void test5(){
        System.out.println("test 5 ");
    }
    @DataProvider
    public Object[][] numbers() {
        return new Object[][]{
                {1, 2},
                {5, 7},
                {10, 20}
        };
    }

    @Test(dataProvider = "numbers")
    public void testSum(int a, int b) {
        System.out.println(a + b);
    }
}
