package br.com.abc.introduçao.ControleDeFluxo;

public class ControleDeFluxoEx5 {
    public static void main(String[] args){
        /*
        Imprima todos os numeros pares de 0 a 100.000
         */
        int valor = 100000;
        for (int i=0; i<=valor; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
