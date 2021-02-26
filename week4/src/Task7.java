import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        String str[] = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        //   排序数组加map存储
        Map<String,List<String>> map = new HashMap <> (  );
        List <List <String>> lists =new ArrayList <> (  );
        for (int i =0;i<str.length;i++){
            char ch[] = str[i].toCharArray ();
//       排序转换为字符数组排序
            Arrays.sort ( ch );
//               将char数组类型转为字符串
            String s = String.valueOf(ch);
//               每当出现一个新的字母易位词(map没有对应键)，就往 ret 中添加一个 list，同时往哈希表中添加该字母易位词
            if (!map.containsKey ( s )){
//                   排序后的字符串作为键值。
                map.put ( s, new ArrayList() );
            }
//               哈希表中添加该字母易位词（对应的键添加对应的未排序的值）
            map.get ( s ).add ( str[i] );
        }
        for (List list:map.values ()){
            lists.add ( list);
        }
        System.out.println(lists);

    }

}
