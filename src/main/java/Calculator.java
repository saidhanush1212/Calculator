import java.util.*;
import java.lang.Math;
public class Calculator
{
    public double Square_root(int x)
    {
        return Math.sqrt(x);
    }

    public long factorial(int x)
    {
        if(x==0 || x==1)
        {
            return 1;
        }

        return x*factorial(x-1);
    }

    public double logn(int x)
    {
        return Math.log(x);
    }

    public long power(int x,int y)
    {
        long ans=1;
        while(y>0)
        {
            if(y%2==1) ans*=x;
            x*=x;
            y/=2;

        }
        return ans;
    }





}
