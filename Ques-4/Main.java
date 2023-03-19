import java.util.Scanner;
public class Main{
    public static int pow(int num,int exp)
    {
        if(exp==1)
        {
            return num;
        }
        else
        {
            return num*pow(num,exp-1);
        }
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int exp=sc.nextInt();
        int result=pow(num,exp);
        System.out.println(num +" to the power of "+exp+" is "+result);
    }
}
