import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        HashMap<String,Integer> hm = new HashMap<>();
        String[] strs = str.split("");
        for (int i = 0; i < strs.length; i++) {
            if(!hm.containsKey(strs[i])){
                hm.put(strs[i],1);
            }else {
                Integer counts = hm.get(strs[i]);
                hm.put(strs[i],counts+1);
            }
        }
        Iterator<String> it=hm.keySet().iterator();
        while ((it.hasNext())){
            String keyName=it.next();
            System.out.println(keyName+":"+hm.get(keyName));
        }
    }
}
