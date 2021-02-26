public class Task4 {
    private static int getKMin(int[] nums, int k) {
        if (nums == null || nums.length < k) {
            return Integer.MIN_VALUE;
        }
        return quikSort(nums, 0, nums.length - 1, k);
    }

    private static int quikSort(int[] nums, int low, int high, int k) {
//		第0个元素作为枢纽
        int i = low;
        int j = high;
        int tmp = nums[i];
        if (low > high) {
            return Integer.MIN_VALUE;
        }
//		快速排序
        while (i < j) {
            while (i < j && nums[j] >= tmp) {
                j--;
            }
            if (i < j) {
                nums[i++] = nums[j];
            }
            while (i < j && nums[i] < tmp) {
                i++;
            }
            if (i < j) {
                nums[j--] = nums[i];
            }
        }//
        nums[i] = tmp;
//		判断i+1与k的大小
        if (i + 1 == k) {
            return tmp;
        } else if (i + 1 > k) {
            return quikSort(nums, low, i - 1, k);
        } else {
            return quikSort(nums, i + 1, high, k);
        }
    }
    public static void main(String[] args) {
        int[] nums = {4,0,1,0,2,3};
        int kmin = getKMin(nums,3);
        System.out.print(kmin);
    }
}
