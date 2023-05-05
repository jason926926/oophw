import java.util.Scanner;

public class A1093323_0421_2 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);

        System.out.print("請輸入您的電子郵件地址: ");
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
        String regex="^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$";
        return email.matches(regex);
    }
}
