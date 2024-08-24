import java.util.Scanner;
public class zomoto {

    // ZOMOTO APP WORKING ONLY USING SWITCH STATEMENT 

    public static void main(String[] args)throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.println("\t\t\t WELCOME TO ZOMOTO .... :)");
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t\tSELECT THE HOTEL :");
        System.out.print("\t1.BILAL \n\t2.A2B \n\t3.AMMA CANTEEN\n\t4.SS HYDRABAD");
        System.out.print("\t\t ENTER YOUR CHOICE :");
        int h_c=sc.nextInt();
        switch (h_c) {
            case 1:
                    // BILAL HOTEL
                     System.out.println("\t\t GREETINGS FROM BILAL HOTEL !!!");
                     System.out.println("-----------------------------------------------------------");
                     System.out.println("\t1.MUTTON BIRIYANI\n\t2. CHICKEN BIRIYANI \n\t3.GHEE RICE \n\t4.VEG-BIRIYANI ");
                     System.out.print("\t\t ENTER YOUR CHOICE :");
                     int b_c=sc.nextInt();
                    switch (b_c) {
                        case 1:
                            // MUTTON BIRIYANI
                            System.out.println("\t\t YOU'VE CHOOSEN MUTTON BIRIYANI... ");
                            System.out.print("\t ENTER THE QUANTITY :");
                            int m_quantity=sc.nextInt();
                            int MUTTON_price=380;
                            double B_M_tot_price=m_quantity*MUTTON_price;
                            System.out.println("\t TOTAL BILL : "+m_quantity+" * "+MUTTON_price+" => "+B_M_tot_price);
                            System.out.println("\t\t REDIRECTING TO PAYMENT GATEWAY ...");
                            Thread.sleep(1000);
                            System.out.println("\t SELECT THE PAYMENT GATEWAY : \n\t 1.GPAY \n\t2.PHONEPAY ");
                            System.out.print("\t\t ENTER YOUR CHOICE :");
                            int gateway=sc.nextInt();
                            switch (gateway)
                            {
                                case 1:
                                {
                                    // USING GPAY
                                    System.out.println("\tYOU'VE CHOSEN THE GPAY ..");
                                    System.out.print("\tENTER THE TOTAL BILL : ");
                                    double user_bill_amt=sc.nextDouble();
                                    if(user_bill_amt==B_M_tot_price) // AMOUNT VALIDATION
                                    {
                                        int opt=(int)(Math.random()*99999+99999);
                                        System.out.println("\t\t"+opt);
                                        System.out.println("\t\tOTP GENERATED ... ");
                                        Thread.sleep(2000); 
                                        System.out.print("\t\tENTER THE OTP VALUE : ");
                                        int gene_otp=sc.nextInt();
                                        if(opt==gene_otp)  // OTP VALIDATION
                                        {
                                            System.out.println("\t\tVALID OTP !!!");
                                            System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                        }
                                        else{
                                            System.out.println("\t\tINVALID OTP !?");
                                            System.out.println("\t\tORDER FAILED !!!");
                                        }
                                        System.out.println();
                                        Thread.sleep(1000); 
                                    }
                                    break;
                                }
                                case 2:
                                // USING PHONEPAY
                                System.out.println("\tYOU'VE CHOSEN THE PHONEPAY ..");
                                System.out.print("\tENTER THE TOTAL BILL : ");
                                double user_bill_amt=sc.nextDouble();
                                if(user_bill_amt==B_M_tot_price) // PRICE VALIDATION
                                {
                                    int opt=(int)(Math.random()*99999+99999);
                                    System.out.println("\t\t"+opt);
                                    System.out.println("\t\tOTP GENERATED ... ");
                                    Thread.sleep(2000); 
                                    System.out.print("\t\tENTER THE OTP VALUE : ");
                                    int gene_otp=sc.nextInt();
                                    if(opt==gene_otp) // OTP VALIDATION
                                    {
                                        System.out.println("\t\tVALID OTP !!!");
                                        System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                    }
                                    else{
                                        System.out.println("\t\tINVALID OTP !?");
                                        System.out.println("\t\tORDER FAILED !!!");
                                    }
                                    System.out.println();
                                    Thread.sleep(1000);
                                    break; 
                                }                           
                                default:
                                 System.out.println("\tINVALID PAYMENT CHOOSEN !!!");
                                    break;
                            }
                            break;
                        case 2:
                            // CHICKEN BIRIYANI
                            System.out.println("\t\t YOU'VE CHOOSEN CHICKEN BIRIYANI... ");
                            System.out.print("\t\t ENTER THE QUANTITY :");
                            int C_quantity=sc.nextInt();
                            int CHICKEN_price=240;
                            double B_C_tot_price=C_quantity*CHICKEN_price;
                            System.out.println("\t TOTAL BILL : "+C_quantity+" * "+CHICKEN_price+" => "+B_C_tot_price);
                            System.out.println("\t\t REDIRECTING TO PAYMENT GATEWAY ...");
                            Thread.sleep(1000);
                            System.out.println("\t SELECT THE PAYMENT GATEWAY : \n\t 1.GPAY \n\t2.PHONEPAY ");
                            int c_gateway=sc.nextInt();
                            switch (c_gateway)
                            {
                                case 1:
                                {   // USING GPAY
                                    System.out.println("\tYOU'VE CHOSEN THE GPAY ..");
                                    System.out.print("\tENTER THE TOTAL BILL : ");
                                    double user_bill_amt=sc.nextDouble();
                                    if(user_bill_amt==B_C_tot_price)
                                    {
                                        int opt=(int)(Math.random()*99999+99999);
                                        System.out.println("\t\t"+opt);
                                        System.out.println("\t\tOTP GENERATED ... ");
                                        Thread.sleep(2000); 
                                        System.out.print("\t\tENTER THE OTP VALUE : ");
                                        int gene_otp=sc.nextInt();
                                        if(opt==gene_otp)
                                        {
                                            System.out.println("\t\tVALID OTP !!!");
                                            System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                        }
                                        else{
                                            System.out.println("\t\tINVALID OTP !?");
                                            System.out.println("\t\tORDER FAILED !!!");
                                        }
                                        System.out.println();
                                        Thread.sleep(1000); 
                                    }
                                    break;
                                }
                                case 2:
                                // USING PHONE PAY
                                System.out.println("\tYOU'VE CHOSEN THE PHONEPAY ..");
                                System.out.print("\tENTER THE TOTAL BILL : ");
                                double user_bill_amt=sc.nextDouble();
                                if(user_bill_amt==B_C_tot_price)
                                {
                                    int opt=(int)(Math.random()*99999+99999);
                                    System.out.println("\t\t"+opt);
                                    System.out.println("\t\tOTP GENERATED ... ");
                                    Thread.sleep(2000); 
                                    System.out.print("\t\tENTER THE OTP VALUE : ");
                                    int gene_otp=sc.nextInt();
                                    if(opt==gene_otp)
                                    {
                                        System.out.println("\t\tVALID OTP !!!");
                                        System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                    }
                                    else{
                                        System.out.println("\t\tINVALID OTP !?");
                                        System.out.println("\t\tORDER FAILED !!!");
                                    }
                                    System.out.println();
                                    Thread.sleep(1000);
                                    break; 
                                }                           
                                default:
                                 System.out.println("\tINVALID PAYMENT CHOOSEN !!!");
                                    break;
                            }
                            
                            break;  
                        case 3:
                            // GHEE RICE 
                            System.out.println("\t YOU'VE CHOOSEN GHEE RICE... ");
                            System.out.print("\t ENTER THE QUANTITY :");
                            int G_quantity=sc.nextInt();
                            int GHEE_price=200;
                            double B_G_tot_price=G_quantity*GHEE_price;
                            System.out.println("\t TOTAL BILL : "+G_quantity+" * "+GHEE_price+" => "+B_G_tot_price);
                            System.out.println("\t REDIRECTING TO PAYMENT GATEWAY ...");
                            Thread.sleep(1000);
                            System.out.println("\t SELECT THE PAYMENT GATEWAY : \n\t 1.GPAY \n\t2.PHONEPAY ");
                            int g_gateway=sc.nextInt();
                            switch (g_gateway)
                            {
                                case 1:
                                {   //USING GPAY
                                    System.out.println("\tYOU'VE CHOSEN THE GPAY ..");
                                    System.out.print("\tENTER THE TOTAL BILL : ");
                                    double user_bill_amt=sc.nextDouble();
                                    if(user_bill_amt==B_G_tot_price) // PRICE VALIDATION
                                    {
                                        int opt=(int)(Math.random()*99999+99999);
                                        System.out.println("\t\t"+opt);
                                        System.out.println("\t\tOTP GENERATED ... ");
                                        Thread.sleep(2000); 
                                        System.out.print("\t\tENTER THE OTP VALUE : ");
                                        int gene_otp=sc.nextInt();
                                        if(opt==gene_otp) // OTP VALIDATION
                                        {
                                            System.out.println("\t\tVALID OTP !!!");
                                            System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                        }
                                        else{
                                            System.out.println("\t\tINVALID OTP !?");
                                            System.out.println("\t\tORDER FAILED !!!");
                                        }
                                        System.out.println();
                                        Thread.sleep(1000); 
                                    }
                                    break;
                                }
                                case 2:
                                // USING PHONE PAY
                                System.out.println("\tYOU'VE CHOSEN THE PHONEPAY ..");
                                System.out.print("\tENTER THE TOTAL BILL : ");
                                double user_bill_amt=sc.nextDouble();
                                if(user_bill_amt==B_G_tot_price) // RICE VALIDATION 
                                {
                                    int opt=(int)(Math.random()*99999+99999);
                                    System.out.println("\t\t"+opt);
                                    System.out.println("\t\tOTP GENERATED ... ");
                                    Thread.sleep(2000); 
                                    System.out.print("\t\tENTER THE OTP VALUE : ");
                                    int gene_otp=sc.nextInt();
                                    if(opt==gene_otp) // OTP VALIDATION 
                                    {
                                        System.out.println("\t\tVALID OTP !!!");
                                        System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                    }
                                    else{
                                        System.out.println("\t\tINVALID OTP !?");
                                        System.out.println("\t\tORDER FAILED !!!");
                                    }
                                    System.out.println();
                                    Thread.sleep(1000);
                                    break; 
                                }                           
                                default:
                                 System.out.println("\tINVALID PAYMENT CHOOSEN !!!");
                                    break;
                            }
                            
                            break;
                        case 4:
                            // VEG BIRIYANI
                            System.out.println("\t YOU'VE CHOOSEN VEG BIRIYANI... ");
                            System.out.print("\t ENTER THE QUANTITY :");
                            int V_quantity=sc.nextInt();
                            int VEG_price=380;
                            double B_V_tot_price=V_quantity*VEG_price;
                            System.out.println("\t TOTAL BILL : "+V_quantity+" * "+VEG_price+" => "+B_V_tot_price);
                            System.out.println("\t REDIRECTING TO PAYMENT GATEWAY ...");
                            Thread.sleep(1000);
                            System.out.println("\t SELECT THE PAYMENT GATEWAY :\n\t 1.GPAY \n\t2.PHONEPAY ");
                            int V_gateway=sc.nextInt();
                            switch (V_gateway)
                            {
                                case 1:
                                {   // USING GPAY
                                    System.out.println("\tYOU'VE CHOSEN THE GPAY ..");
                                    System.out.print("\tENTER THE TOTAL BILL : ");
                                    double user_bill_amt=sc.nextDouble();
                                    if(user_bill_amt==B_V_tot_price)
                                    {
                                        int opt=(int)(Math.random()*99999+99999);
                                        System.out.println("\t\t"+opt);
                                        System.out.println("\t\tOTP GENERATED ... ");
                                        Thread.sleep(2000); 
                                        System.out.print("\t\tENTER THE OTP VALUE : ");
                                        int gene_otp=sc.nextInt();
                                        if(opt==gene_otp) // OTP VALIDATION
                                        {
                                            System.out.println("\t\tVALID OTP !!!");
                                            System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                        }
                                        else{
                                            System.out.println("\t\tINVALID OTP !?");
                                            System.out.println("\t\tORDER FAILED !!!");
                                        }
                                        System.out.println();
                                        Thread.sleep(1000); 
                                    }
                                    break;
                                }
                                case 2:
                                // USING PHONE PAY
                                System.out.println("\tYOU'VE CHOSEN THE PHONEPAY ..");
                                System.out.print("\tENTER THE TOTAL BILL : ");
                                double user_bill_amt=sc.nextDouble();
                                if(user_bill_amt==B_V_tot_price)
                                {
                                    int opt=(int)(Math.random()*99999+99999);
                                    System.out.println("\t\t"+opt);
                                    System.out.println("\t\tOTP GENERATED ... ");
                                    Thread.sleep(2000); 
                                    System.out.print("\t\tENTER THE OTP VALUE : ");
                                    int gene_otp=sc.nextInt();
                                    if(opt==gene_otp) // OTP VALIDATION
                                    {
                                        System.out.println("\t\tVALID OTP !!!");
                                        System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                    }
                                    else{
                                        System.out.println("\t\tINVALID OTP !?");
                                        System.out.println("\t\tORDER FAILED !!!");
                                    }
                                    System.out.println();
                                    Thread.sleep(1000);
                                    break; 
                                }                           
                                default:
                                // INVALID PAYMENT MODE
                                 System.out.println("\tINVALID PAYMENT CHOOSEN !!!");
                                    break;
                            }
                            
                            break;                    
                        default:
                          System.out.print("\t YOU'VE ENTERED THE WRONG INPUT ... ENTER THE VALID INPUT  :");
                            break;
                    }
                
                break;
                case 2:
                    // A2B HOTEL
                     System.out.println("\t\t GREETINGS FROM A2B HOTEL  !!!");
                     System.out.println("-----------------------------------------------------------");
                     System.out.println("\t1.IDLI  \n\t2. SAMBAR  \n\t3.PONGAL \n\t4.VEG-BIRIYANI ");
                     System.out.print("\t\t ENTER YOUR CHOICE :");
                     int A2Ba_c=sc.nextInt();
                     switch (A2Ba_c) {
                        case 1:
                            // MUTTON BIRIYANI
                            System.out.println("\t YOU'VE CHOOSEN IDLI... ");
                            System.out.print("\t ENTER THE QUANTITY :");
                            int A2Bm_quantity=sc.nextInt();
                            int A2BMUTTON_price=80;
                            double A2B_M_tot_price=A2Bm_quantity * A2BMUTTON_price;
                            System.out.println("\t TOTAL BILL : "+A2Bm_quantity+" * "+A2BMUTTON_price+" => "+A2B_M_tot_price);
                            System.out.println("\t REDIRECTING TO PAYMENT GATEWAY ...");
                            Thread.sleep(1000);
                            System.out.println("\t SELECT THE PAYMENT GATEWAY : \n\t 1.GPAY \n\t2.PHONEPAY ");
                            int A2Bgateway=sc.nextInt();
                            switch (A2Bgateway)
                            {
                                case 1:
                                {
                                    // USING GPAY
                                    System.out.println("\tYOU'VE CHOSEN THE GPAY ..");
                                    System.out.print("\tENTER THE TOTAL BILL : ");
                                    double A2Buser_bill_amt=sc.nextDouble();
                                    if(A2Buser_bill_amt==A2B_M_tot_price) // AMOUNT VALIDATION
                                    {
                                        int opt=(int)(Math.random()*99999+99999);
                                        System.out.println("\t\t"+opt);
                                        System.out.println("\t\tOTP GENERATED ... ");
                                        Thread.sleep(2000); 
                                        System.out.print("\t\tENTER THE OTP VALUE : ");
                                        int gene_otp=sc.nextInt();
                                        if(opt==gene_otp)  // OTP VALIDATION
                                        {
                                            System.out.println("\t\tVALID OTP !!!");
                                            System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                        }
                                        else{
                                            System.out.println("\t\tINVALID OTP !?");
                                            System.out.println("\t\tORDER FAILED !!!");
                                        }
                                        System.out.println();
                                        Thread.sleep(1000); 
                                    }
                                    break;
                                }
                                case 2:
                                // USING PHONEPAY
                                System.out.println("\t YOU'VE CHOSEN THE PHONEPAY ..");
                                System.out.print("\tENTER THE TOTAL BILL : ");
                                double A2Buser_bill_amt=sc.nextDouble();
                                if(A2Buser_bill_amt==A2B_M_tot_price) // PRICE VALIDATION
                                {
                                    int opt=(int)(Math.random()*99999+99999);
                                    System.out.println("\t\t"+opt);
                                    System.out.println("\t\tOTP GENERATED ... ");
                                    Thread.sleep(2000); 
                                    System.out.print("\t\tENTER THE OTP VALUE : ");
                                    int gene_otp=sc.nextInt();
                                    if(opt==gene_otp) // OTP VALIDATION
                                    {
                                        System.out.println("\t\tVALID OTP !!!");
                                        System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                    }
                                    else{
                                        System.out.println("\t\tINVALID OTP !?");
                                        System.out.println("\t\tORDER FAILED !!!");
                                    }
                                    System.out.println();
                                    Thread.sleep(1000);
                                    break; 
                                }                           
                                default:
                                 System.out.println("\tINVALID PAYMENT CHOOSEN !!!");
                                    break;
                            }
                            break;
                        case 2:
                            // CHICKEN BIRIYANI
                            System.out.println("\t YOU'VE CHOOSEN SAMBAR... ");
                            System.out.print("\t ENTER THE QUANTITY :");
                            int A2BC_quantity=sc.nextInt();
                            int A2BCHICKEN_price=140;
                            double A2B_C_tot_price=A2BC_quantity * A2BCHICKEN_price;
                            System.out.println("\t TOTAL BILL : "+A2BC_quantity+" * "+A2BCHICKEN_price+" => "+A2B_C_tot_price);
                            System.out.println("\t REDIRECTING TO PAYMENT GATEWAY ...");
                            Thread.sleep(1000);
                            System.out.print("\t SELECT THE PAYMENT GATEWAY : \n\t 1.GPAY \n\t2.PHONEPAY ");
                            int A2Bc_gateway=sc.nextInt();
                            switch (A2Bc_gateway)
                            {
                                case 1:
                                {   // USING GPAY
                                    System.out.println("\tYOU'VE CHOSEN THE GPAY ..");
                                    System.out.print("\tENTER THE TOTAL BILL : ");
                                    double A2Buser_bill_amt=sc.nextDouble();
                                    if(A2Buser_bill_amt==A2B_C_tot_price)
                                    {
                                        int opt=(int)(Math.random()*99999+99999);
                                        System.out.println("\t\t"+opt);
                                        System.out.println("\t\tOTP GENERATED ... ");
                                        Thread.sleep(2000); 
                                        System.out.print("\t\tENTER THE OTP VALUE : ");
                                        int gene_otp=sc.nextInt();
                                        if(opt==gene_otp)
                                        {
                                            System.out.println("\t\tVALID OTP !!!");
                                            System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                        }
                                        else{
                                            System.out.println("\t\tINVALID OTP !?");
                                            System.out.println("\t\tORDER FAILED !!!");
                                        }
                                        System.out.println();
                                        Thread.sleep(1000); 
                                    }
                                    break;
                                }
                                case 2:
                                // USING PHONE PAY
                                System.out.println("\tYOU'VE CHOSEN THE PHONEPAY ..");
                                System.out.print("\tENTER THE TOTAL BILL : ");
                                double A2Buser_bill_amt=sc.nextDouble();
                                if(A2Buser_bill_amt==A2B_C_tot_price)
                                {
                                    int opt=(int)(Math.random()*99999+99999);
                                    System.out.println("\t\t"+opt);
                                    System.out.println("\t\tOTP GENERATED ... ");
                                    Thread.sleep(2000); 
                                    System.out.print("\t\tENTER THE OTP VALUE : ");
                                    int gene_otp=sc.nextInt();
                                    if(opt==gene_otp)
                                    {
                                        System.out.println("\t\tVALID OTP !!!");
                                        System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                    }
                                    else{
                                        System.out.println("\t\tINVALID OTP !?");
                                        System.out.println("\t\tORDER FAILED !!!");
                                    }
                                    System.out.println();
                                    Thread.sleep(1000);
                                    break; 
                                }                           
                                default:
                                 System.out.println("\tINVALID PAYMENT CHOOSEN !!!");
                                    break;
                            }
                            
                            break;  
                        case 3:
                            // GHEE RICE 
                            System.out.println("\t YOU'VE CHOOSEN PONGAL... ");
                            System.out.print("\t ENTER THE QUANTITY :");
                            int A2BG_quantity=sc.nextInt();
                            int A2BGHEE_price=200;
                            double A2B_G_tot_price=A2BG_quantity * A2BGHEE_price;
                            System.out.println("\t TOTAL BILL : "+A2BG_quantity+" * "+A2BGHEE_price+" => "+A2B_G_tot_price);
                            System.out.println("\t REDIRECTING TO PAYMENT GATEWAY ...");
                            Thread.sleep(1000);
                            System.out.print("\t SELECT THE PAYMENT GATEWAY : \n\t 1.GPAY \n\t2.PHONEPAY ");
                            int A2Bg_gateway=sc.nextInt();
                            switch (A2Bg_gateway)
                            {
                                case 1:
                                {   //USING GPAY
                                    System.out.println("\tYOU'VE CHOSEN THE GPAY ..");
                                    System.out.print("\tENTER THE TOTAL BILL : ");
                                    double A2Buser_bill_amt=sc.nextDouble();
                                    if(A2Buser_bill_amt==A2B_G_tot_price) // PRICE VALIDATION
                                    {
                                        int opt=(int)(Math.random()*99999+99999);
                                        System.out.println("\t\t"+opt);
                                        System.out.println("\t\tOTP GENERATED ... ");
                                        Thread.sleep(2000); 
                                        System.out.print("\t\tENTER THE OTP VALUE : ");
                                        int gene_otp=sc.nextInt();
                                        if(opt==gene_otp) // OTP VALIDATION
                                        {
                                            System.out.println("\t\tVALID OTP !!!");
                                            System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                        }
                                        else{
                                            System.out.println("\t\tINVALID OTP !?");
                                            System.out.println("\t\tORDER FAILED !!!");
                                        }
                                        System.out.println();
                                        Thread.sleep(1000); 
                                    }
                                    break;
                                }
                                case 2:
                                // USING PHONE PAY
                                System.out.println("\tYOU'VE CHOSEN THE PHONEPAY ..");
                                System.out.print("\tENTER THE TOTAL BILL : ");
                                double A2Buser_bill_amt=sc.nextDouble();
                                if(A2Buser_bill_amt==A2B_G_tot_price) // RICE VALIDATION 
                                {
                                    int opt=(int)(Math.random()*99999+99999);
                                    System.out.println("\t\t"+opt);
                                    System.out.println("\t\tOTP GENERATED ... ");
                                    Thread.sleep(2000); 
                                    System.out.print("\t\tENTER THE OTP VALUE : ");
                                    int gene_otp=sc.nextInt();
                                    if(opt==gene_otp) // OTP VALIDATION 
                                    {
                                        System.out.println("\t\tVALID OTP !!!");
                                        System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                    }
                                    else{
                                        System.out.println("\t\tINVALID OTP !?");
                                        System.out.println("\t\tORDER FAILED !!!");
                                    }
                                    System.out.println();
                                    Thread.sleep(1000);
                                    break; 
                                }                           
                                default:
                                 System.out.println("\tINVALID PAYMENT CHOOSEN !!!");
                                    break;
                            }
                            
                            break;
                        case 4:
                            // VEG BIRIYANI
                            System.out.println("\t YOU'VE CHOOSEN VEG BIRIYANI... ");
                            System.out.print("\t ENTER THE QUANTITY :");
                            int A2BV_quantity=sc.nextInt();
                            int A2BVEG_price=380;
                            double A2B_V_tot_price=A2BV_quantity * A2BVEG_price;
                            System.out.println("\t TOTAL BILL : "+A2BV_quantity+" * "+A2BVEG_price+" => "+A2B_V_tot_price);
                            System.out.println("\t REDIRECTING TO PAYMENT GATEWAY ...");
                            Thread.sleep(1000);
                            System.out.print("\t SELECT THE PAYMENT GATEWAY : \n\t 1.GPAY \n\t2.PHONEPAY ");
                            int A2BV_gateway=sc.nextInt();
                            switch (A2BV_gateway)
                            {
                                case 1:
                                {   // USING GPAY
                                    System.out.println("\tYOU'VE CHOSEN THE GPAY ..");
                                    System.out.print("\tENTER THE TOTAL BILL : ");
                                    double A2Buser_bill_amt=sc.nextDouble();
                                    if(A2Buser_bill_amt==A2B_V_tot_price)
                                    {
                                        int opt=(int)(Math.random()*99999+99999);
                                        System.out.println("\t\t"+opt);
                                        System.out.println("\t\tOTP GENERATED ... ");
                                        Thread.sleep(2000); 
                                        System.out.print("\t\tENTER THE OTP VALUE : ");
                                        int gene_otp=sc.nextInt();
                                        if(opt==gene_otp) // OTP VALIDATION
                                        {
                                            System.out.println("\t\tVALID OTP !!!");
                                            System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                        }
                                        else{
                                            System.out.println("\t\tINVALID OTP !?");
                                            System.out.println("\t\tORDER FAILED !!!");
                                        }
                                        System.out.println();
                                        Thread.sleep(1000); 
                                    }
                                    break;
                                }
                                case 2:
                                // USING PHONE PAY
                                System.out.println("\tYOU'VE CHOSEN THE PHONEPAY ..");
                                System.out.print("\tENTER THE TOTAL BILL : ");
                                double A2Buser_bill_amt=sc.nextDouble();
                                if(A2Buser_bill_amt==A2B_V_tot_price)
                                {
                                    int opt=(int)(Math.random()*99999+99999);
                                    System.out.println("\t\t"+opt);
                                    System.out.println("\t\tOTP GENERATED ... ");
                                    Thread.sleep(2000); 
                                    System.out.print("\t\tENTER THE OTP VALUE : ");
                                    int gene_otp=sc.nextInt();
                                    if(opt==gene_otp) // OTP VALIDATION
                                    {
                                        System.out.println("\t\tVALID OTP !!!");
                                        System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                    }
                                    else{
                                        System.out.println("\t\tINVALID OTP !?");
                                        System.out.println("\t\tORDER FAILED !!!");
                                    }
                                    System.out.println();
                                    Thread.sleep(1000);
                                    break; 
                                }                           
                                default:
                                // INVALID PAYMENT MODE
                                 System.out.println("\tINVALID PAYMENT CHOOSEN !!!");
                                    break;
                            }
                            
                            break;                    
                        default:
                          System.out.print("\t YOU'VE ENTERED THE WRONG INPUT ... ENTER THE VALID INPUT  :");
                            break;
                    }
                
                break;
                case 3:
                    // AMMA CANTEEN 
                     System.out.println("\t\t GREETINGS FROM AMMA CANTEEN  !!!");
                     System.out.println("-----------------------------------------------------------");
                     System.out.println("\t1.SAMBAR RICE  \n\t2.CURD RICE \n\t3.CHAPATHI WITH SUBJI  \n\t4.VEG-BIRIYANI ");
                     System.out.print("\t\t ENTER YOUR CHOICE :");
                     int A_c=sc.nextInt();
                    switch (A_c) {
                        case 1:
                            // MUTTON BIRIYANI
                            System.out.println("\t YOU'VE CHOOSEN SAMBAR RICE... ");
                            System.out.print("\t ENTER THE QUANTITY :");
                            int m_quantity=sc.nextInt();
                            int MUTTON_price=380;
                            double A_M_tot_price=m_quantity*MUTTON_price;
                            System.out.println("\t TOTAL BILL : "+m_quantity+" * "+MUTTON_price+" => "+A_M_tot_price);
                            System.out.println("\t REDIRECTING TO PAYMENT GATEWAY ...");
                            Thread.sleep(1000);
                            System.out.print("\t SELECT THE PAYMENT GATEWAY : \n\t 1.GPAY \n\t2.PHONEPAY ");
                            int gateway=sc.nextInt();
                            switch (gateway)
                            {
                                case 1:
                                {
                                    // USING GPAY
                                    System.out.println("\tYOU'VE CHOSEN THE GPAY ..");
                                    System.out.print("\tENTER THE TOTAL BILL : ");
                                    double user_bill_amt=sc.nextDouble();
                                    if(user_bill_amt==A_M_tot_price) // AMOUNT VALIDATION
                                    {
                                        int opt=(int)(Math.random()*99999+99999);
                                        System.out.println("\t\t"+opt);
                                        System.out.println("\t\tOTP GENERATED ... ");
                                        Thread.sleep(2000); 
                                        System.out.print("\t\tENTER THE OTP VALUE : ");
                                        int gene_otp=sc.nextInt();
                                        if(opt==gene_otp)  // OTP VALIDATION
                                        {
                                            System.out.println("\t\tVALID OTP !!!");
                                            System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                        }
                                        else{
                                            System.out.println("\t\tINVALID OTP !?");
                                            System.out.println("\t\tORDER FAILED !!!");
                                        }
                                        System.out.println();
                                        Thread.sleep(1000); 
                                    }
                                    break;
                                }
                                case 2:
                                // USING PHONEPAY
                                System.out.println("\tYOU'VE CHOSEN THE PHONEPAY ..");
                                System.out.print("\tENTER THE TOTAL BILL : ");
                                double user_bill_amt=sc.nextDouble();
                                if(user_bill_amt==A_M_tot_price) // PRICE VALIDATION
                                {
                                    int opt=(int)(Math.random()*99999+99999);
                                    System.out.println("\t\t"+opt);
                                    System.out.println("\t\tOTP GENERATED ... ");
                                    Thread.sleep(2000); 
                                    System.out.print("\t\tENTER THE OTP VALUE : ");
                                    int gene_otp=sc.nextInt();
                                    if(opt==gene_otp) // OTP VALIDATION
                                    {
                                        System.out.println("\t\tVALID OTP !!!");
                                        System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                    }
                                    else{
                                        System.out.println("\t\tINVALID OTP !?");
                                        System.out.println("\t\tORDER FAILED !!!");
                                    }
                                    System.out.println();
                                    Thread.sleep(1000);
                                    break; 
                                }                           
                                default:
                                 System.out.println("\tINVALID PAYMENT CHOOSEN !!!");
                                    break;
                            }
                            break;
                        case 2:
                            // CHICKEN BIRIYANI
                            System.out.println("\t YOU'VE CHOOSEN CURD RICE... ");
                            System.out.print("\t ENTER THE QUANTITY :");
                            int C_quantity=sc.nextInt();
                            int CHICKEN_price=240;
                            double A_C_tot_price=C_quantity * CHICKEN_price;
                            System.out.println("\t TOTAL BILL : "+C_quantity+" * "+CHICKEN_price+" => "+A_C_tot_price);
                            System.out.println("\t REDIRECTING TO PAYMENT GATEWAY ...");
                            Thread.sleep(1000);
                            System.out.print("\t SELECT THE PAYMENT GATEWAY : \n\t 1.GPAY \n\t2.PHONEPAY ");
                            int c_gateway=sc.nextInt();
                            switch (c_gateway)
                            {
                                case 1:
                                {   // USING GPAY
                                    System.out.println("\tYOU'VE CHOSEN THE GPAY ..");
                                    System.out.print("\tENTER THE TOTAL BILL : ");
                                    double user_bill_amt=sc.nextDouble();
                                    if(user_bill_amt==A_C_tot_price)
                                    {
                                        int opt=(int)(Math.random()*99999+99999);
                                        System.out.println("\t\t"+opt);
                                        System.out.println("\t\tOTP GENERATED ... ");
                                        Thread.sleep(2000); 
                                        System.out.print("\t\tENTER THE OTP VALUE : ");
                                        int gene_otp=sc.nextInt();
                                        if(opt==gene_otp)
                                        {
                                            System.out.println("\t\tVALID OTP !!!");
                                            System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                        }
                                        else{
                                            System.out.println("\t\tINVALID OTP !?");
                                            System.out.println("\t\tORDER FAILED !!!");
                                        }
                                        System.out.println();
                                        Thread.sleep(1000); 
                                    }
                                    break;
                                }
                                case 2:
                                // USING PHONE PAY
                                System.out.println("\tYOU'VE CHOSEN THE PHONEPAY ..");
                                System.out.print("\tENTER THE TOTAL BILL : ");
                                double user_bill_amt=sc.nextDouble();
                                if(user_bill_amt==A_C_tot_price)
                                {
                                    int opt=(int)(Math.random()*99999+99999);
                                    System.out.println("\t\t"+opt);
                                    System.out.println("\t\tOTP GENERATED ... ");
                                    Thread.sleep(2000); 
                                    System.out.print("\t\tENTER THE OTP VALUE : ");
                                    int gene_otp=sc.nextInt();
                                    if(opt==gene_otp)
                                    {
                                        System.out.println("\t\tVALID OTP !!!");
                                        System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                    }
                                    else{
                                        System.out.println("\t\tINVALID OTP !?");
                                        System.out.println("\t\tORDER FAILED !!!");
                                    }
                                    System.out.println();
                                    Thread.sleep(1000);
                                    break; 
                                }                           
                                default:
                                 System.out.println("\tINVALID PAYMENT CHOOSEN !!!");
                                    break;
                            }
                            
                            break;  
                        case 3:
                            // GHEE RICE 
                            System.out.println("\t YOU'VE CHOOSEN CHAPATHI WITH SUBJI... ");
                            System.out.print("\t ENTER THE QUANTITY :");
                            int G_quantity=sc.nextInt();
                            int GHEE_price=200;
                            double A_G_tot_price=G_quantity * GHEE_price;
                            System.out.println("\t TOTAL BILL : "+G_quantity+" * "+GHEE_price+" => "+A_G_tot_price);
                            System.out.println("\t REDIRECTING TO PAYMENT GATEWAY ...");
                            Thread.sleep(1000);
                            System.out.print("\t SELECT THE PAYMENT GATEWAY : \n\t 1.GPAY \n\t2.PHONEPAY ");
                            int g_gateway=sc.nextInt();
                            switch (g_gateway)
                            {
                                case 1:
                                {   //USING GPAY
                                    System.out.println("\tYOU'VE CHOSEN THE GPAY ..");
                                    System.out.print("\tENTER THE TOTAL BILL : ");
                                    double user_bill_amt=sc.nextDouble();
                                    if(user_bill_amt==A_G_tot_price) // PRICE VALIDATION
                                    {
                                        int opt=(int)(Math.random()*99999+99999);
                                        System.out.println("\t\t"+opt);
                                        System.out.println("\t\tOTP GENERATED ... ");
                                        Thread.sleep(2000); 
                                        System.out.print("\t\tENTER THE OTP VALUE : ");
                                        int gene_otp=sc.nextInt();
                                        if(opt==gene_otp) // OTP VALIDATION
                                        {
                                            System.out.println("\t\tVALID OTP !!!");
                                            System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                        }
                                        else{
                                            System.out.println("\t\tINVALID OTP !?");
                                            System.out.println("\t\tORDER FAILED !!!");
                                        }
                                        System.out.println();
                                        Thread.sleep(1000); 
                                    }
                                    break;
                                }
                                case 2:
                                // USING PHONE PAY
                                System.out.println("\tYOU'VE CHOSEN THE PHONEPAY ..");
                                System.out.print("\tENTER THE TOTAL BILL : ");
                                double user_bill_amt=sc.nextDouble();
                                if(user_bill_amt==A_G_tot_price) // RICE VALIDATION 
                                {
                                    int opt=(int)(Math.random()*99999+99999);
                                    System.out.println("\t\t"+opt);
                                    System.out.println("\t\tOTP GENERATED ... ");
                                    Thread.sleep(2000); 
                                    System.out.print("\t\tENTER THE OTP VALUE : ");
                                    int gene_otp=sc.nextInt();
                                    if(opt==gene_otp) // OTP VALIDATION 
                                    {
                                        System.out.println("\t\tVALID OTP !!!");
                                        System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                    }
                                    else{
                                        System.out.println("\t\tINVALID OTP !?");
                                        System.out.println("\t\tORDER FAILED !!!");
                                    }
                                    System.out.println();
                                    Thread.sleep(1000);
                                    break; 
                                }                           
                                default:
                                 System.out.println("\tINVALID PAYMENT CHOOSEN !!!");
                                    break;
                            }
                            
                            break;
                        case 4:
                            // VEG BIRIYANI
                            System.out.println("\t YOU'VE CHOOSEN VEG BIRIYANI... ");
                            System.out.print("\t ENTER THE QUANTITY :");
                            int V_quantity=sc.nextInt();
                            int VEG_price=380;
                            double A_V_tot_price=V_quantity*VEG_price;
                            System.out.println("\t TOTAL BILL : "+V_quantity+" * "+VEG_price+" => "+A_V_tot_price);
                            System.out.println("\t REDIRECTING TO PAYMENT GATEWAY ...");
                            Thread.sleep(1000);
                            System.out.print("\t SELECT THE PAYMENT GATEWAY : \n\t 1.GPAY \n\t2.PHONEPAY ");
                            int V_gateway=sc.nextInt();
                            switch (V_gateway)
                            {
                                case 1:
                                {   // USING GPAY
                                    System.out.println("\tYOU'VE CHOSEN THE GPAY ..");
                                    System.out.print("\tENTER THE TOTAL BILL : ");
                                    double user_bill_amt=sc.nextDouble();
                                    if(user_bill_amt==A_V_tot_price)
                                    {
                                        int opt=(int)(Math.random()*99999+99999);
                                        System.out.println("\t\t"+opt);
                                        System.out.println("\t\tOTP GENERATED ... ");
                                        Thread.sleep(2000); 
                                        System.out.print("\t\tENTER THE OTP VALUE : ");
                                        int gene_otp=sc.nextInt();
                                        if(opt==gene_otp) // OTP VALIDATION
                                        {
                                            System.out.println("\t\tVALID OTP !!!");
                                            System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                        }
                                        else{
                                            System.out.println("\t\tINVALID OTP !?");
                                            System.out.println("\t\tORDER FAILED !!!");
                                        }
                                        System.out.println();
                                        Thread.sleep(1000); 
                                    }
                                    break;
                                }
                                case 2:
                                // USING PHONE PAY
                                System.out.println("\tYOU'VE CHOSEN THE PHONEPAY ..");
                                System.out.print("\tENTER THE TOTAL BILL : ");
                                double user_bill_amt=sc.nextDouble();
                                if(user_bill_amt==A_V_tot_price)
                                {
                                    int opt=(int)(Math.random()*99999+99999);
                                    System.out.println("\t\t"+opt);
                                    System.out.println("\t\tOTP GENERATED ... ");
                                    Thread.sleep(2000); 
                                    System.out.print("\t\tENTER THE OTP VALUE : ");
                                    int gene_otp=sc.nextInt();
                                    if(opt==gene_otp) // OTP VALIDATION
                                    {
                                        System.out.println("\t\tVALID OTP !!!");
                                        System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                    }
                                    else{
                                        System.out.println("\t\tINVALID OTP !?");
                                        System.out.println("\t\tORDER FAILED !!!");
                                    }
                                    System.out.println();
                                    Thread.sleep(1000);
                                    break; 
                                }                           
                                default:
                                // INVALID PAYMENT MODE
                                 System.out.println("\tINVALID PAYMENT CHOOSEN !!!");
                                    break;
                            }
                            
                            break;                    
                        default:
                          System.out.print("\t YOU'VE ENTERED THE WRONG INPUT ... ENTER THE VALID INPUT  :");
                            break;
                    }
                
                break;
                case 4:
                    // SS HYDRABAD HOTEL
                     System.out.println("\t\t GREETINGS FROM SS HYDRABAD HOTEL !!!");
                     System.out.println("-----------------------------------------------------------");
                     System.out.println("\t1.MUTTON BIRIYANI  \n\t2. CHICKEN BIRIYANI \n\t3.HYDERABADI DUM BIRIYANI \n\t4.TANDOORI CHIECKEN ");
                     System.out.print("\t\t ENTER YOUR CHOICE :");
                     int SS_c=sc.nextInt();
                    switch (SS_c) {
                        case 1:
                            // MUTTON BIRIYANI
                            System.out.println("\t YOU'VE CHOOSEN MUTTON BIRIYANI... ");
                            System.out.print("\t ENTER THE QUANTITY :");
                            int m_quantity=sc.nextInt();
                            int MUTTON_price=380;
                            double SS_M_tot_price=m_quantity*MUTTON_price;
                            System.out.println("\t TOTAL BILL : "+m_quantity+" * "+MUTTON_price+" => "+SS_M_tot_price);
                            System.out.println("\t REDIRECTING TO PAYMENT GATEWAY ...");
                            Thread.sleep(1000);
                            System.out.print("\t SELECT THE PAYMENT GATEWAY : \n\t 1.GPAY \n\t2.PHONEPAY  :");
                            int gateway=sc.nextInt();
                            switch (gateway)
                            {
                                case 1:
                                {
                                    // USING GPAY
                                    System.out.println("\tYOU'VE CHOSEN THE GPAY ..");
                                    System.out.print("\tENTER THE TOTAL BILL : ");
                                    double user_bill_amt=sc.nextDouble();
                                    if(user_bill_amt==SS_M_tot_price) // AMOUNT VALIDATION
                                    {
                                        int opt=(int)(Math.random()*99999+99999);
                                        System.out.println("\t\t"+opt);
                                        System.out.println("\t\tOTP GENERATED ... ");
                                        Thread.sleep(2000); 
                                        System.out.print("\t\tENTER THE OTP VALUE : ");
                                        int gene_otp=sc.nextInt();
                                        if(opt==gene_otp)  // OTP VALIDATION
                                        {
                                            System.out.println("\t\tVALID OTP !!!");
                                            System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                        }
                                        else{
                                            System.out.println("\t\tINVALID OTP !?");
                                            System.out.println("\t\tORDER FAILED !!!");
                                        }
                                        System.out.println();
                                        Thread.sleep(1000); 
                                    }
                                    break;
                                }
                                case 2:
                                // USING PHONEPAY
                                System.out.println("\tYOU'VE CHOSEN THE PHONEPAY ..");
                                System.out.print("\tENTER THE TOTAL BILL : ");
                                double user_bill_amt=sc.nextDouble();
                                if(user_bill_amt==SS_M_tot_price) // PRICE VALIDATION
                                {
                                    int opt=(int)(Math.random()*99999+99999);
                                    System.out.println("\t\t"+opt);
                                    System.out.println("\t\tOTP GENERATED ... ");
                                    Thread.sleep(2000); 
                                    System.out.print("\t\tENTER THE OTP VALUE : ");
                                    int gene_otp=sc.nextInt();
                                    if(opt==gene_otp) // OTP VALIDATION
                                    {
                                        System.out.println("\t\tVALID OTP !!!");
                                        System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                    }
                                    else{
                                        System.out.println("\t\tINVALID OTP !?");
                                        System.out.println("\t\tORDER FAILED !!!");
                                    }
                                    System.out.println();
                                    Thread.sleep(1000);
                                    break; 
                                }                           
                                default:
                                 System.out.println("\tINVALID PAYMENT CHOOSEN !!!");
                                    break;
                            }
                            break;
                        case 2:
                            // CHICKEN BIRIYANI
                            System.out.println("\t YOU'VE CHOOSEN CHICKEN BIRIYANI... ");
                            System.out.print("\t ENTER THE QUANTITY :");
                            int C_quantity=sc.nextInt();
                            int CHICKEN_price=240;
                            double SS_C_tot_price=C_quantity*CHICKEN_price;
                            System.out.println("\t TOTAL BILL : "+C_quantity+" * "+CHICKEN_price+" => "+SS_C_tot_price);
                            System.out.println("\t REDIRECTING TO PAYMENT GATEWAY ...");
                            Thread.sleep(1000);
                            System.out.print("\t SELECT THE PAYMENT GATEWAY : \n\t 1.GPAY \n\t2.PHONEPAY ");
                            int c_gateway=sc.nextInt();
                            switch (c_gateway)
                            {
                                case 1:
                                {   // USING GPAY
                                    System.out.println("\tYOU'VE CHOSEN THE GPAY ..");
                                    System.out.print("\tENTER THE TOTAL BILL : ");
                                    double user_bill_amt=sc.nextDouble();
                                    if(user_bill_amt==SS_C_tot_price)
                                    {
                                        int opt=(int)(Math.random()*99999+99999);
                                        System.out.println("\t\t"+opt);
                                        System.out.println("\t\tOTP GENERATED ... ");
                                        Thread.sleep(2000); 
                                        System.out.print("\t\tENTER THE OTP VALUE : ");
                                        int gene_otp=sc.nextInt();
                                        if(opt==gene_otp)
                                        {
                                            System.out.println("\t\tVALID OTP !!!");
                                            System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                        }
                                        else{
                                            System.out.println("\t\tINVALID OTP !?");
                                            System.out.println("\t\tORDER FAILED !!!");
                                        }
                                        System.out.println();
                                        Thread.sleep(1000); 
                                    }
                                    break;
                                }
                                case 2:
                                // USING PHONE PAY
                                System.out.println("\tYOU'VE CHOSEN THE PHONEPAY ..");
                                System.out.print("\tENTER THE TOTAL BILL : ");
                                double user_bill_amt=sc.nextDouble();
                                if(user_bill_amt==SS_C_tot_price)
                                {
                                    int opt=(int)(Math.random()*99999+99999);
                                    System.out.println("\t\t"+opt);
                                    System.out.println("\t\tOTP GENERATED ... ");
                                    Thread.sleep(2000); 
                                    System.out.print("\t\tENTER THE OTP VALUE : ");
                                    int gene_otp=sc.nextInt();
                                    if(opt==gene_otp)
                                    {
                                        System.out.println("\t\tVALID OTP !!!");
                                        System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                    }
                                    else{
                                        System.out.println("\t\tINVALID OTP !?");
                                        System.out.println("\t\tORDER FAILED !!!");
                                    }
                                    System.out.println();
                                    Thread.sleep(1000);
                                    break; 
                                }                           
                                default:
                                 System.out.println("\tINVALID PAYMENT CHOOSEN !!!");
                                    break;
                            }
                            
                            break;  
                        case 3:
                            // GHEE RICE 
                            System.out.println("\t YOU'VE CHOOSEN HYDERABADI DUM BIRIYANI... ");
                            System.out.print("\t ENTER THE QUANTITY :");
                            int G_quantity=sc.nextInt();
                            int GHEE_price=200;
                            double SS_G_tot_price=G_quantity*GHEE_price;
                            System.out.println("\t TOTAL BILL : "+G_quantity+" * "+GHEE_price+" => "+SS_G_tot_price);
                            System.out.println("\t REDIRECTING TO PAYMENT GATEWAY ...");
                            Thread.sleep(1000);
                            System.out.print("\t SELECT THE PAYMENT GATEWAY : \n\t 1.GPAY \n\t2.PHONEPAY ");
                            int g_gateway=sc.nextInt();
                            switch (g_gateway)
                            {
                                case 1:
                                {   //USING GPAY
                                    System.out.println("\tYOU'VE CHOSEN THE GPAY ..");
                                    System.out.print("\tENTER THE TOTAL BILL : ");
                                    double user_bill_amt=sc.nextDouble();
                                    if(user_bill_amt==SS_G_tot_price) // PRICE VALIDATION
                                    {
                                        int opt=(int)(Math.random()*99999+99999);
                                        System.out.println("\t\t"+opt);
                                        System.out.println("\t\tOTP GENERATED ... ");
                                        Thread.sleep(2000); 
                                        System.out.print("\t\tENTER THE OTP VALUE : ");
                                        int gene_otp=sc.nextInt();
                                        if(opt==gene_otp) // OTP VALIDATION
                                        {
                                            System.out.println("\t\tVALID OTP !!!");
                                            System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                        }
                                        else{
                                            System.out.println("\t\tINVALID OTP !?");
                                            System.out.println("\t\tORDER FAILED !!!");
                                        }
                                        System.out.println();
                                        Thread.sleep(1000); 
                                    }
                                    break;
                                }
                                case 2:
                                // USING PHONE PAY
                                System.out.println("\tYOU'VE CHOSEN THE PHONEPAY ..");
                                System.out.print("\tENTER THE TOTAL BILL : ");
                                double user_bill_amt=sc.nextDouble();
                                if(user_bill_amt==SS_G_tot_price) // RICE VALIDATION 
                                {
                                    int opt=(int)(Math.random()*99999+99999);
                                    System.out.println("\t\t"+opt);
                                    System.out.println("\t\tOTP GENERATED ... ");
                                    Thread.sleep(2000); 
                                    System.out.print("\t\tENTER THE OTP VALUE : ");
                                    int gene_otp=sc.nextInt();
                                    if(opt==gene_otp) // OTP VALIDATION 
                                    {
                                        System.out.println("\t\tVALID OTP !!!");
                                        System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                    }
                                    else{
                                        System.out.println("\t\tINVALID OTP !?");
                                        System.out.println("\t\tORDER FAILED !!!");
                                    }
                                    System.out.println();
                                    Thread.sleep(1000);
                                    break; 
                                }                           
                                default:
                                 System.out.println("\tINVALID PAYMENT CHOOSEN !!!");
                                    break;
                            }
                            
                            break;
                        case 4:
                            // VEG BIRIYANI
                            System.out.println("\t YOU'VE CHOOSEN TANDOORI CHICKEN... ");
                            System.out.print("\t ENTER THE QUANTITY :");
                            int V_quantity=sc.nextInt();
                            int VEG_price=380;
                            double SS_V_tot_price=V_quantity*VEG_price;
                            System.out.println("\t TOTAL BILL : "+V_quantity+" * "+VEG_price+" => "+SS_V_tot_price);
                            System.out.println("\t REDIRECTING TO PAYMENT GATEWAY ...");
                            Thread.sleep(1000);
                            System.out.print("\t SELECT THE PAYMENT GATEWAY : \n\t 1.GPAY \n\t 2.PHONEPAY ");
                            int V_gateway=sc.nextInt();
                            switch (V_gateway)
                            {
                                case 1:
                                {   // USING GPAY
                                    System.out.println("\tYOU'VE CHOSEN THE GPAY ..");
                                    System.out.print("\tENTER THE TOTAL BILL : ");
                                    double user_bill_amt=sc.nextDouble();
                                    if(user_bill_amt==SS_V_tot_price)
                                    {
                                        int opt=(int)(Math.random()*99999+99999);
                                        System.out.println("\t\t"+opt);
                                        System.out.println("\t\tOTP GENERATED ... ");
                                        Thread.sleep(2000); 
                                        System.out.print("\t\tENTER THE OTP VALUE : ");
                                        int gene_otp=sc.nextInt();
                                        if(opt==gene_otp) // OTP VALIDATION
                                        {
                                            System.out.println("\t\tVALID OTP !!!");
                                            System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                        }
                                        else{
                                            System.out.println("\t\tINVALID OTP !?");
                                            System.out.println("\t\tORDER FAILED !!!");
                                        }
                                        System.out.println();
                                        Thread.sleep(1000); 
                                    }
                                    break;
                                }
                                case 2:
                                // USING PHONE PAY
                                System.out.println("\tYOU'VE CHOSEN THE PHONEPAY ..");
                                System.out.print("\tENTER THE TOTAL BILL : ");
                                double user_bill_amt=sc.nextDouble();
                                if(user_bill_amt==SS_V_tot_price)
                                {
                                    int opt=(int)(Math.random()*99999+99999);
                                    System.out.println("\t\t"+opt);
                                    System.out.println("\t\tOTP GENERATED ... ");
                                    Thread.sleep(2000); 
                                    System.out.print("\t\tENTER THE OTP VALUE : ");
                                    int gene_otp=sc.nextInt();
                                    if(opt==gene_otp) // OTP VALIDATION
                                    {
                                        System.out.println("\t\tVALID OTP !!!");
                                        System.out.println("\t\tYOUR ORDER HAS BEEN CONFIRMED !!!");

                                    }
                                    else{
                                        System.out.println("\t\tINVALID OTP !?");
                                        System.out.println("\t\tORDER FAILED !!!");
                                    }
                                    System.out.println();
                                    Thread.sleep(1000);
                                    break; 
                                }                           
                                default:
                                // INVALID PAYMENT MODE
                                 System.out.println("\tINVALID PAYMENT CHOOSEN !!!");
                                    break;
                            }
                            
                            break;                    
                        default:
                          System.out.print("\t YOU'VE ENTERED THE WRONG INPUT ... ENTER THE VALID INPUT  :");
                            break;
                    }
                
                break;
        
            default:
        
            System.out.println("\tINVALID INPUT");
                break;
        }
        sc.close();        
    
    
}
}
