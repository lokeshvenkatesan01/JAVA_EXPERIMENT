import java.util.*;

public class sumOfDigits{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("ENTER THE NUMBER : ");
        int rem=0; 
        int sum=0;
        int num=sc.nextInt();
        while(num>0 )
        {
            
            rem=num % 10; //  => REM = NUM % 10
            sum+=rem;     //  => SUM = SUM + REM
            num/= 10;       // => NUM = NUM / 10
           
                       
        } 
        System.out.println("THE SUM OF THE NUMBER IS :"+sum);
    }
    
}
