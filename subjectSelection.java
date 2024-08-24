import java.util.*;
public class subjectSelection{
    public static void main(String[] args) throws Exception
     {        
        Scanner sc=new Scanner(System.in); 
        int count =1;
        // System.out.print("ENTER THE N VALUE : ");
        // int n=sc.nextInt();
        while(count<=100)
         {
            if(count<=30)
            {
                System.out.println("JAVA :"+count);
               
            }
            else if(count<=60)
            {
                System.out.println("SQL :"+count);
               
            }
            else if(count<=100)
            {
                System.out.println("JAVA SCRIPT :"+count);
               
            }
            count++;
            Thread.sleep(500);            

            
        }

    }
}
    

