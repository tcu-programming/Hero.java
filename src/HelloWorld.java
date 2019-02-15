import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("第一个整数 "+a);
        int b=s.nextInt();
        System.out.println("第二个整数 "+b);
        float c=s.nextFloat();
        System.out.println("读取的浮点数 "+c);
        String d=s.nextLine();
        System.out.println("读取的字符串为" +d);
        int i=s.nextInt();
        System.out.println("读取的整数是 "+i);
        String rn=s.nextLine();
        String e=s.nextLine();
        System.out.println("读取的字符串是 "+e);
    }
}