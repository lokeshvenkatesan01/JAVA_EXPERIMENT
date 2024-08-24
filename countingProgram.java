import java.util.*;

public class countingProgram {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("ENTER THE NUMBER : ");
        int digit =0;
        int num=sc.nextInt();
        while(num>0 )
        {
            num=num/10;            
            digit++;
                       
        } 
        System.out.println(digit);
    }
    
}
