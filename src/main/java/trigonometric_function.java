/**
 * Project name(项目名称)：Math类的常用方法
 * Package(包名): PACKAGE_NAME
 * Class(类名): trigonometric_function
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/15
 * Time(创建时间)： 21:25
 * Version(版本): 1.0
 * Description(描述)： 三角函数运算
 * Math 类中包含的三角函数方法及其说明如表 3 所示。
 * <p>
 * 表 3 三角函数方法及其说明
 * 方法	说明
 * static double sin(double a)	返回角的三角正弦值，参数以孤度为单位
 * static double cos(double a)	返回角的三角余弦值，参数以孤度为单位
 * static double asin(double a)	返回一个值的反正弦值，参数域在 [-1,1]，值域在 [-PI/2,PI/2]
 * static double acos(double a)	返回一个值的反余弦值，参数域在 [-1,1]，值域在 [0.0,PI]
 * static double tan(double a)	返回角的三角正切值，参数以弧度为单位
 * static double atan(double a)	返回一个值的反正切值，值域在 [-PI/2,PI/2]
 * static double toDegrees(double angrad)	将用孤度表示的角转换为近似相等的用角度表示的角
 * staticdouble toRadians(double angdeg)	将用角度表示的角转换为近似相等的用弧度表示的角
 * 在表 3 中，每个方法的参数和返回值都是 double 类型，参数以弧度代替角度来实现，其中 1 度等于 π/180 弧度，因此平角就是 π 弧度。
 */

public class trigonometric_function
{
    public static void main(String[] args)
    {
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
    }
}
