import java.util.Scanner;

class Fushu{
    private int a;
    private int b;
    public Fushu(int a,int b){
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public String toString(){
        return a+"+"+b+"i";
    }
    public Fushu(){
        this.a = 0;
        this.b = 0;
    }
    public Fushu add(Fushu fushu){
        return new Fushu(this.a+fushu.getA(),this.b+fushu.getB());
    }
    public Fushu reduce(Fushu fushu){
        return new Fushu(this.a-fushu.getA(),this.b-fushu.getB());
    }
    public Fushu multiply(Fushu fushu){
        int a = (this.a*fushu.a)-(this.b*fushu.b);
        int b = (this.a*fushu.b)+(this.b*fushu.a);
        Fushu result = new Fushu(a, b);
        return result;
    }
}
public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入：");
        Fushu t1 = new Fushu(in.nextInt(), in.nextInt());
        Fushu t2 = new Fushu(in.nextInt(),in.nextInt());
        System.out.println("两复数相加的结果为："+t1.add(t2).toString());
        System.out.println("两复数相减的结果为："+t1.reduce(t2).toString());
        System.out.println("两复数相乘的结果为："+t1.multiply(t2).toString());
    }
}