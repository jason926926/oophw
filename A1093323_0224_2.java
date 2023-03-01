import java.util.Scanner;
public class A1093323_0224_2
{
    public static void main(String[] args)
    {
        double num,ans;
        Scanner scanner= new Scanner(System.in);
        System.out.printf("輸入攝氏溫度:");
        num=scanner.nextInt();
        ans=num/5*9+32;
        System.out.printf("華氏溫度:%f\n",ans);
    }
}
