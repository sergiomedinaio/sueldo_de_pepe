public abstract class Trabajador {
    public abstract int sueldoNeto ();

    public int sueldoPresentismo() {
        return 100;
    }
    public int sueldoPresentismo(int diasAusentes) {
        if(diasAusentes == 0) return sueldoPresentismo();
        if(diasAusentes == 1) return 50;
        return 0;
    }
}
