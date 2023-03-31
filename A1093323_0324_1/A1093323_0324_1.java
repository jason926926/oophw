public class A1093323_0324_1 
{
    public static void main(String[] args)
    {
        double[] dnum=new double[4];
        animal ani=new animal();
        
        ani.name[0]="雪寶";
        ani.name[1]="驢子";
        ani.name[2]="安那";
        ani.name[3]="愛沙";

        ani.height[0]=1.1f;
        ani.height[1]=1.5f;
        ani.height[2]=1.7f;
        ani.height[3]=1.7f;

        ani.weight[0]=52;
        ani.weight[1]=99;
        ani.weight[2]=48;
        ani.weight[3]=50;

        ani.speed[0]=100;
        ani.speed[1]=200;
        ani.speed[2]=120;
        ani.speed[3]=120;

        ani.show();
        distance_Num=ani.distance();
        System.out.printf("雪寶奔跑的距離為：%.2f\n驢子奔跑的距離為：%.2f\n安那奔跑的距離為：%.2f\n愛沙奔跑的距離為：%.2f\n",dnum[0],dnum[1],dnum[2],dnum[3]);
    } 
}