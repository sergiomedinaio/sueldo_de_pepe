public class ConBonoSobreElNeto extends Cadete implements IBonoSobreNeto{
    @Override
    public double bonoPorDesempenio() {
        return 0.1 * sueldoNeto();
    }
}
