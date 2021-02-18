import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入一个数值:");
        try {
            int num = in.nextInt();
            if(num<0)
                throw new NegativeValueException();
            System.out.println("赋值正确");
        }catch (NegativeValueException e){
            e.printf();
        }
    }
}
class NegativeValueException extends Exception{
    NegativeValueException(){
        super();
    }
    public void printf(){
        System.out.println("负值异常：NegativeValueException");
    }
}