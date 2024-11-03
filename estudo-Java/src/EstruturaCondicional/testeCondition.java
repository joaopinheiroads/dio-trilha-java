package EstruturaCondicional;
public class testeCondition {
    
    public static void main(String[] args) {

        double saldo = 25;
        double ValorSolicitado = 17;

        //Condição simples

        if(ValorSolicitado<saldo){
            saldo = saldo - ValorSolicitado;
            System.out.println("Saque realizado com sucesso, seu saldo agora é: "+saldo);
        }
        
    }
}
