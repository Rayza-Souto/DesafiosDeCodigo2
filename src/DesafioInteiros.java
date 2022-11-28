//Dado um array inteiro nums, mova todos os inteiros pares no início do array
//seguido por todos os inteiros ímpares

import java.util.*;

public class DesafioInteiros {
    public static void main(String args[]) {
          
      Scanner input = new Scanner(System.in);
      int i, aux;
      int N = input.nextInt();
      int [] nums = new int[N];
      for (i = 0; i < N; i++)
          {
              nums[i] = input.nextInt();
          }
      for (i = 0; i < N; i++)
      { if (nums[i] % 2 != 0){
              for (int j = (i+1); j < N; j++)
              {   if (nums[j] % 2 == 0) {
                  aux = nums[i];
                  nums[i] = nums[j];
                  nums[j] = aux;
                  j = N;
                  }
              }
          }
      }
      for (i = 0; i < N; i++)
      {System.out.println(nums[i]);}
     }
     
}
