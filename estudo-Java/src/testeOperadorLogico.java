public class testeOperadorLogico {
    public static void main(String[] args) {

        
        
        boolean testeUm = true;
        boolean testeDois = false;

        //Aqui comparamos se as duas condições são verdadeiras
        //Se as duas condições forem verdadeiras, irá imprimir a primeira
        // Se não for verdadeira, irá imprimir "Fim"

        if (testeUm && testeDois) {

            System.out.println("As duas condições são verdadeiras!");
            
        }
        System.out.println("Fim");


    //Aqui comparamos se uma das duas condições são verdadeiras

        if (testeUm || testeDois) {
            System.out.println("Uma das condições é verdadeira!");
            
        }
    }
}
