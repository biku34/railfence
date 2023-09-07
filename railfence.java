import java.util.*;
public class sample
{
    public static void main(String [] args)
    {
        String str,newstr="";
        int shift,j=0,i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        str=sc.next();
        System.out.println("Enter the shift : ");
        shift=sc.nextInt();
        int flag=0,n=shift;
        char ar[][]=new char[shift][str.length()];
        for(i=0;i<str.length();i++)
        {
            ar[j][i]=str.charAt(i);
            if(j==n-1){
                flag=1;
            }
            else if(j==0)
                flag=0;
            if(flag==0){
                j++;
            }
            else j--;
        }
        for(i=0;i<shift;i++)
        {
            for(j=0;j<str.length();j++)
            {
                if(ar[i][j]!=' ')
                newstr+=ar[i][j];
                System.out.print(ar[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println("The String : "+newstr);
    }
}