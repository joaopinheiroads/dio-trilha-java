public class InicioAula {
    public static void main(String[] args) {
        
        System.out.println("Olá turma, sejam bem vindos!");


        //Exemplo de váriavel que tem como alterar seu valor:
        String BR = "Brasil";
        BR = "Brazil";


        // Exemplo de váriavel que NÃO tem como alterar seu valor:    
        final String EUA = "USA";
        

        System.out.println(BR);
        System.out.println(EUA);

        String primeiroNome = "João";
        String segundoNome = "Pinheiro";
        String nomeCompleto = juntarNome(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    

    }



//Public:           diz que a classe é acessível, ou seja, pública
// MinhaClasse:     nome da classe
// {}:              Bloco de código, ou argumentos
// void:            Diz para o programa nao retornar nenhum valor
// main:            Coloca como principal método, é o ponto de entrada da aplicação

//String[] args:    Este parâmetro representa um array de strings que pode conter argumentos passados 
//                  para o programa via linha de comando. 
//                  Quando você executa uma aplicação Java no terminal, pode fornecer argumentos para o método main,
//                  que são recebidos e processados aqui.

//                  Obs: todos arquivos Java podem começar com letra maiúscula "NomeDoArquivo.java"
//                  Obs: Toda classe deve possuir o mesmo nome do arquivo. Ou seja, se o nome do seu arquivo 
//                  for "MinhaClasse.java", a classe deve ser "MinhaClasse".


//                  Ao declarar variavéis podemos utilizar em seus nomes a convenção UpperCase, ou, CamelCase.
//                  UpperCase: MINHA_VARIAVEL       camelCase: minhaVariavel

//                  Tipos de variáveis: String, Double e int.



                  

                public static String juntarNome(String primeiroNome, String segundoNome){

                    return "Resultado do método " +primeiroNome.concat( " ").concat(segundoNome);

                        // Criação de método para concatenar duas variáveis
                }




     
    
}