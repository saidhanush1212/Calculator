import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class SqrtTest {
    @BeforeClass
    public static void before_test_class()
    {
        System.out.println("Starting the testing process");
    }

    @Parameterized.Parameter(0)
    public int a;

    @Parameterized.Parameter(1)
    public int res1;

    @Parameterized.Parameters
    public static Collection<Object[]> data1(){
        Object[][] data= new Object[][]{{16,4},{25,5}};
        return Arrays.asList(data);
    }

    @Test
    public void square_root_test() {
        Calculator cal= new Calculator();
        Assert.assertEquals(res1,cal.Square_root(a),0.1);
    }



    @AfterClass
    public static void after_test_class ()
    {
        System.out.println("Finished testing process");
    }
}