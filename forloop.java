import java.util.*;
public class forloop {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner (System.in);
        System.out.print("\t\tENTER THE NUMBER TO FIND FACTORIAL :");
        int number=sc.nextInt();
        int fact=1;
        for(int a=1;a<=number;a++)
        {
           
                fact=fact*a; 
                
        }
        System.out.println("\t\t\tPROCESSING. . .");
        Thread.sleep(1000);
        System.out.println("\t\tTHE FACTORIAL OF THE GIVEN "+number+" NUMBER IS "+fact);
        sc.close();
    }
    
}
