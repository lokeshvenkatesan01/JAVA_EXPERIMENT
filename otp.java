import java.util.*;
public class otp {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);     
        while(true){
        int opt=(int)(Math.random()*99999+99999);
        System.out.println("\t\t"+opt);
        System.out.println("\t\tOTP GENERATED ... ");
        Thread.sleep(3000); 
        System.out.print("\t\tENTER THE OTP VALUE : ");
        int gene_otp=sc.nextInt();
        if(opt==gene_otp)
        {
            System.out.println("\t\tVALID OTP !!!");
        }
        else{
            System.out.println("\t\tINVALID OTP !?");
        }
        System.out.println();
        Thread.sleep(1000); 
    }

    }

}
