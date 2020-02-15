import java.util.*;

/**
 * @Author: BaiMiao
 * @Date: 2020/2/15 16:48
 * @Description: 有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶、3阶。请实现一个方法，
 * 计算小孩有多少 种上楼的方式。为了防止溢出，请将结果Mod 1000000007 给定一个正整数int n，
 * 请返回一个数，代表上楼的方式数。保证n小于等于100000。
 */
public class test8 {
    public int countWays(int n) {
        // 第一阶有一种方法
        // 第二阶有两种方法，一步一步 or 一次两步
        // 第三阶有四种方法，1+1+1 or 1 + 2 or 2 + 1 or 3
        long[] pre = {1, 2, 4};
        if (n <= 0) return 0;
        else if (n <= 3) return (int) pre[n - 1];
        else {
            for (int i = 4; i <= n; i++) {
                long tmp = (pre[0] + pre[1] + pre[2]) % 1000000007;
                pre[0] = pre[1];
                pre[1] = pre[2];
                pre[2] = tmp;
            }
        }
        return (int) pre[2];
    }
}
