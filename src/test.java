/**
 * Project name(项目名称)：字符串查找
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/29
 * Time(创建时间)： 19:05
 * Version(版本): 1.0
 * Description(描述)： 1. indexOf() 方法
 * indexOf() 方法用于返回字符（串）在指定字符串中首次出现的索引位置，如果能找到，则返回索引值，否则返回 -1。
 * 该方法主要有两种重载形式：
 * str.indexOf(value)
 * str.indexOf(value,int fromIndex)
 * 其中，str 表示指定字符串；value 表示待查找的字符（串）；fromIndex 表示查找时的起始索引，
 * 如果不指定 fromIndex，则默认从指定字符串中的开始位置（即 fromIndex 默认为 0）开始查找。
 */

public class test
{
    public static void main(String[] args)
    {
        String words = "today,monday,sunday";
        System.out.println("原始字符串是'" + words + "'");
        System.out.println("indexOf(\"day\")结果：" + words.indexOf("day"));
        System.out.println("indexOf(\"day\",5)结果：" + words.indexOf("day", 5));
        System.out.println("indexOf(\"o\")结果：" + words.indexOf("o"));
        System.out.println("indexOf(\"o\",6)结果：" + words.indexOf("o", 6));
    }
}
