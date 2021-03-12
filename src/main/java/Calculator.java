import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.lang.Math;
public class Calculator
{
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public double Square_root(int x)
    {

        logger.info("[SQUARE_ROOT] - " + x );
        if(x<0)
        {
            logger.info("[RESULT - SQUARE_ROOT] - " + "INVALID INPUT");
            return -1;
        }
        logger.info("[RESULT - SQUARE_ROOT] - " + Math.sqrt(x));

        return Math.sqrt(x);
    }

    public long factorial(int x)
    {
        logger.info("[FACTORIAL] - " + x );
        if(x<0)
        {
            logger.info("[RESULT - FACTORIAL] - " + "INVALID INPUT");
            return -1;
        }
        long res=1;
        for(int i=x;i>=1;i--)
        {
            res*=i;
        }
        logger.info("[RESULT - FACTORIAL] - " + res);
        return res;
    }

    public double logn(int x)
    {
        logger.info("[LOGN] - " + x );
        if(x<0)
        {
            logger.info("[RESULT - LOGN] - " + "INVALID INPUT");
            return -1;
        }
        logger.info("[RESULT - LOGN] - " + Math.log(x));
        return Math.log(x);
    }

    public long power(int x,int y)
    {
        logger.info("[POWER] - " + x );

        long ans=1;
        while(y>0)
        {
            if(y%2==1) ans*=x;
            x*=x;
            y/=2;

        }
        logger.info("[RESULT - POWER] - " + ans);


        return ans;
    }





}
