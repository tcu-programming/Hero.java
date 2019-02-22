/*寻找某两个数相除，其结果 离黄金分割点 0.618最近

分母和分子不能同时为偶数
分母和分子 取值范围在[1-20] */
public class HelloWorld{
    public static void main(String[] args) {
        final float H = 0.618f;
        float a;
        float b;
        float min = 1;
        float divide = 10;
        float minus;
        float minA =0;
        float minB =0;
        outloop:
        for (a = 1; a < 20; a++)
        {
            for (b = 1; b < 20; b++)
            {
                if(a%2==0 && b%2 == 0)
                    continue;
                divide = a / b;
                minus = (divide-H)>=0?(divide-H):(H-divide);
                if(minus < min)
                {
                    min = minus;
                    minA = a;
                    minB = b;
                    if(min==0)
                        break outloop;
                }
            }
        }
        System.out.println("离黄金分割点0.618最近的两个数相除是："
                +minA+" / "+minB +" = "+minA/minB);
    }
}
