import java.util.Arrays;
import java.util.Scanner;

public class Hwork2 {
    public  static  void main (String[] args) {
        System.out.println("请输入目标数组");
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        String[] strArray = inputStr.split(" ");
        int[] nums = new int[strArray.length];
        for(int i = 0;i < nums.length;i++) {
            nums[i] = Integer.parseInt(strArray[i]);
        }
        System.out.println("请输入目标和");
        Scanner sc = new Scanner(System.in);
        int tagret = sc.nextInt();
        twoSum(nums,tagret);
        System.out.println(Arrays.toString(twoSum(nums,tagret)));
    }
    public static int[] twoSum(int[] nums,int target){
        for (int i=0 ; i<nums.length ; i++) {
            for (int j=i+1 ; j<nums.length ; j++) {
                if(nums[j] == target - nums[i]&&nums[j] != nums[i]){
                    return new int[]{j,i};
                }
            }
        }
        return nums;
    }
}
