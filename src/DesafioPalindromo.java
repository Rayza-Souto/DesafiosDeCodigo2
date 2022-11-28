//Neste desafio você deverá construir uma função que recebe uma String 
//e identifique se a mesma é um palíndromo, ou seja, se a String é igual a ela mesma invertida. 

import java.util.Scanner;

public class DesafioPalindromo {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        
        String invertida = new StringBuffer(palavra).reverse().toString(); //fazendo a inversão dos dados

        if(palavra.equals(invertida)){
             System.out.println("TRUE");
        }
        else 
            System.out.println("FALSE");
          //não é palindrome }

    }
}
