import java.util.Scanner;
public class A1093323_0224_1
{
    public static void main(String[] args)
    {
        int num;
        Scanner scanner= new Scanner(System.in);
        System.out.printf("輸入數字:");
        num=scanner.nextInt();
        if(num%2==0)
        {
            System.out.printf("偶數\n");
        }
        else if(num==0)
        {
            System.out.printf("非奇、偶數\n");
        }
        else
        {
            System.out.printf("奇數\n");
        }
    }
}