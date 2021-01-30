class BankAccount{
    private String name;
    private float balance;
    public BankAccount(String name,float balance){
        this.setName(name);
        this.setBalance(balance);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public void check(){
        System.out.print("账户"+getName()+"的余额为："+getBalance());
    }
}
public class Task6 {
    public static void main(String[] args) {
        BankAccount a=new BankAccount("张三",5000);
        a.check();
    }
}
