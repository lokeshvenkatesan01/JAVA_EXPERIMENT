import java.util.*;
public class sumofdigi{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int rem=0; 
        int sum=0;
       
        int num=sc.nextInt();
        rem = num % 10; 
        while(num>9 )
        {
           num=num/10;                        
        } 
        sum = rem + num;

        if (sum%2==0)
        {
            System.out.println("THE SUM OF THE NUMBER IS :"+sum);
        }
        else
        {
        System.out.println("THE product OF THE NUMBER IS :"+sum);
        }
        sc.close();
        
    }
    
}
