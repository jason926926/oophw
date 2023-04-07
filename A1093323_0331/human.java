public class human extends animal{
    public String[] sex= new String[6];
    void show()
    {       
        System.out.printf("項目名稱\t身高(公尺)\t體重(公斤)\t性別\t數度(公尺/分鐘)\n");
        for(int i=0;i<5;i++)
        {
            System.out.printf("%s\t\t%.2f\t\t%.2f\t\t%s\t\t%.2f\n",name[i],height[i],weight[i],sex[i],speed[i]);    
        }
        System.out.printf("\n");
    }
}
