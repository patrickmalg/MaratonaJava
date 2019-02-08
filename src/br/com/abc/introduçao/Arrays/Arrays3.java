package br.com.abc.introduçao.Arrays;

public class Arrays3 {
    public static void main(String[] args){
         int[] numeros = {1, 2 ,3 ,4 ,5}; //tamanha = 5; index = 0 até 4

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        int num = 0;
        for (int aux : numeros){
            System.out.println(num);
        }
    }
}
