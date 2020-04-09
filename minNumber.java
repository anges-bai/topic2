import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Description:输入n个数找出最小的k个数
 */
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        int[] arr= Arrays.copyOf(input,input.length);
        Arrays.sort(arr);
        ArrayList<Integer> str=new ArrayList<>();
        for (int i=0;i<k;i++){
            str.add(arr[i]);
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int length=scanner.nextInt();
        int[] arr =new int[length];
        Solution s1=new Solution();
       System.out.println(s1.GetLeastNumbers_Solution(arr,3));
    }
}
