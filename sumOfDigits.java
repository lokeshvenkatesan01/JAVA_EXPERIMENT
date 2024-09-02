import java.util.*;

public class sumOfDigits{

    //THE SUM AND PRODUCT  OF THE NUMBER
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("ENTER THE NUMBER : ");
        int rem=0; 
        int sum=0;
        int product=0;
        int num=sc.nextInt();
        while(num>0 )
        {
            
            rem=num % 10; //  => REM = NUM % 10             |_ WE CAN ALSO GIVE => SUM + = NUM % 10;
            sum+=rem;     //  => SUM = SUM + REM 
            product*=rem;           
            num/= 10;       // => NUM = NUM / 10
           
                       
        } 
        System.out.println("THE SUM OF THE NUMBER IS :"+sum);
        System.out.println("THE PRODUCT OF THE NUMBER IS :"+product);
    }
    
}
