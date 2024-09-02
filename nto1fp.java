import java.util.*;
public class nto1fp {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print(" ENTER THE NUMBER : ");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++)
        {
            if(i%2==0)
            {
            System.out.print("\t"+i+" ");
            Thread.sleep(500);
            }
        }
        sc.close();

    }
    
}
