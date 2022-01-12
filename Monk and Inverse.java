import java.util.*;

class TestClass
{
    public static void main(String args[] ) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int tCount = sc.nextInt();
        while (tCount != 0){

            int N = sc.nextInt();
            int[][] a = new int[N][N];
            for (int loop = 0; loop < N; loop++){
                for (int j = 0; j < N; j++){
                    a[loop][j] = sc.nextInt();
                }
            }

            int inverse = 0;

            for (int loop = 0; loop < N; loop++){
                for (int loop1 = 0; loop1 < N; loop1++){
                    for (int loop2 = 0; loop2 <= loop; loop2++){
                        for (int loop3 = 0; loop3 <= loop1; loop3++){
                            if (a[loop][loop1] < a[loop2][loop3]){
                                inverse++;
                            }
                        }
                    }
                }
            }

            System.out.println(inverse);

            tCount--;
        }  
    }
}
