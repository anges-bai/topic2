import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2020/2/12 16:34
 * @Description:输入一串字符str，输出其中最长的一段
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        String res="";
        int count=0;
        char [] arr=str.toCharArray();
        for (int i=0;i<arr.length;i++){
            if ('0'<=arr[i]&&'9'>=arr[i]){
                count=1;
                int index=1;
                for (int j=i+1;j<arr.length;j++){
                    if ('0'<=arr[j]&&'9'>=arr[j]){
                        count++;
                        index=j;
                    }else{
                        break;
                    }
                }
                if (count>res.length()){
                    res=str.substring(i,index+1);
                }
            }else {
                continue;
            }
        }
        System.out.println(res);
    }
}
