
import java.util.*;

public class TwoSum {
      
      public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                  nums[i] = scanner.nextInt();
            }

            int target = scanner.nextInt();

            int[] result = Solution.twoSum(nums, target);

            System.out.printf("Indices are %d\t%d",result[0],result[1]);
            
            scanner.close();
      }
}

class Solution {
      public static int[] twoSum(int[] nums, int target) {
          
          
          int[] arr = null;
          if(nums.length == 0){
              return arr;
          }
          
          arr = new int[2];
          HashMap<Integer,Integer> hm = new HashMap<>();
          
          for(int i=0;i<nums.length;i++){
              if(hm.containsKey(nums[i])){
                  arr[0] = hm.get(nums[i]);
                  arr[1] = i;
                  break;
              }
              else{
                  hm.put(target-nums[i],i);
              }
          }
          
          return arr;
      }
  }