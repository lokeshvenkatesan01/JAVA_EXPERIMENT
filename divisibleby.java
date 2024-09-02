import java.util.*;
public class divisibleby{

    // DIVISIBLE BY 3 AND 9
    public static void main(String[] args)
     {        
        Scanner sc=new Scanner(System.in); 
        System.out.print("ENTER THE N VALUE : ");
        int n=sc.nextInt();
        while(n>=1)
         {
            if(n%3==0 && n%9==0)
            {
                System.out.println(n);
               
            }
            n--;
        }
        sc.close();

    }
}