public class ConBonoSobreElNeto extends Cadete implements IBonoPorDesempenio{
    Cadete trabajador;
    ConBonoSobreElNeto(Cadete trabajador) {
        this.trabajador = trabajador;
    }
    @Override
    public double bonoPorDesempenio() {
        return 0.1 * trabajador.sueldoNeto();
    }
}
