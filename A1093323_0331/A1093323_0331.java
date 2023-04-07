
public class A1093323_0331
{
    public static void main(String[] args)
    {
        double[] dnum=new double[6];
        snow sn=new snow();
        sn.info();

        sn.name[0]="雪寶";
        sn.name[1]="驢子";
        sn.name[2]="阿克";
        sn.name[3]="漢斯";
        sn.name[4]="安那";
        sn.name[5]="愛沙";

        sn.height[0]=1.1f;
        sn.height[1]=1.5f;
        sn.height[2]=1.9f;
        sn.height[3]=1.8f;
        sn.height[4]=1.7f;
        sn.height[5]=1.7f;

        sn.weight[0]=52;
        sn.weight[1]=99;
        sn.weight[2]=80;
        sn.weight[3]=78;
        sn.weight[4]=48;
        sn.weight[5]=50;

        sn.speed[0]=100;
        sn.speed[1]=200;
        sn.speed[2]=150;
        sn.speed[3]=130;
        sn.speed[4]=120;
        sn.speed[5]=120;

        sn.sex[0]="X";
        sn.sex[1]="X";
        sn.sex[2]="男";
        sn.sex[3]="男";
        sn.sex[4]="女";
        sn.sex[5]="女";

        sn.skill[0]="X";
        sn.skill[1]="X";
        sn.skill[2]="X";
        sn.skill[3]="X";
        sn.skill[4]="X";
        sn.skill[5]="Yes";

        sn.show();
        dnum=sn.distance();
        System.out.printf("雪寶奔跑的距離為：%.2f\n驢子奔跑的距離為：%.2f\n阿克奔跑的距離為：%.2f\n漢斯奔跑的距離為：%.2f\n安那奔跑的距離為：%.2f\n愛沙奔跑的距離為：%.2f\n",dnum[0],dnum[1],dnum[2],dnum[3],dnum[4],dnum[5]);
    } 
}