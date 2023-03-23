import java.util.Scanner;
public class A1093323_0317_1{
    public static void main(String[] args)
    {
        int n,m,cou=0;
        System.out.printf("請輸入第一個數字：");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        System.out.printf("請輸入第二個數字：");
        m=input.nextInt();
        int[][] array=new int[n][m];    
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                cou=(i+1)*(j+1);
                array[i][j]=cou;
            }
        }
        System.out.printf("輸出結果為：\n");
        for(int[] fin:array)
        {
            for(int ans:fin)
            { 
                System.out.printf("%d,",ans);
            }
            System.out.println();
        }
    }
}