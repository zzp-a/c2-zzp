import java.util.Scanner;

class Circle{
        int radius;
        public void getArea(int redius){
            System.out.println("输出：the area is "+(float)(3.14*redius*redius));
        }
        public void getPerimeter(int redius){
            System.out.println("     the perimeter is "+(2*3.14*redius));
        }
    }
public class Task5 {
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.radius = 3;
        System.out.println("输入："+cir.radius);
        cir.getArea(3);
        cir.getPerimeter(3);
    }
}