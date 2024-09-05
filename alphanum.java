public class alphanum {
    /*
        1 
        A B
        1 2 3
        A B C D
        1 2 3 4 5
        A B C D E F
     */
    public static void main(String[] args) {
        int n=5;
        
        for(int i=0;i<=n;i++)
        {
           
            int k=1;
            char ch ='A';
            for(int j=0;j<=n;j++)
            {
                if(i>=j){
                if (i%2==0)
                {
                    System.out.print(k++ +" ");
                }
                else{
                    System.out.print(ch++ + " ");
                }
            }
        }
            System.out.println();
        }
        
    }
    
}
