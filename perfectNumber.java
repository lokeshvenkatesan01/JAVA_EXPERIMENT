import java.util.*;
public class perfectNumber {
    // TO FIND THE PERFECT NUMBER - > I.E THE SUM OF ALL FACTORS IS EQUAL TO THE GIVEN NUMBER
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.print(" ENTER THE NUMBER : ");
        int number=sc.nextInt();
        int sum=0;
        for(int i=1;i<=number/2;i++)
        {
            if(number%i==0)
            {
                sum+=i;
           
            }
            
        }
        if(sum==number)
        {
            System.out.println(" IT'S A PERFECT NUMBER ");
        }
        else{
            System.out.println(" IT'S NOT A PERFECT NUMBER ");

        }
        sc.close();
      
    
    }
    
}}

