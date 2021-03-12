import java.util.*;
import java.lang.Math;

public class Main{

    public static void main(String[] args)
    {
        Calculator cal= new Calculator();
        Scanner scaninp = new Scanner(System.in);
        while(true)
        {    int menu;
            System.out.println("SELECT ANY OF THE BELOW FUNCTIONS");
            System.out.println("1. Square root Function");
            System.out.println("2. Natural log Function");
            System.out.println("3. Factorial Function");
            System.out.println("4. Power Function");
            System.out.println("5. Quit");
            System.out.println("ENTER CHOICE");

            menu=scaninp.nextInt();
            System.out.println(menu);
            if(menu<=3 && menu>=1)
            {
                int x;
                System.out.println("ENTER THE NUMBER: ");
                x=scaninp.nextInt();
                System.out.println(x);
                if(menu==1)
                {
                    System.out.println(cal.Square_root(x));
                }
                else if(menu==2)
                {
                    System.out.println(cal.logn(x));
                }
                else
                {
                    System.out.println(cal.factorial(x));
                }

            }
            else if(menu==4)
            {
                int x,y;
                System.out.println("ENTER THE NUMBERS X and Y for power(X,Y): ");
                x=scaninp.nextInt();
                y=scaninp.nextInt();
                if(x<0 || y<0){System.out.println("INVALID INPUT"); return ;}
                System.out.println(cal.power(x,y));
            }
            else if(menu==5)
            {
                System.out.println("THANK YOU :)");
                break;
            }
            else
            {
                System.out.println("INVALID INPUT");
            }
        }


    }

}
