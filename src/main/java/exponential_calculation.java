/**
 * Project name(项目名称)：Math类的常用方法
 * Package(包名): PACKAGE_NAME
 * Class(类名): exponential_calculation
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/15
 * Time(创建时间)： 21:38
 * Version(版本): 1.0
 * Description(描述)： 指数运算
 * 指数的运算包括求方根、取对数及其求 n 次方的运算。在 Math 类中定义的指数运算方法及其说明如表 4 所示。
 * <p>
 * 表 4 指数方法及其说明
 * 方法	说明
 * static double exp(double a)	返回 e 的 a 次幂
 * static double pow(double a,double b)	返回以 a 为底数，以 b 为指数的幂值
 * static double sqrt(double a)	返回 a 的平方根
 * static double cbrt(double a)	返回 a 的立方根
 * static double log(double a)	返回 a 的自然对数，即 lna 的值
 * static double log10(double a)	返回以 10 为底 a 的对数
 */

public class exponential_calculation
{
    public static void main(String[] args)
    {
        System.out.println("e的8次幂："+Math.exp(8));
        System.out.println("4 的立方值：" + Math.pow(4, 3));
        System.out.println("16 的平方根：" + Math.sqrt(16));
        System.out.println("10 为底 2 的对数：" + Math.log10(2));
    }
}
