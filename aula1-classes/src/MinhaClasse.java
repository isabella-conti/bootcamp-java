public class MinhaClasse {
    
// public static void main (String [] args) {
//     System.out.print ("Olá turma, sejam bem-vindos");

// // }
// public static void main(String[] args) {
//     //tipo + nome bem definido + valor correspondente//

//     String meuNome = "Isabella";

//     int anoFabricacao = 2003;

//     boolean verdadeira = false;

//     //manipulação->mudou o valor//
//     anoFabricacao = 2020;

//     System.out.print (anoFabricacao);

// }

public static void main (String [] args) {
    String primeiroNome = "Isabella";
    String segundoNome = "Conti";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
}    


public static String nomeCompleto (String primeroNome, String segundoNome) {
    return "Resultado do método " + primeroNome.concat(" ").concat(segundoNome);
}

}
