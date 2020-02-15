import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @Author: BaiMiao
 * @Date: 2020/2/15 16:44
 * @Description: 现给出两人的交锋记录，请统计双方的胜、平、负次数，并且给出双方分别出什么手势的胜算最大。
 * 输入描述： 输入第1行给出正整数N（<=105），即双方交锋的次数。随后N行，每行给出一次交锋的信息，
 * 即甲、乙双 方同时给出的的手势。C代表“锤子”、J代表“剪刀”、B代 表“布”，第1个字母代表甲方，
 * 第2个代表乙方，中间有1个空格。 输出描述： 输出第1、2行分别给出甲、乙的胜、平、负次数，
 * 数字间以1个空格分隔。第3行给出两个字母，分别代表 甲、乙获胜次数最多的手势，中间有1个空格。
 * 如果解不唯 一，则输出按字母序最小的解。
 */
public class test7 {
    private static class Record {
        public int win;
        public int tie;
        public int lose;
        TreeMap<String, Integer> winCount;

        Record() {
            this.win = 0;
            this.tie = 0;
            this.lose = 0;
            this.winCount = new TreeMap<>();
            this.winCount.put("B", 0);
            this.winCount.put("C", 0);
            this.winCount.put("J", 0);
        }
    }

    private static void win(Record[] records, int win, String gesture) {
        int lose = 1 - win;
        records[win].win++;
        records[lose].lose++;
        int winCount = records[win].winCount.get(gesture);
        records[win].winCount.put(gesture, winCount + 1);
    }

    private static void judge(String a, String b, Record[] records) {
        if (a.equals("B")) {
            if (b.equals("B")) {
                records[0].tie++;
                records[1].tie++;
            } else if (b.equals("C")) {
                win(records, 0, "B");
            } else {
                win(records, 1, "J");

            }
        } else if (a.equals("C")) {
            if (b.equals("B")) {
                win(records, 1, "B");
            } else if (b.equals("C")) {
                records[0].tie++;
                records[1].tie++;
            } else {
                win(records, 0, "C");
            }
        } else {
            if (b.equals("B")) {
                win(records, 0, "J");
            } else if (b.equals("C")) {
                win(records, 1, "C");
            } else {
                records[0].tie++;
                records[1].tie++;
            }
        }
    }

    private static String mostWinGesture(TreeMap<String, Integer> winCount) {
        if (winCount.get("C") >= winCount.get("J")) {
            if (winCount.get("B") >= winCount.get("C")) {
                return "B";
            } else {
                return "C";
            }
        } else {
            if (winCount.get("B") >= winCount.get("J")) {
                return "B";
            } else {
                return "J";
            }
        }
    }

    public static void main(String[] args) {
        Record[] records = new Record[2];
        records[0] = new Record();
        records[1] = new Record();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String a = scanner.next();
            String b = scanner.next();
            judge(a, b, records);
        }
        System.out.format("%d %d %d\n", records[0].win, records[0].tie,
                records[0].lose);
        System.out.format("%d %d %d\n", records[1].win, records[1].tie,
                records[1].lose);
        System.out.format(mostWinGesture(records[0].winCount) + " " +
                mostWinGesture(records[1].winCount));

    }
}
