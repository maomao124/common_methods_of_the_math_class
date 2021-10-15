import java.util.Scanner;

/**
 * Project name(项目名称)：Math类的常用方法
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/15
 * Time(创建时间)： 21:42
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        System.out.println("e的值：" + Math.E);
        System.out.println("PI的值：" + Math.PI);
        System.out.println("15和65的较大值：" + Math.max(15, 65));
        System.out.println("12.6和28.6的较大值：" + Math.max(12.6, 28.6));
        System.out.println("38.47和85的较小值：" + Math.min(38.47, 85));
        System.out.println("19的绝对值：" + Math.abs(19));
        System.out.println("-14.6的绝对值：" + Math.abs(-14.6));
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        double num = input.nextDouble();
        System.out.println("大于或等于 " + num + " 的最小整数：" + Math.ceil(num));
        System.out.println("小于或等于 " + num + " 的最大整数：" + Math.floor(num));
        System.out.println("将 " + num + " 加上 0.5 之后最接近的整数：" + Math.round(num));
        System.out.println("最接近 " + num + " 的整数：" + Math.rint(num));
        System.out.println("60度的正弦值：" + Math.sin(Math.PI / 3));
        System.out.println("30度的正弦值：" + Math.sin(Math.PI / 6));
        System.out.println("0 度的余弦值：" + Math.cos(0));
        System.out.println("30 度的余弦值：" + Math.cos(Math.PI / 6));
        System.out.println("30度的反正弦值：" + Math.asin(Math.PI / 6));
        System.out.println("30 度的反余弦值：" + Math.acos(Math.PI / 6));
        System.out.println("1 的反正切值：" + Math.atan(1));
        System.out.println("45度的反正切值：" + Math.atan(Math.PI / 4));
        System.out.println("90度的反正切值：" + Math.atan(Math.PI / 2));
        System.out.println("120 度的弧度值：" + Math.toRadians(120.0));
        System.out.println("PI/3的角度值：" + Math.toDegrees(Math.PI / 3));
        System.out.println("e的8次幂：" + Math.exp(8));
        System.out.println("4 的立方值：" + Math.pow(4, 3));
        System.out.println("16 的平方根：" + Math.sqrt(16));
        System.out.println("10 为底 2 的对数：" + Math.log10(2));
    }
}
