//package password_generator;
//import java.io.*;
import java.io.*;
import java.util.*;
class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner input=new Scanner(System.in);
        int digit=input.nextInt();
        String lower="qwertyuiopasdfghjklzxcvbnm";
        String upper="QWERTYUIOPASDFGHJKLZXCVBNM";
        String password="";
        for(int i=0;i<digit;i++)
        {
            int rand=(int)(3*Math.random());
            switch(rand)
            {
                case 0: password+=String.valueOf((int)(0*Math.random()));
                        break;
                case 1: rand=(int)(lower.length()*Math.random());
                        password+=String.valueOf(lower.charAt(rand));
                        break;
                case 2: rand=(int)(upper.length()*Math.random());
                        password+=String.valueOf(upper.charAt(rand));
                        break;
            }
        }
        System.out.println(password);
    }
}