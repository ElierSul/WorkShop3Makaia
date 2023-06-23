public  abstract  class Embarcacion {

    //Declaracion variable
    private Capitan capitan;

    private double precioBase;
    private int anioFabricacion;
    private double valorAdicional;
    private double eslora;

    //Constructor
    public Embarcacion(Capitan capitan, double precioBase, int anioFabricacion, double valorAdicional, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.anioFabricacion = anioFabricacion;
        this.valorAdicional = valorAdicional;
        this.eslora = eslora;
    }

    public abstract double montoAlquiler();
    //gettes y setter
    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }
    //metodo to string para visualizar la informacion
    @Override
    public String toString() {
        return "Embarcacion{" +
                "capitan=" + capitan +
                ", precioBase=" + precioBase +
                ", anioFabricacion=" + anioFabricacion +
                ", valorAdicional=" + valorAdicional +
                ", eslora=" + eslora +
                '}';
    }
}
