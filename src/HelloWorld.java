public class HelloWorld{
    public static void main(String[] args) {
        int a=6;
        long b=7;
        int c=(int)(a+b); //因为计算的结果为long，所以需要进行强制转换
        long d=a+b;


        byte a1=1;
        byte a2=2;
        byte c1=(byte)(a1+a2);
        int d1=a1+a2;

        int i=5;
        int j=2;
        System.out.println(i%j);
    }


}