import java.util.*;
public class findCharacter {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=" is lower case",s2=" IS A UPPER CASE",s3=" is a Number",s4=" is s special case";
        while(true)
        {
        System.out.print("\t\t\t ENTER A VALUE :");
        char ch=sc.next().charAt(0);
       
        if(ch>='A' && ch<='Z')
        {
                System.out.println("\t"+ch+s2);
        }
        else if(ch>='a' && ch<='z')
        {
                System.out.println("\t"+ch+s1);
        }
        else if(ch>='0' && ch<='9')
        {
                System.out.println("\t"+ch+s3);
        }
        else
        {
                System.out.println("\t"+ch+s4);
        }
        sc.close();
    }
        
    }
    }
    

