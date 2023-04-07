import java.util.*;
public class animal{
    public String[] name=new String[6];
    public double[] height=new double[6];
    public double[] weight=new double[6];
    public double[] speed=new double[6];

    static void info(){
        System.out.printf("歡迎進入冰雪奇緣系統\n");
    }

    void show(){       
        System.out.printf("項目名稱\t身高(公尺)\t體重(公斤)\t數度(公尺/分鐘)\n");
        for(int i=0;i<4;i++){
            System.out.printf("%s\t\t%.2f\t\t%.2f\t\t%.2f\n",name[i],height[i],weight[i],speed[i]);    
        }
        System.out.println();
    }


    double[] distance()
    {
        double[] distance_num=new double[4];
        int j=1;
        double[] x=new double[4];
        double[] y=new double[4];
        Scanner scanner=new Scanner(System.in);
        Scanner ask=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            System.out.printf("請輸入%s的跑步時間(分鐘)\n",name[i]);
            while(j==1){
                x[i] = scanner.nextDouble();
                if(x[i]>=0 && x[i]<=60)
                {
                    j=0;
                }
                else
                {
                    System.out.printf("輸入錯誤的格式，請重新輸入\n");
                }
            }
            j=1;
            int k=1;
            System.out.printf("是否有加速度(y/n)？\n");
            while(k == 1)
            {
                String o="o";
                o=ask.nextLine();
                switch(o)
                {
                    case "y":
                        System.out.printf("請輸入%s跑步時的加速度\n",name[i]);  
                        y[i]=scanner.nextDouble();
                        k=0;
                        break;
                    case "n":
                        y[i]=1;
                        k=0;
                        break;                               
                }
                if(k == 1 )
                {
                    System.out.printf("請輸入y or n\n");
                }
            }
            k=1;
            distance_num[i]=x[i]*y[i]*speed[i]; 
        }
        System.out.printf("\n");
        return distance_num;
    }

}