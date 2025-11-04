
// /**
//  * @param {number[]} nums
//  * @return {number}
//  */

let number = [1, 1, 0, 1, 1, 1];
let c = 0;

var findMaxConsecutiveOnes = function(nums) {
    for(let num = 0; num < number.length; num++){
        if (indexOf(number[num]) == 0){
            console.log("Beginning of array");
        }else{
            if (number[num] == number[num - 1]){
            c++;
            }
        }
    }
    console.log(c);
};