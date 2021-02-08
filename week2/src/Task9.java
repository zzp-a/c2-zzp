public class Task9 {
    public static void main(String[] args) {
        star a= new star();
        a.shine();
        System.out.println("====================");

        sun sun1  = new sun();
        sun1.doAnything();
        sun1.shine();
    }
}

interface Universe{
    public abstract void doAnything();
}

class star{
    public void shine(){
        System.out.println("star:星星一闪一闪亮晶晶");
    }
}

class sun extends star implements Universe{

    public void doAnything() {
        System.out.println("sun:太阳吸引着9大行星旋转");
    }
    public void shine() {
        System.out.println("sun:光照八分钟,到达地球");
    }
}