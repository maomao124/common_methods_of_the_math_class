import java.util.Scanner;

/**
 * Project name(项目名称)：Math类的常用方法
 * Package(包名): PACKAGE_NAME
 * Class(类名): get_integer
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/15
 * Time(创建时间)： 21:15
 * Version(版本): 1.0
 * Description(描述)： 求整运算
 * Math 类的求整方法有很多，详细说明如表 2 所示。
 * <p>
 * 表 2 取整方法及其说明
 * 方法	说明
 * static double ceil(double a)	返回大于或等于 a 的最小整数
 * static double floor(double a)	返回小于或等于 a 的最大整数
 * static double rint(double a)	返回最接近 a 的整数值，如果有两个同样接近的整数，则结果取偶数
 * static int round(float a)	将参数加上 1/2 后返回与参数最近的整数
 * static long round(double a)	将参数加上 1/2 后返回与参数最近的整数，然后强制转换为长整型
 */

public class get_integer
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        double num = input.nextDouble();
        System.out.println("大于或等于 "+ num +" 的最小整数：" + Math.ceil(num));
        System.out.println("小于或等于 "+ num +" 的最大整数：" + Math.floor(num));
        System.out.println("将 "+ num +" 加上 0.5 之后最接近的整数：" + Math.round(num));
        System.out.println("最接近 "+num+" 的整数：" + Math.rint(num));


    }
}
