
public class HelloWorld{
    public static void main(String[] args) {
        int a[]=new int[5];
        a[0]=(int)(Math.random()*100);
        a[1]=(int)(Math.random()*100);
        a[2]=(int)(Math.random()*100);
        a[3]=(int)(Math.random()*100);
        a[4]=(int)(Math.random()*100);
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
        for(int j=a.length-1;j>=0;j--)
            System.out.println(a[j]);
        }
    }
