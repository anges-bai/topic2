import java.util.*;

/**
 * @Author: BaiMiao
 * @Description:
 *写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串(注意可能存在的一个测试用例 里的多组数据)。 
 * 输入描述： 输入一个十六进制的数值字符串。 
 * 输出描述： 输出该数值的十进制字符串。
 */
public class test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            long num = 0;
            for (int i = 2; i < line.length(); i++) {
                num *= 16;
                char ch = line.charAt(i);
                int n = 0;
                if (ch >= 'A' && ch <= 'F') {
                    n = ch - 'A' + 10;
                } else if (ch >= 'a' && ch <= 'f') {
                    n = ch - 'a' + 10;
                } else {
                    n = ch - '0';
                }
                num += n;
            }
            System.out.println(num);
        }
    }
}
   
