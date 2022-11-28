// Desafio
// Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n.

import java.util.*;

public class DesafioQuadradosPerfeitos {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        int[] d = new int[n + 1];
        int res, count, countTotal;

        //TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.

        for (int i = 1; i < d.length; i++) {
            if (i * i <= n) {
                d[i] = i * i;
            } else {
                i = d.length - 1;
            }
        }
        countTotal = 1000;
        for (int i = d.length - 1; i> 0 && i <= n; i--) {
            if (i >0 && d[i] > 0) {
                res = n;
                count = 0;
                for (int j = i; j > 0; j--) {
                    while (res > 0) {
                        if (res >= d[j]) {
                            res = res - d[j];
                            count++;
                        } else {
                            j--;
                        }
                    }
                }                
                if (countTotal > count) {
                    countTotal = count;
                }
            }            
        }
        System.out.println(countTotal);
    }
    
}
