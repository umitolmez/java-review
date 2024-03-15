import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] myArray = {2,7,9,11};
        System.out.println(Arrays.toString(twoSum1(myArray, 9)));

        System.out.println(Arrays.toString(twoSum2(myArray, 9)));
    }

    //brute force solution
    public static int[] twoSum1(int[] array, int target){

        for(int i=0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++){
                if((array[i]+array[j])==target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{};
    }

    //my optimal solution O(n)
    public static int[] twoSum2(int[] array, int target){
        //create hashMap
        Map<Integer, Integer> map = new HashMap<>();
        //iterate over the array. if the potential match exist return that indices else put the array value and index
        for(int i=0; i<array.length; i++){

            int potentialMatch = target - array[i];

            if(map.containsKey(potentialMatch)){
                return new int[]{i, map.get(potentialMatch)};
            }else{
                map.put(array[i], i);
            }
        }
        return new int[]{}; //
    }
}
