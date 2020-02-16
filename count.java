import java.util.*;

/**
 * @Author: BaiMiao
 * @Description:
 *输入一行字符串，计算其中A-Z大写字母出现的次数 
 *输入描述： 案例可能有多组，每个案例输入为一行字符串。 
 *输出描述： 对每个案例按A-Z的顺序输出其中大写字母出现的次数。
 */
public class test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int[] count = new int[26];
            // 因为只有 26 个英文字母，所以只需要 26 长度 
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    // 哈希中的直接定址法 
                    count[ch - 'A']++;
                }
            }
            for (int i = 0; i < 26; i++) {
                System.out.printf("%c:%d%n", ('A' + i), count[i]);
            }
        }
    }
}
          
