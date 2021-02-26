

public class Task5 {
    public static void main(String[] args) {
        int[] nums = {1,2,5,9,5,9,5,5,5};
        int res = majorityElement(nums);
        System.out.println(res);
    }
    public static int majorityElement(int[] nums) {
        // 投票算法
        int temp = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == temp) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                temp = nums[i];
                count = 1;
            }
        }

        int t = nums.length / 2 + 1;
        count = 0;
        for (int num : nums) {
            if (num == temp) count++;
            if (count == t) return temp;
        }
        return -1;
    }
}
