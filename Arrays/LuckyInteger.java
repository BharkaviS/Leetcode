/*

Find Lucky Integer in an Array
Given an array of integers arr, 
a lucky integer is an integer which has a frequency in the array equal to its value.

Return a lucky integer in the array. 
If there are multiple lucky integers return the largest of them. 
If there is no lucky integer return -1.

*/
class LuckyInteger {
    public int findLucky(int[] arr) {
        int i,luckInt=0;
        int max=0,flag =0;
        for(i=0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        int[] count = new int[max+1];
        for(i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(i=0;i<arr.length;i++){
            if(count[arr[i]]==arr[i] && luckInt < arr[i]){
                luckInt = arr[i];
                flag = 1;
            }
        }
        if(flag ==0){
            return -1;
        }
        else{
            return luckInt;
        }
    }
}
