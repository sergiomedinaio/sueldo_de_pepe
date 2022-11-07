public class Main {
    public static void main(String[] args) {
        ConBonoSobreElNeto pepe = new ConBonoSobreElNeto(new Cadete());
        System.out.println(pepe.sueldoNeto());
        System.out.println(pepe.sueldoPresentismo(1));
        System.out.println(pepe.bonoPorDesempenio());
    }
}
