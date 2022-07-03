/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortedSquares = function(nums) {
    let a = 0;
    let b = nums.length-1;
    
    let arr = new Array(nums.length).fill(0);
    let index = arr.length-1;
    while(a<b){
        if(Math.pow(nums[a],2)>Math.pow(nums[b],2)){
            arr[index] = Math.pow(nums[a],2);
            a++;
        }else{
             arr[index] = Math.pow(nums[b],2);
            b--;
        }
        index--;
    }
if(index===0){
    arr[index] = Math.pow(nums[a],2);
}
    nums = arr;
    return nums;
};