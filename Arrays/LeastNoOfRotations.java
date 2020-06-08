/*

Given a sorted array A of size N. The array is rotated 'K' times. Find the value of 'K'. The array may contain duplicate elements.

Example:
Input
2
5
5 1 2 3 4
5
1 2 3 4 5
Output
1
0

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static int rotate(int[] a ,int n){
        int sp=0,flag =0,count=0;
        while(sp<n-1){
            if(a[sp]>a[sp+1]){
                return sp+1;
            }
            sp++;
        }
        return 0;
    }
	public static void main (String[] args) {
		int t,n,i,c;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t>0){
		    n = sc.nextInt();
		    int[] a = new int[n];
		    for(i=0;i<n;i++){
		        a[i] = sc.nextInt();
		    }
		    c = rotate(a,n);
		    System.out.println(c);
		    t--;
		}
	}
}
