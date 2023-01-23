package programs;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};

        twoSumE(arr,7);
    }

    static int[] twoSumE(int[] nums, int target) {
        // this is o(n^2) , how can you improve
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                System.out.println("  "+ nums[j]);
            }
            System.out.println("--------------");
        }

        return  null;
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { j, i };
                }
            }
        }
        return null;
    }
}

