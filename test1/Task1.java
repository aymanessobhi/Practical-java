package test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        int[] nums = {3,1,4};
        int[] missingNumbers = findMissingNumbers(nums);
        System.out.println(Arrays.toString(missingNumbers));
    }

    public static int[] findMissingNumbers(int[] nums){
        List<Integer> missingNumbers = new ArrayList<>();
        //sort the input array
        Arrays.sort(nums);

        int n = nums.length;
        int expectedNum = 1; //start with the first expected number

        for(int i=0;i < n; i++){
            if(nums[i]==expectedNum){
                expectedNum++;
            } else if (nums[i] > expectedNum) {
                while(nums[i] > expectedNum){
                    missingNumbers.add(expectedNum);
                    expectedNum++;
                }
                expectedNum++;
            }
        }
        //convert the list of missing numbers to an array
        int [] missingNumbersArray = new int[missingNumbers.size()];
        for (int i=0;i<missingNumbersArray.length;i++){
            missingNumbersArray[i] = missingNumbers.get(i);
        }
        return missingNumbersArray;
    }
}
