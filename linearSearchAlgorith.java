public class linearSearchAlgorith{

    //returning index
    static int linearSearch(int[] nums, int target){
        if(nums.length==0){
            return -1;
        }

        for(int i=0;i<nums.length;i++){
            int element = nums[i];
            if(element==target){
                return i;
            }
        }

        return -1;
    }

    //returning element
    // returning integer.max_value because -1 can also be an element in the array
    static int linearSearch2(int[] nums, int target){
        if(nums.length==0){
            return Integer.MAX_VALUE;
        }

        for(int i=0;i<nums.length;i++){
            int element = nums[i];
            if(element==target){
                return element;
            }
        }

        return Integer.MAX_VALUE;
    }

    //returning true or false
    static boolean linearSearch3(int[] nums, int target){
        if(nums.length==0){
            return false;
        }

        for(int i=0;i<nums.length;i++){
            int element = nums[i];
            if(element==target){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int target = 4;
        int result = linearSearch(nums, target);
        int result2 = linearSearch2(nums, target);
        boolean result3 = linearSearch3(nums, target);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}