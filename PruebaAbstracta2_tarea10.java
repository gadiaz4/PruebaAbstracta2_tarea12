package pruebaabstracta2_tarea10;
/**
 *
 * @author Gabriel Díaz
 * @author Israel Enríquez
 */
abstract class Gasolina {

    private String tipoGasolina;
    private double tEvaporacion;
    private double vInicial;
    private double vFinal;
    private double vEvaporado;

    public Gasolina(String tipoGasolina, double tEvaporacion, double vInicial, double vFinal, double vEvaporado) {

        this.tipoGasolina = tipoGasolina;
        this.tEvaporacion = tEvaporacion;
        this.vInicial = vInicial;
        this.vFinal = vFinal;
        this.vEvaporado = vEvaporado;
    }

    public void ExaminarMuestra() {
        System.out.println("El volumen inicial es: " + vInicial + "\n El volumen"
                + " final es " + vFinal);
    }

    public double CalcularVolumenMuestra() {
        System.out.println("Calcular el volumen evaporado de la muestra");
        return 0.0;
    }

    public String toString() {
        return tipoGasolina + "" + tEvaporacion + "" + vInicial + "" + vFinal + "" + vEvaporado;

    }

    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public double getTEvaporacion() {
        return tEvaporacion;
    }

    public double getVInicial() {
        return vInicial;
    }

    public double getVFinal() {
        return vFinal;
    }

    public void setVFinal(double reciente) {
        vFinal = reciente;
    }

    public double getVEvaporado() {
        return vEvaporado;
    }

    public void setVEvaporado(double nuevo) {
        vEvaporado = nuevo;
    }
}

class GasolinaPremium extends Gasolina {

    private double gasolinaPremium;

    public GasolinaPremium(String tipoGasolina, double tEvaporacion,
            double vInicial, double vFinal, double vEvaporado) {
        super(tipoGasolina, tEvaporacion, vInicial, vFinal, vEvaporado);
        setGasolinaPremium(gasolinaPremium);
    }

    public void ExaminarMuestra() {

        System.out.println("Examinando la muestra  " + getTipoGasolina() + " siendo una gasolina "
                + "premium de: " + getGasolinaPremium() + " octanos"
                + "\nSe evapora "+getVEvaporado()+" litros, del volumen inicial "+getVInicial()+" litros"
                +" a "+getTEvaporacion()+" grados celcius" + "\nQuedandonos: "+getVFinal()+" litros");
    }

    public double getGasolinaPremium() {
        return gasolinaPremium;
    }

    public void setGasolinaPremium(double reciente) {
        if (reciente < 92) {
            gasolinaPremium = reciente + 93;
        }
    }

    public double CalcularVolumenMuestra() {
        System.out.println("Elvolumen evaporado en la gasolina tipo: " + getTipoGasolina());
        return gasolinaPremium ;
    }
}

class GasolinaConvencional extends Gasolina {

    private double gasolinaConvencional;

    public GasolinaConvencional(String tipoGasolina, double tEvaporacion,
            double vInicial, double vFinal, double vEvaporado) {
        super(tipoGasolina, tEvaporacion, vInicial, vFinal, vEvaporado);
        setGasolinaConvencional(gasolinaConvencional);
    }

    public void ExaminarMuestra(){

        System.out.println("Examinando la muestra  " + getTipoGasolina() + " siendo una gasolina "
                + "convencional de:" + getGasolinaConvencional() + " octanos"
                + "\nSe evapora "+getVEvaporado()+" litros, del volumen inicial "+getVInicial()+" litros"
                +" a "+getTEvaporacion()+" grados celcius" + "\nQuedandonos: "+getVFinal()+" litros");
    }
    public double getGasolinaConvencional(){
        return gasolinaConvencional;
    }
    public void setGasolinaConvencional(double reciente){
        if(reciente < 92)
            gasolinaConvencional=reciente +85;
    }
    public double CalcularVolumenMuestra(){
        System.out.println("Elvolumen evaporado en la gasolina tipo: " + getTipoGasolina());
        return gasolinaConvencional ;
}
}

public class PruebaAbstracta2_tarea10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\t\t\t UNIVERDIDAD DE LAS FUERZAS ARMADAS ");
        System.out.println("Docente: Ing. Luis Alberto Guerra Cruz");
        System.out.println("Asignatura:Programacion (7450)");
        System.out.println("Integrantes:   Diaz Gabriel");
        System.out.println("\t       Enriquez Israel");
        System.out.println("Tema:Abstraccion");
        System.out.println("");

        GasolinaPremium muestra1 = new GasolinaPremium("Tipo1", 10, 21.2,15.2, 6.0);
        GasolinaPremium muestra2 = new GasolinaPremium("Tipo2" ,10,15.5 ,5.1,10.4);
        GasolinaConvencional muestra3 = new GasolinaConvencional("Tipo3", 10, 18.3, 12.1, 6.2);
        GasolinaConvencional muestra4 = new GasolinaConvencional("Tipo4",10, 13.8, 10.0,3.8);

        System.out.println("Analizando las muestras tenemos los siguientes datos:\n");
        System.out.println("Muestra 1");
        muestra1.ExaminarMuestra();
        System.out.println("Muestra 2");
        muestra2.ExaminarMuestra();
        System.out.println("Muestra 3");
        muestra3.ExaminarMuestra();
        System.out.println("Muestra 4");
        muestra4.ExaminarMuestra();

    }

}
