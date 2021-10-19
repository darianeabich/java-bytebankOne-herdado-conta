package br.com.bytebankone.bytebankOneHerdadoConta.teste;

public class TesteString {
    public static void main(String[] args) {
        int a = 3;

        String vazio = "  Alura  ";
        String outroVazio = vazio.trim();

        System.out.println(vazio.contains("Alu"));
        System.out.println(vazio);
        System.out.println(outroVazio);

        String nome = "Alura"; // objeto literal
//        String outroNome = new String("Alura");
//
//        char c = 'A';
//        char d = 'a';
//
//        String novoNome = nome.replace(c, d);
//        String novoNome = nome.toUpperCase();
//        System.out.println(nome);
//        System.out.println(novoNome);

//        char c = nome.charAt(2);
//        System.out.println(c);

//        int pos = nome.indexOf("ur");
//        System.out.println(pos);

//        String sub = nome.substring(1);
//        System.out.println(sub);

        System.out.println(nome.length());

        for (int i = 0; i < nome.length(); i++){
            System.out.println(nome.charAt(i));
        }
    }
}
