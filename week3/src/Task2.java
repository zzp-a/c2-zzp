import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Data data1 = new Data(1,"Joe",70000,"3");
        Data data2 = new Data(2,"Henry",80000,"4");
        Data data3 = new Data(3,"Sam",60000,"");
        Data data4 = new Data(4,"Max",90000,"");

        HashMap<Integer,Data> dataHashMap = new HashMap<>();
        dataHashMap.put(data1.getId(), data1);
        dataHashMap.put(data2.getId(), data2);
        dataHashMap.put(data3.getId(), data3);
        dataHashMap.put(data4.getId(), data4);
        List<HashMap<Integer,Data>> datalist = new ArrayList<>();
        datalist.add(dataHashMap);
        System.out.println("+----+-------+--------+-----------+");
        System.out.println("| Id | Name  | Salary | ManagerId |");
        System.out.println("+----+-------+--------+-----------+");
        for (HashMap<Integer,Data> h : datalist){
            Set<Integer> key = h.keySet();
            for(Integer i : key){
                System.out.println("| "+ i +"\t"+h.get(i).getName()+"| "+"\t"+h.get(i).getSalary()+"| "+"\t"+h.get(i).getManagerId()+"\t"+"|");
            }
        }
        System.out.println("+----+-------+--------+-----------+");
    }
}
class Data {
    private int id;
    private String name;
    private int salary;
    private String managerId;
    Data(int id, String name, int salary, String managerId){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.managerId = managerId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getManagerId() {
        return managerId;
    }
}