public class halfpattern {
    /*
        0     
        0 1
        0 1 2
        0 1 2 3
        0 1 2 3 4
     */
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<=n-1;i++)
        {
            for (int j=0;j<=n-1;j++)
            {
                if(i>=j)
                {
                    System.out.print(j+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
