import java.util.Scanner;
public class String_turbo{
public static void main(String args[])
{
   //String s="Goswami",s1="Gamwsm",s3="";
   String s3="";
   Scanner sc=new Scanner(System.in);
   String s=sc.next();
   String s1=sc.next();
   for(int i=0;i<s.length();i++)
    {
        if(i<s1.length() && s.charAt(i)==s1.charAt(i))
           {
              s3=s3+s.charAt(i);          
             }
     }
   
     System.out.println(s3);
}

}