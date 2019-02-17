import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入洪乞丐行乞的天数");
        int a=s.nextInt();
        int num=1;
        for(int i=1;i<=a;a--){
            i*=2;
            num+=i;
        }
        System.out.println("洪乞丐的收入为"+num);
    }
}
//天朝有一个乞丐姓洪，去天桥要钱
//第一天要了1块钱
//第二天要了2块钱
//第三天要了4块钱
//第四天要了8块钱
//以此类推
//
//问题： 洪乞丐干10天，收入是多少？