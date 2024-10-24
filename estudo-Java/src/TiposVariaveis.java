public class TiposVariaveis {
    
    public static void main(String[] args) {
        // Tipos de variáveis em Java
        double salarioMinimo = 2300.50;
        int idade = 25;
        boolean estaTrabalhando = true;
        String nome = "João";
        

        // Tipos de variáveis que trabalham com números e com tamanhos diferentes na alocação de memória

        byte idadeDois = 25; //tipo de dado para números menores
        short ano = 2021; // alocação de memória baixa
        int cep = 2015145; // alocação de mémoria media
        long cpf = 1155526592; // alocação de memória maior
        float pi = 3.14F; // tipo de dado para números e letras
        double salario = 1450.70; //tipo de dado para números quebrados
        final int NUM_ALEATORIO = 50; // Quando colocamos "final", se torna uma constante e toda constante
                                      // deve ser escrita em caixa alta

        
        
        System.out.println("Idade dois: " + idadeDois);
        System.out.println("Ano: " + ano);
        System.out.println("Cep: " + cep);
        System.out.println("Cpf: " + cpf);
        System.out.println("Pi: " + pi);
        System.out.println("Salário: " + salario);
        System.out.println("Constante: "+ NUM_ALEATORIO);


    }
}
