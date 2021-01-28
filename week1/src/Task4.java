import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++)
            nums[i] = in.nextInt();
        moveZeros(nums);
       for(int j = 0;j < nums.length; j++)
           System.out.print(nums[j]+" ");
    }
    public static void moveZeros(int[] nums)
    {
        int zeroNum = 0;
        for(int i = 0 ;i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                zeroNum++;
            }
            else if(zeroNum != 0)
            {
                nums[i - zeroNum] = nums[i];
                nums[i] = 0;
            }
        }
    }
}