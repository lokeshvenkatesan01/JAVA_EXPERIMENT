import java.util.*;
public class primeNumber {
    public static void main(String[] args)throws Exception {
    Scanner sc=new Scanner(System.in);
    System.out.print("STARTING NUMBER : ");
    int start=sc.nextInt();
    System.out.print("ENDING NUMBER :");
    int end=sc.nextInt();
    System.out.println("THE PRIME NUMBERs WITHIN THE RANGES ARE GIVEN : ");
    System.out.println("Searching . . .");
    Thread.sleep(500);
    int count =0;
    for(int i=start;i<=end;i++)
    {
        boolean kishore=true;
            if(i==0||i==1)
                  continue;
            for(int j=2;j<=Math.sqrt(i);j++)
                {
                    if(i%j==0)
                    {   kishore=false;
                        
                        break;
                    }
                
                }
         if (kishore) {
            System.out.print(i+" ");
            count++;
         }
                     
    }
    
    System.out.print("\t THE TOTAL COUNT : "+count);

    
    }
}
