/*

Write a function that reverses a string. The input string is given as an array of characters char[].
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

*/

class Solution {
    public void reverseString(char[] s) {
        int lp =0,rp = s.length-1;
        while(lp<rp){
            char temp = s[lp];
            s[lp] = s[rp];
            s[rp] = temp;
            lp++;
            rp--;
        }
    }
}
