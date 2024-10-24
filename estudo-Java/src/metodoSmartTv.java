public class metodoSmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar(){
        ligada = true;

    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        if(volume < 100){
            volume++;
            }
            
    }

    // Criar o metodo para diminuir o volume
    public void diminuirVolume(){
        if(volume > 0){
            volume--;
            }
            }
}
