public class Task2 {
    public static void main(String[] args) {
        int num = 100, count = 0;
        int a, b, c;
        for (;num <1000 ;num++)
        {
            a = num % 10;
            b = (num / 10) % 10;
            c = num / 100;
            if(num == a*a*a + b*b*b + c*c*c)
                count++;
        }
        System.out.println("1000以内的水仙花数有"+count+"个");
    }
}
