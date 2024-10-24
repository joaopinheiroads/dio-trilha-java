public class ExemploBoletimEstudantil {

    public static void main(String[] args) {
        int mediaFinal = 6;

        // Verifica a media final
        if(mediaFinal < 6)
            System.out.println("REPROVADO");
        else if(mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");

        // Array de emails
        String[] entradaEmail = {"joao@gmail.com", "lucas@gmail.com"};

        // Itera sobre os emails e exibe
        for(String mostrarEmail : entradaEmail) {
            System.out.println(mostrarEmail(mostrarEmail)); // Chama o método para cada email
        }
    }

    // Método para retornar um email válido (ou o que você quiser fazer com o email)
    public static String mostrarEmail(String entradaEmail) {
        return entradaEmail;  // Retorna o email que foi passado como parâmetro
    }
}
