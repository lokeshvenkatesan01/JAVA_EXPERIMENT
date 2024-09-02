import java.util.*;
public class weekend {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
      
        while(true){        
        System.out.println(" ENTER THE VALUE 1.SUNDAY\n2.MONDAY \n3.TUESDAY \n4.WEDNESDAY \n5.THURSDAY \n6.FRIDAY \n7.SATURDAY ");
        int choice=sc.nextInt();
        switch (choice) {
                 case 1:
                    System.out.println("\t\t SUNDAY SPECIAL ");
                    System.out.println("\t\t\t l o a d i n g . . . . . . . . ");
                    Thread.sleep(2000);
                    System.out.println("\t KANTHARA MOVIE SONGS... ");
                    break;
                case 2:
                    System.out.println("\t\t MONDAY SPECIAL ");
                    System.out.println("\t\t\t l o a d i n g . . . . . . . . ");
                    Thread.sleep(2000);
                    System.out.println("\t VIKRAM MOVIE SONGS...");
                    break;
                case 3:
                    System.out.println("\t\t TUESDAY SPECIAL ");
                    System.out.println("\t\t\t l o a d i n g . . . . . . . . ");
                    Thread.sleep(2000);
                    System.out.println("\t PISASU MOVIE SONGS...");
                    break;
                case 4:
                    System.out.println("\t\t WEDNESDAY SPECIAL ");
                    System.out.println("\t\t\t l o a d i n g . . . . . . . . ");
                    Thread.sleep(2000);
                    System.out.println("\t THERI MOVIE SONGS... ");
                    break;
                case 5:
                    System.out.println("\t\t THURSDAY SPECIAL ");
                    System.out.println("\t\t\t l o a d i n g . . . . . . . . ");
                    Thread.sleep(2000);
                    System.out.println("\t RAAYAN MOVIE SONGS...");
                    break;
                case 6:
                    System.out.println("\t\t FRIDAY SPECIAL ");
                    System.out.println("\t\t\t l o a d i n g . . . . . . . . ");
                    Thread.sleep(2000);
                    System.out.println("\t THUNIVU MOVIE SONGS... ");
                    break;
                case 7:
                    System.out.println("\t\t SATURDAY SPECIAL ");
                    System.out.println("\t\t\t l o a d i n g . . . . . . . . ");
                    Thread.sleep(2000);
                    System.out.println("\t GOAT MOVIE SONGS... ");
                    break;        
               default:
                  System.out.println("\t\t INVALID INPUT \n try again ... ");
                break;
        }
        
        sc.close();         
        }
       
    }

}
