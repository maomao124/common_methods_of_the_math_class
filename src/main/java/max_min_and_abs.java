/**
 * Project name(项目名称)：Math类的常用方法
 * Package(包名): PACKAGE_NAME
 * Class(类名): max_min_and_abs
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/15
 * Time(创建时间)： 21:08
 * Version(版本): 1.0
 * Description(描述)： 求最大值、最小值和绝对值
 * 在程序中常见的就是求最大值、最小值和绝对值问题，如果使用 Math 类提供的方法可以很容易实现。这些方法的说明如表 1 所示。
 * <p>
 * 表 1 求最大值、最小值和绝对值的方法
 * 方法	                      说明
 * static int abs(int a)	返回 a 的绝对值
 * static long abs(long a)	返回 a 的绝对值
 * static float abs(float a)	返回 a 的绝对值
 * static double abs(double a)	返回 a 的绝对值
 * static int max(int x,int y)	返回 x 和 y 中的最大值
 * static double max(double x,double y)	返回 x 和 y 中的最大值
 * static long max(long x,long y)	返回 x 和 y 中的最大值
 * static float max(float x,float y)	返回 x 和 y 中的最大值
 * static int min(int x,int y)	返回 x 和 y 中的最小值
 * static long min(long x,long y)	返回 x 和 y 中的最小值
 * static double min(double x,double y)	返回 x 和 y 中的最小值
 * static float min(float x,float y)	返回 x 和 y 中的最小值
 */

public class max_min_and_abs
{
    public static void main(String[] args)
    {
        System.out.println("15和65的较大值：" + Math.max(15, 65));
        System.out.println("12.6和28.6的较大值：" + Math.max(12.6, 28.6));
        System.out.println("38.47和85的较小值：" + Math.min(38.47, 85));
        System.out.println("19的绝对值：" + Math.abs(19));
        System.out.println("-14.6的绝对值：" + Math.abs(-14.6));
    }
}
