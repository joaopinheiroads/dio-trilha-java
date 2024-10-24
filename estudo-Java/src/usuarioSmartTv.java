public class usuarioSmartTv {

    public static void main(String[] args) {


        
        metodoSmartTv metodoSmartTv = new metodoSmartTv();

        System.out.println("TV ligada?" + metodoSmartTv.ligada);
        System.out.println("Qual volume?" + metodoSmartTv.volume);
        System.out.println("Qual canal?" + metodoSmartTv.canal);

        


        //Aqui vou chamar o método ligar
        metodoSmartTv.ligar();

        System.err.println("Novo status: " + metodoSmartTv.ligada);

        metodoSmartTv.aumentarVolume();
        metodoSmartTv.aumentarVolume();
        metodoSmartTv.aumentarVolume();
        System.out.println("Volume: " + metodoSmartTv.volume);

        
        metodoSmartTv.diminuirVolume();
        System.out.println("Volume: " + metodoSmartTv.volume);


        
        

    }
    
}
