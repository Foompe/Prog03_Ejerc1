package org.example.ejercicioFecha;

public class Fecha {


    //Declaramos un fichero de la clase para los meses
    public enum enumMes {
        Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto,
        Septiembre, Octubre, Noviembre, Diciembre
    }

    //Atributos
    private int dia;
    private enumMes mes;
    private int ano;

    //implementamos un constructor que inicializa el mes por parametro y el resto de atributos a 0
    public Fecha(enumMes mes){
        this.dia = 0;
        this.mes = mes;
        this.ano = 0;
    }


    //inicializamos un constructor con todos los atributos
    public Fecha(int dia, enumMes mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    //Creamos los getter y setter para los datos
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public enumMes getMes() {
        return mes;
    }

    public void setMes(enumMes mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    //Implementamos un metodo, que deuelva true  si el valor de verano es falso
    public boolean isSummer() {
        return mes == enumMes.Junio || mes == enumMes.Julio || mes == enumMes.Agosto;
    }

    //implementa metodo qye devuelva una cadena con la fecha en formato largo
    public String toString() {
        return dia + " de " + mes.toString() + " de " + ano;
    }
}
