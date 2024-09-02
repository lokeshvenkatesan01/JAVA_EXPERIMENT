import java.util.*;
public class SumOfN {

    // THE SUM OF N NATURAL NUMBER
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE N VALUE :");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("PROCESSING ...");
        Thread.sleep(500);
        System.out.println("THE SUM OF NUMBER IS : "+sum);
        sc.close();
    }
    
}
