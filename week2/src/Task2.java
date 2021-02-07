import java.util.Scanner;

public class Task2 {
    public static String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }                        //判断字符串是否为空
        String maxPrefix = strs[0];
        int firstLen = maxPrefix.length();      //设定首字符串和其长度
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < firstLen; j++) {
                maxPrefix = strs[0].substring(0,j+1);
                if(!strs[i].startsWith(maxPrefix)){
                    maxPrefix = maxPrefix.substring(0,j);
                    firstLen = maxPrefix.length();
                    break;
                }
            }
            if(firstLen == 0)
            {
                return maxPrefix;
            }
        }
        return maxPrefix;
    }
    public static void main(String[] args) {
        String strs[] = {"flag","flower","flow"};
        System.out.println(longestCommonPrefix(strs));       //输出最长公共前缀
    }
}
