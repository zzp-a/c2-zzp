class Vehicle {
    private int wheels;
    private float weight;
    protected Vehicle(int wheels, float weight){
        this.wheels = wheels;
        this.weight = weight;
    }
    public int getWheels() {
        return wheels;
    }
    public float getWeight() {
        return weight;
    }
    public void print(){
        System.out.println("车轮的个数是："+this.getWheels());
        System.out.println("车重："+this.getWeight());
    }
}
class Car extends Vehicle{
    private int loader;
    private int isloader;
    public Car(int wheels, float weight, int loader ,int isloader) {
        super(wheels, weight);
        this.loader = loader;
        this.isloader = isloader;
    }
    public int getloader() {
        return loader;
    }
    public int getIsloader(){
        return isloader;
    }
    public void print(){
        System.out.println("车轮的个数是："+this.getWheels());
        System.out.println("车重："+this.getWeight());
        if(this.isloader > this.getloader()){
            System.out.println("这是一辆小车，能载"+this.getloader()+"人，实载"+this.isloader+"人,你超员了！！！");
        }
        else  System.out.println("这是一辆小车，能载"+this.getloader()+"人，实载"+this.isloader+"人");
    }
}
class Truck extends Vehicle{
    private int loader;
    private float payload;
    private float ispayload;
    private int isloader;
    public Truck(int wheels, float weight, int loader, float payload ,float ispayload,int isloader) {
        super(wheels, weight);
        this.loader = loader;
        this.payload = payload;
        this.isloader = isloader;
        this.ispayload = ispayload;
    }
    public int getloader() {
        return loader;
    }
    public int getIsloader(){
        return isloader;
    }
    public float getPayload() {
        return payload;
    }

    public float getIspayload() {
        return ispayload;
    }

    public void print(){
        System.out.println("车轮的个数是："+this.getWheels());
        System.out.println("车重："+this.getWeight());
        if(this.isloader > this.getloader()){
            System.out.println("这是一辆卡车，能载"+this.getloader()+"人，实载"+this.isloader+"人,你超员了！！！");
        }
        else  System.out.println("这是一辆小车，能载"+this.getloader()+"人，实载"+this.isloader+"人");
        if(this.ispayload > this.payload){
            System.out.println("这是一辆卡车，核载"+this.payload+",你已装载"+this.ispayload+",你超载了！！！");
        }
        else System.out.println("这是一辆卡车，核载"+this.payload+",你已装载"+this.ispayload);
    }
}
public class Task6{
    public static void main(String args[]){
        Vehicle car = new Car(4,1150,5,6);
        Vehicle truck = new Truck(6,15000,3,5000,7000,1);
        car.print();
        System.out.println("*****************************");
        truck.print();
    }
}