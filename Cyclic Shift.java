/* 
	Author : @VijayNatarajan
*/


import java.util.*;

class TestClass
{
    public static void main(String args[] ) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int tCount = sc.nextInt();
        while(tCount-- > 0){
            int N; int K;
            N = sc.nextInt();
            K = sc.nextInt();
            String input = sc.next();
            String ch = "";
            String copy = input;
            int digit = 0;
            int p = -1;
            for(int i = 0; i < N;i++){
                

                if (ch.compareTo(copy) < 0){
                    ch = copy;
                    digit = i;
                    
                }else if (ch.compareTo(copy) == 0){
                    p = i - digit;
                    break;
                }
                copy = copy.substring(1, copy.length()) + copy.substring(0, 1);
            }
            if(p == -1){
                System.out.println(digit + (K - 1L ) * N);
            }else{
                System.out.println(digit + ((K - 1L) * p));
            }
        }
		}        
    }
//}
