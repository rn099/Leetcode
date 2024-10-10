/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    const newSet = new Set();
    for (let num of nums){
        if(newSet.has(num)){
            return true;
        } else {
            newSet.add(num);
        }
    }
    return false;
};