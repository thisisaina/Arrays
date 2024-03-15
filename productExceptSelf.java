class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] answer = new int[size];
        for (int i = size - 1; i > -1; i--) {
            if (i == size - 1)
                answer[i] = nums[i];
            else
                answer[i] = nums[i] * answer[i + 1];
        }
        int prefixProduct = 1;
        for (int j = 0; j < size; j++) {
            int updatedValue = prefixProduct * ((j + 1 < size) ? answer[j + 1] : 1);
            answer[j] = updatedValue;
            prefixProduct *= nums[j];
        }
        return answer;
    }
}

//OR

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] answer = new int[size];
        for (int i = size - 1; i > -1; i--) {
            if (i == size - 1)
                answer[i] = nums[i];
            else
