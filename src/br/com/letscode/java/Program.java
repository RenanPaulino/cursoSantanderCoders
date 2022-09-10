package br.com.letscode.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.time.format.TextStyle;




public class Program {
    public static void main(String[] args){
        String nome = "Renan";

        LocalDate hoje = LocalDate.now(); // cria um objeto pra poder pegar dia da semana
        Locale Brasil = new Locale("pt","BR"); // defini a linguagem e o lugar de origem

        //informa o dia da semana já convertido par português
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Brasil));
        //add toda a informação ha uma varável do tipo String
        String diaDaSemana =  hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Brasil);

        LocalDateTime  agora = LocalDateTime.now();
        String saudacao;
        if (agora.getHour()>=0 && agora.getHour()<=12) {
            saudacao = "Bom dia!";
        } else if (agora.getHour()>12 && agora.getHour()<18) {
            saudacao = "Boa tarde!";
        } else {
            saudacao = "Boa noite!";
        }

        System.out.printf("Olá, %s  %s hoje é %s", nome, saudacao, diaDaSemana.toLowerCase());


    }
}
