
// /**
//  * @param {number[]} nums
//  * @return {number}
//  */

let number = [1, 1, 0, 1, 1, 1];
let c = 0;

// var findMaxConsecutiveOnes = function(number) {
//     for(let i = 0; i < number.length; i++){
//         // if (i == 0){
//         //     console.log("Beginning of array");
//         // }else{
//         //     if (number[i] == number[i - 1]){
//         //     c++;
//         //     }
//         // }
//         if(number[i]){
//             c++;
//         }
//     }
//     return c;
// };

function run(number) {
    for(let i = 0; i < number; i++){
        // if (i == 0){
        //     console.log("Beginning of array");
        // }else{
        //     if (number[i] == number[i - 1]){
        //     c++;
        //     }
        // }
        c++;
    }
    return c;
}

run();
