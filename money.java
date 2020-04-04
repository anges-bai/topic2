import java.io.IOException;
import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Description:
 * 如果你是哈利·波特迷，你会知道魔法世界有它自己的货币系统 —— 就如海格告诉哈利的：
 * “十七个银西可 (Sickle)兑一个加隆(Galleon)，二 十九个纳特(Knut)兑一个西可，很容易。”
 * 现在，给定哈利应付的价钱P和他实付的钱A，你的任务是写一个程 序来计算他应该被找的零钱。
 */
public class test5 {
    private static long toKnut(long galleon, long sickle, long knut) {
        return galleon * 17 * 29 + sickle * 29 + knut;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String[] strP = scanner.next().split("\\.");
        String[] strA = scanner.next().split("\\.");
        // 将字符串转换为数值类型，考虑到可能过大，用 long 类型
        long[] longP = {Long.parseLong(strP[0]),
                Long.parseLong(strP[1]), Long.parseLong(strP[2]),
        };
        long[] longA = {Long.parseLong(strA[0]), Long.parseLong(strA[1]),
                Long.parseLong(strA[2]),};
        // 将单位全部转换为 纳特(Knut)
        long pInKnut = toKnut(longP[0], longP[1], longP[2]);
        long aInKnut = toKnut(longA[0], longA[1], longA[2]);
        long changeInKnut = aInKnut - pInKnut;
        if (changeInKnut < 0) {
            System.out.print("-");
            changeInKnut = -changeInKnut;
        }
        // 打印时，将单位还原回去
        System.out.format("%d.%d.%d\n", changeInKnut / (17 * 29),
                (changeInKnut % (17 * 29)) / 29, ((changeInKnut % (17 * 29)) % 29));
    }
}
