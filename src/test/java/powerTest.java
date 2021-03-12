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
public class powerTest {
    @BeforeClass
    public static void before_test_class()
    {
        System.out.println("Starting the testing process");
    }

    @Parameterized.Parameter(0)
    public int x;

    @Parameterized.Parameter(1)
    public int y;

    @Parameterized.Parameter(2)
    public int res;

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] data= new Object[][]{{1,0,1},{10,2,100},{5,3,125}};
        return Arrays.asList(data);
    }

    @Test
    public void power_test() {
        Calculator cal= new Calculator();
        Assert.assertEquals(res,cal.power(x,y));
    }
    @AfterClass
    public static void after_test_class ()
    {
        System.out.println("Finished testing process");
    }
}