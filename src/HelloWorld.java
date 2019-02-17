import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("请输入一个整数");
     int a=s.nextInt();
     int sum=1;
     while (a>1){
         sum=sum*a;
         a--;
     }
        System.out.println("这个数的阶乘是"+sum);
    }
}