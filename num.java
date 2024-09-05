public class num {
                /*
                      1 
                    1 2
                  1 2 3
                1 2 3 4
              1 2 3 4 5
            1 2 3 4 5 6
                */
        public static void main(String[] args) {
           int  n=5;
           
           for (int i=0;i<=n;i++)
           {
            int k=1;
            for(int j=0;j<=n;j++)
            {
                if(i+j>=n)
                {    
                    System.out.print(k++ +" ");              

                }
                else
                {
                    System.out.print("  ");
                }
                
    
            }
            System.out.println();
           }
    
        }
        
    }
    
    
