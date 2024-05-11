package edu.isabella.terceira_semana;

public class Operadores {

    // Atribuição -> declarar o valor da variável/alterar

    // Aritméticos -> realizar operações matemáticas etre valores numéricos
    public static void main(String[] args) {
        double soma = 12 + 13.4;
        System.out.println(soma);
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        // unir o conteúdo de duas strings

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "2" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "2" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "2" + 1 + "3";
        System.out.println(concatenacao);
        concatenacao = "5" + (1 + 1 + 1);
        System.out.println(concatenacao);

        // Unários -> aplicados com outro operdor aritmetico: incrementar, inverter
        // valores numericos e booleanos

        // (+) Operador unário de valor positivo – números são positivos sem esse
        // operador explicitamente;

        // (-) Operador unário de valor negativo – nega um número ou expressão
        // aritmética;

        // (++) Operador unário de incremento de valor – incrementa o valor em 1
        // unidade;

        // (--) Operador unário de decremento de valor – decrementa o valor em 1
        // unidade;

        // (!) Operador unário lógico de negação – nega o valor de uma expressão
        // booleana.

        int numero = 5;
        numero = -numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        numero++;
        System.out.println(numero);

        System.out.println(++numero);

        numero--;
        System.out.println(numero);

        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);

        variavel = !variavel;
        System.out.println(variavel);

        // Ternário
        // O operador de condição ternária é uma forma resumida para definir uma
        // condição e escolher por um dentre dois valores. Você deve pensar numa
        // condição ternária, como se fosse uma condição IF normal, porém, de uma forma
        // em que toda a sua estrutura estará escrita numa única linha.

        // O operador ternário é representado pelos símbolos "?" e ":" utilizados na
        // seguinte estrutura de sintaxe:

        // <Expressão Condicional>``
        // ?
        // ``<Caso condição seja true>``
        // :
        // ``<Caso condição seja false>

        int a, b, c, d;

        a = 5;
        b = 6;
        c = 7;
        d = 7;
        String resultado = "";
        String resultado2 = "";

        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println(resultado);
        // USANDO TERNÁRIO - EXPRESSÃO BOOLEANA
        resultado2 = c == d ? "verdadeiro" : "falso";
        System.out.println(resultado2);

        // Relacionais
        // Os operadores relacionais, avaliam a relação entre duas variáveis ou
        // expressões. Neste caso, mais precisamente, definem se o operando à esquerda é
        // igual, diferente, menor, menor ou igual, maior, maior ou igual ao da direita,
        // retornando um valor booleano como resultado.

        // == Quando desejamos verificar se uma variável é IGUAL A outra.

        // != Quando desejamos verificar se uma variável é DIFERENTE da outra.

        // > Quando desejamos verificar se uma variável é MAIOR QUE a outra.

        // >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

        // < Quando desejamos verificar se uma variável é MENOR QUE outra.

        // <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
        int numero1 = 1;
        int numero2 = 2;

        if (numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if (numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if (numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if (numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if (numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

        String nomeUm = "Isabella";
        String nomeDois = "Isabella";

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));

        if (nomeUm == nomeDois) {
            System.out.println("Confere");

        }

        // Lógicos
        // Os operadores lógicos, representam o recurso que nos permite criar expressões
        // lógicas maiores, a partir da junção de duas ou mais expressões.

        // && Operador Lógico "E"

        // || Operador Lógico "OU"

        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");
        ;

        if (condicao1 || condicao2)
            System.out.print("Uma das condições é verdadeira");

    }

}
