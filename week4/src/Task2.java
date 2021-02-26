public class Task2 {
    public static void main(String[] args) {
        System.out.println(searchIndex("leetcode"));
        System.out.println(searchIndex("loveleetcode"));
    }
    public static int searchIndex(String s){
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(s.indexOf(ch)==s.lastIndexOf(ch)){
                return i;
            }
        }
        return -1;
    }
}
