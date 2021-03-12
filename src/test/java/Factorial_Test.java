import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class Factorial_Test {
    @BeforeClass
    public static void before_test_class()
    {
        System.out.println("Starting the testing process");
    }

    @Parameterized.Parameter(0)
    public int b;

    @Parameterized.Parameter(1)
    public int res2;

    @Parameterized.Parameters
    public static Collection<Object[]> data2(){
        Object[][] data= new Object[][]{{1,1},{0,1},{5,120}};
        return Arrays.asList(data);
    }

    @Test
    public void factorial_test() {
        Calculator cal= new Calculator();
        System.out.println(res2);
        System.out.println(b);
        Assert.assertEquals(res2,cal.factorial(b));

    }
    @AfterClass
    public static void after_test_class ()
    {
        System.out.println("Finished testing process");
    }


}