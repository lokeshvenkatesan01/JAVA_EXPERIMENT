import java.util.*;
public class multiplication {   


    // THE TABLES  OF N NATURAL NUMBER
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE N VALUE : ");
        int n=sc.nextInt();
        System.out.println("PROCESSING ...");
        Thread.sleep(2000);
        for(int i=1;i<=10;i++)
        {
            int x=i*n;
            System.out.println(n+" * "+i+" = "+x);
        }             
        sc.close();        
    }    
}

    

