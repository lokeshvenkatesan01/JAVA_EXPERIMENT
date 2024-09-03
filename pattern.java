public class pattern {
    public static void main(String[] args) {
        int n=25;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j||i==0||i==n-1||j==0||j==n-1||j==n/2||i==n/2||i+j==n-1)
                // left to right diagonal (i==j)
                // first row (i==0)
                // last row (i==n-1)
                // first column (j==0)
                // last column (j==n-1)
                // center column (j==n/2)
                // center row (i==n/2)
                // right to left diagonal (i+j==n-1) 
                {
                    System.out.print("* ");
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
