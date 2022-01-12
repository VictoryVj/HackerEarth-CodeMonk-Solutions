/* 
	Author : @VijayNatarajan
*/

import java.util.*;
class TestClass
{
    public static void main(String args[] ) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int tCount,loop1;
        tCount = sc.nextInt();
        for (loop1=1;loop1<=tCount;loop1++)
        {
            int n,loop2;
            n = sc.nextInt();
            int arr[] = new int[n];
            for (loop2=0;loop2<n;loop2++)
            {
                arr[loop2] = sc.nextInt();
            }
            Arrays.sort(arr);
            int res=999999;
            for (loop2=0;loop2<n-1;loop2++)
            {
                res = Math.min(res, arr[loop2]^arr[loop2+1]);
            }
            System.out.println(res);
        }
    }
}