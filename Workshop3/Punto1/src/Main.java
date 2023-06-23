public class Main {
    public static void main(String[] args) {

        Capitan capitan = new Capitan("Elier","peña","2309da");
        Velero velero = new Velero(capitan,10000,2023,4000,5,4);
        Capitan capitan2 = new Capitan("Mauricio","valencia","58g90");
        Yate yate = new Yate(capitan2,2000,2015,5000,6,7);

        System.out.println("Está es la información del yate");
        System.out.println(yate.toString());
        System.out.println(" ");
        yate.lujoYate();
        System.out.println(" ");
        System.out.println("El valor final del yate es: " + yate.montoAlquiler());

        System.out.println("***********************************");

        System.out.println("Está es la información del velero");
        System.out.println(velero.toString());
        System.out.println(" ");
        velero.tamanioVelero();
        System.out.println(" ");
        System.out.println("El valor final del velero es: " + velero.montoAlquiler());


    }
}