public class Main {
    public static void main(String[] args) {
        ConBonoFijo pepe = new ConBonoFijo(new Cadete());
        System.out.println(pepe.sueldoNeto());
        System.out.println(pepe.sueldoPresentismo(1));
        System.out.println(pepe.bonoPorDesempenio());
    }
}
