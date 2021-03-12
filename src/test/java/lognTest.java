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
public class lognTest {
    @BeforeClass
    public static void before_test_class()
    {
        System.out.println("Starting the testing process");
    }



    @Parameterized.Parameter(0)
    public int c;

    @Parameterized.Parameter(1)
    public int res3;

    @Parameterized.Parameters
    public static Collection<Object[]> data3(){
        Object[][] data= new Object[][]{{1,0}};
        return Arrays.asList(data);
    }


    @Test
    public void logn_test() {
        Calculator cal= new Calculator();
        Assert.assertEquals(res3,cal.logn(c),0.1);
    }

    @AfterClass
    public static void after_test_class ()
    {
        System.out.println("Finished testing process");
    }
}