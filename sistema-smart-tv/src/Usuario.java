
public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();


        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        // Métodos que manipulam os estados da smartTV.

        smartTv.ligar();
        System.out.println("Novo Status - TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status - TV ligada ? " + smartTv.ligada);

    }
}
