
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Description: 输入一个数n，然后输入n个数值各不相同，再输入一个值x，输出这个值在这个数组中的下标
 * （从0开始，若不在数组中则输出-1）。
 * 输入描述：测试数据有多组，输入n(1<=n<=200)，接着输入n个数，然后输入x。
 * 输出描述：对于每组输入,请输出结果。
 * 示例1: 输入21 3 0输出-1
 */


public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();//输入第一个数 表示数字个数 n
        String[] nums = sc.nextLine().split(" ");//输入n个数字，空格分割
        String x = sc.nextLine();//输入要找的数字
        System.out.println(Arrays.asList(nums).indexOf(x));
    }
}
