import java.util.Scanner;

public class A1093323_0421_1 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);

        System.out.print("請輸入您的電子郵件地址:");
        String email=scanner.nextLine();

        boolean valid=validateEmail(email);

        if (valid) 
        {
            System.out.println("該郵件地址格式正確。");
        } 
        else 
        {
            System.out.println("該郵件地址格式不正確。");
        }
    }

    private static boolean validateEmail(String email) 
    {
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');

        if (atIndex < 1 || dotIndex < atIndex + 2 || dotIndex + 2 >= email.length()) 
        {
            return false;
        }

        return true;
    }
}