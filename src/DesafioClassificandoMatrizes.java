

import java.util.*;

public class DesafioClassificandoMatrizes {

    public static void main(String args[]) {
          
        Scanner input = new Scanner(System.in);
         int i, aux;
         int N = input.nextInt();
           int [] nums = new int[N];
             for (i = 0; i < N; i++)
             {
                 nums[i] = input.nextInt();
             }

       for (int j = (i+1); j < N; j++) {
         if (nums[i] % 2 != 0) {

           aux = nums[i] = nums[i] ^ nums[j] ^ (nums[j] = nums[i]);
           
         }
       }
   
       for (i = 0; i < N; i++) {
        {System.out.println(nums[i]);}
       
       }
     }
}
