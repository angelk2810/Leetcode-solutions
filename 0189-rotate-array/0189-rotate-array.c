void rotate(int* nums, int numsSize, int k) {
    k = k % numsSize;
    void reverse(int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    reverse(0, numsSize - 1);
    reverse(0, k - 1);
    reverse(k, numsSize - 1);
}
