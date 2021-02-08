import sun.security.timestamp.TSRequest;

import java.util.Scanner;

class Game{
    int v = 100;
    int m;
    void guess(){
        System.out.println("欢迎来到猜字游戏，请输入一个数：");
        while (true){
            Scanner in = new Scanner(System.in);
            int m = in.nextInt();
            if(m > v)
            {
                System.out.println("猜大了噢，再试一下吧！");
            }
            else if (m < v)
            {
                System.out.println("猜得有点小，再试一下吧！");
            }
            else {
                System.out.println("恭喜你，猜对了！");
            }
        }
    }
}

public class Task4 {

    public static void main(String[] args) {
        Game game = new Game();
        game.guess();
    }
}
