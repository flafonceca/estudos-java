public class Variaveis {
    // Execução do nosso programa JAVA
    public static void main (String [] args) {
        System.out.println("Hello, World!"); //equivale ao console.log
     //Variáveis no JAVA
        //fortemente tipado o estaticamente tipado
        int idade = 20; //inteiro
        double salario = 4500.99; // dupla precisão
        float nota = 7.5f; //sufixo para float
        long populacaoTerra = 7_900_000_000L;
        boolean tarefaConcluida = false; //(true ou false)
        int i = 1, j=0, k=1000; //multiplas variáveis
        String nomeCompleto = "Flávia Fonceca"; //sempre aspas duplas

        //aspa simples armazena um caractere

        int teste = 10;
        teste = 9; //retribuição de variáveis

        final int teste2 = 200; // impossível mudar o valor
        //teste2 = 1000;

        //Operadores
        int a =10;
        int b=5;

        int soma =a+b;

        int sete = 7;
        int dois = 2;
        double dois2 = 2.0;
        double resultado = sete/dois; // 3.0
        System.out.println(resultado);
        double resultado2 = sete / dois2; //3.5 //pelo menos um valor tem que ser double para dar double no resultado
        System.out.println(resultado2);

        //Math
        double x = Math.sqrt(144); //22
        double y = Math.pow(5,2); //25
        System.out.println(Math.PI);
        //Casting != converter a variavel
        int pi2 = (int) Math.PI;
        System.out.println(pi2);

        double resultado3 = sete / (double) dois;

        //operadores 2
        int valor = 5;
        valor ++;
        valor --; //decremento -1
        valor += 10; //valor = valor + 10

        //Operadores relacionais
        boolean teste1=5>1; //true
        boolean teste3=5<1; //false
        boolean teste4=5==5; //true
        boolean teste5=5!=1; //true
        boolean teste6=6>=6; //true
        boolean teste7=5<=9; //true

        //Operadores lógicos
        boolean teste8 = true && false; //false
        boolean teste9 = true || false;




    }
}
