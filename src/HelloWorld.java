public class HelloWorld {
    int i=1;
    int j=i;//其他属性可以访问i

    public void method1() {
        System.out.println(i);
    }
              //方法1里可以访问i
    public void method2(){
        System.out.println(i);
    }
              //方法2里可以访问i

    public void method3(int a) {
        System.out.println(a);
    }         //只能在方法3中引用a

    public void method4() {
        System.out.println(a);
    }         //方法4中不能访问a
    int m=a;  //类里面也不能访问a
    public void method5() {
        int b=5;
        System.out.println(b);
        {
            System.out.println(b); //可以访问b
            int c=6;
            System.out.println(c);//可以访问c
        }
        System.out.println(c);//不能访问c
    }
}
