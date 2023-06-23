public class Velero extends Embarcacion{
    //Declaracion variable
    private int mastiles;
    //constructor
    public Velero(Capitan capitan, double precioBase, int anioFabricacion, double valorAdicional, double eslora, int mastiles) {
        super(capitan, precioBase, anioFabricacion, valorAdicional, eslora);
        this.mastiles = mastiles;

    }
    //metodo para calcular el monto final del alquiler
    @Override
    public double montoAlquiler() {
        //double monto = 20000 ++;
        if(super.getAnioFabricacion()>2020){
            double monto = 20000 + super.getValorAdicional()+ super.getPrecioBase();
            //super.setValorAdicional(20000);
            return monto;
        }else {
            double monto = super.getValorAdicional()+ super.getPrecioBase();
            return monto;
        }

    }
    //metodo para definir el tamaño del velero
    public void tamanioVelero(){
        if(mastiles > 4){
            System.out.println("Es un velero grande, ya que tiene más de 4 mastiles");
        }else{
            System.out.println("Es un velero pequeño, ya que tiene menos de 5 mastiles");
        }

    }
    //metodo to string para visualizar la informacion
    @Override
    public String toString() {
        return super.toString() +
                "Velero{" +
                "mastiles=" + mastiles +
                '}';
    }
}
