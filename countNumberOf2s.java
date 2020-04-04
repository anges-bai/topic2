import java.util.*;

/**
 * @Author: BaiMiao
 * @Description: 请编写一个方法，输出0到n(包括n)中数字2出现了几次。
 * 给定一个正整数n，请返回0到n的数字中2出现了几次。
 */
public class test6 {
    public int countNumberOf2s(int n) {
        int count = 0;
        // 最终 2 的个数
        int factor = 1;
        // 从低位到高位计算 2 的个数
        int low = 0;
        // 屏蔽掉低位
        int current = 0;
        // 当前计算位数的值
        int high = 0;
        // 计算高位
        while (n / factor != 0) {
            low = n - (n / factor) * factor;
            current = (n / factor) % 10;
            high = n / (factor * 10);
            // 根据当前的
            switch (current) {
                case 0:
                case 1:
                    count += high * factor;
                    break;
                case 2:
                    count += high * factor + low + 1;
                    break;
                default:
                    count += (high + 1) * factor;
                    break;
            }
            factor *= 10;
        }

        return count;
    }
}
