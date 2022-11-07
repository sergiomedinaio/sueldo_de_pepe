public class ConBonoFijo extends Cadete implements IBonoPorDesempenio{
    Cadete trabajador;
    ConBonoFijo(Cadete trabajador) {
        this.trabajador = trabajador;
    }

    @Override
    public double bonoPorDesempenio() {
        return 80;
    }
}
