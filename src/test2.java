/**
 * Project name(项目名称)：字符串查找 string-lookup
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/29
 * Time(创建时间)： 19:25
 * Version(版本): 1.0
 * Description(描述)： 2. lastlndexOf() 方法
 * lastIndexOf() 方法用于返回字符（串）在指定字符串中最后一次出现的索引位置，如果能找到则返回索引值，否则返回 -1。
 * 该方法也有两种重载形式：
 * str.lastIndexOf(value)
 * str.lastlndexOf(value, int fromIndex)
 * 注意：lastIndexOf() 方法的查找策略是从右往左查找，如果不指定起始索引，则默认从字符串的末尾开始查找。
 */

public class test2
{
    public static void main(String[] args)
    {
        String words = "today,monday,Sunday";
        System.out.println("原始字符串是'" + words + "'");
        System.out.println("lastIndexOf(\"day\")结果：" + words.lastIndexOf("day"));
        System.out.println("lastIndexOf(\"day\",5)结果：" + words.lastIndexOf("day", 5));
        System.out.println("lastIndexOf(\"o\")结果：" + words.lastIndexOf("o"));
        System.out.println("lastlndexOf(\"o\",6)结果：" + words.lastIndexOf("o", 6));
    }
}
