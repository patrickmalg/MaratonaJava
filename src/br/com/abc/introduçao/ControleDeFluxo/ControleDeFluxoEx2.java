package br.com.abc.introduçao.ControleDeFluxo;

public class ControleDeFluxoEx2 {
    public static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade >= 15 && idade < 18 juvenil
        //idade >= 18 adulto
        int idade = 28;
        String categoria;
        if (idade < 15) {
            categoria = "Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Juvenil";
        }else{
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}