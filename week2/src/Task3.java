import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        String str = "   233hello15aop999    ";
        str = str.trim();      //去掉空格
        String str2 = "";
        if(str != null && !"".equals(str)){
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)>=48 && str.charAt(i)<=57){
                    str2+=str.charAt(i);
                }
            }
        }
        System.out.println(str2);
    }
}
