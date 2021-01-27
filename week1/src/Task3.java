import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        nixu();
    }
    public static void nixu(){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = "";
        char[] c = a.toCharArray();
        for (int i = c.length-1;i >= 0;i--)
        {
            b = b + c[i];
        }
        System.out.println(b);
    }
}