import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println("输入:nums = [-1,0,1,2,-1,-4],target = 0");
        System.out.println("输出:"+threeSum(nums,0));
    }
    public static List<List<Integer>> threeSum(int[] nums, int target) {
        if(nums.length < 3){
            return new ArrayList<>();
        }
        //排序
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> resultarr = new ArrayList<>();
        //存入哈希表
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
        }
        Integer t;
        for(int i = 0; i < nums.length; ++i){
            target = -nums[i];
            //去重
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i + 1; j < nums.length; ++j){
                if(j > i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                if((t = map.get(target - nums[j])) != null){
                    //符合要求的情况,存入
                    if(t > j){
                        resultarr.add(new ArrayList<>
                                (Arrays.asList(nums[i], nums[j], nums[t])));

                    }
                    else{
                        break;
                    }
                }
            }
        }
        return resultarr;
    }
}
