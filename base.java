**
 * @Author: BaiMiao
 * @Description:
 */
public class Base {
    private  String baseName="bae";
    public Base(){
        callName();
    }
    public void callName(){
        System.out.println(baseName);
    }
    static class Sub extends Base{
        private String baseName="sub";

        public void callName(){
            System.out.println(baseName);
        }
    }
    public static void main(String[] args) {
        //Base b=new Sub();
        Base b=null;
        b.callName();
    }
}
