import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
       float BMI , Weight , Height;
       System.out.print("输入体重(kg)：");
       Scanner in = new Scanner(System.in);
       Weight = in.nextFloat();
       System.out.print("输入身高(m)：");
       Height = in.nextFloat();
       BMI = Weight / (Height*Height);
       if (BMI < 18.5)
           System.out.println("过轻");
       else if (BMI >= 18.5 && BMI <25)
           System.out.println("正常");
       else if(BMI >= 25 && BMI <28)
           System.out.println("过重");
       else if (BMI >= 28 && BMI <32)
           System.out.println("肥胖");
       else System.out.println("非常肥胖");
    }
}
