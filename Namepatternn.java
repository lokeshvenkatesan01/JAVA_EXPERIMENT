import java.util.*;
public class Namepatternn {
    public static void main(String[] args)throws Exception {
        int n=10;
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            { // L
                
                if(j==0 || i==n-1)
                {
                    System.out.print("L ");
                    Thread.sleep(50);
                }
                else{
                    System.out.print("  ");
                    Thread.sleep(50);
                }
              
            }
            System.out.print("\t"); 
                     
            
            for (int j=0;j<n;j++)
            { // O
                
                if(j==0 || j==n-1 || i==0 || i==n-1)
                {
                    System.out.print("O ");
                    Thread.sleep(50);
                }
                else{
                    System.out.print("  ");
                    Thread.sleep(50);
                }
              
            }
            System.out.print("\t"); 
                       
            
            for (int j=0;j<n;j++)
            {
                // K
                if(j==0 || i+j==n-1 ||(i>=n/2 && i==j))
                {
                    System.out.print("K ");
                    Thread.sleep(50);
                }
                else{
                    System.out.print("  ");
                    Thread.sleep(50);
                }
              
            }
            System.out.print("\t"); 
                      
            
            for (int j=0;j<n;j++)
            {
                // E
                
                if(j==0 || i==n-1 || i==0||i==n/2 )
                {
                    System.out.print("E ");
                    Thread.sleep(50);
                }
                else{
                    System.out.print("  ");
                    Thread.sleep(50);
                }
              
            }
            System.out.print("\t");        
            
            for (int j=0;j<n;j++)
            { // S
                
                if(i==0 || i==n/2||i==n-1||(j==0 && i<n/2)||(j==n-1 && i>n/2))
                {
                    System.out.print("S ");
                    Thread.sleep(50);
                }
                else{
                    System.out.print("  ");
                    Thread.sleep(50);
                }
              
            }
            System.out.print("\t");      
            
            for (int j=0;j<n;j++)
            {
                // H
                
                if(j==0 || j==n-1||i==n/2)
                {
                    System.out.print("H ");
                    Thread.sleep(50);
                }
                else{
                    System.out.print("  ");
                    Thread.sleep(50);
                }
              
            }
              System.out.println("\t");       
            }
        }
        
    }
    

