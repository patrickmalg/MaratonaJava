package br.com.abc.introduçao.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "Rafael";
        nomes[2] = "Goku";
        //length ira retornar o tamanho do array
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
