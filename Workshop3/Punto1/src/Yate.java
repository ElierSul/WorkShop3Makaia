public class Yate extends Embarcacion {
    //Declarion variables
    private int camarotes;

    public Yate(Capitan capitan, double precioBase, int anioFabricacion, double valorAdicional, double eslora, int camarotes) {
        super(capitan, precioBase, anioFabricacion, valorAdicional, eslora);
        this.camarotes = camarotes;
    }
    //gettes y setter
    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

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

    public void lujoYate(){
        if(camarotes > 7){
            System.out.println("Es un yate de lujo, porque tiene mas de 7 camarotes");
        }else {
            System.out.println("No es un yate de lujo, porque no tiene 7 camarotes");
        }
    }
    //metodo to string para visualizar la informacion
    @Override
    public String toString() {

        return  super.toString() +
                "Yate{" +
                "camarotes=" + camarotes +
                '}';
    }
}
