package org.example.ejercicioFecha;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {

    //Primera prueba

        //instanciamos un objeto
    Fecha objFecha1 = new Fecha(Fecha.enumMes.Agosto);

    //asignamos valores a los atributos
    objFecha1.setDia(16);
    objFecha1.setAno(1993);

        //Imprimimos en pantalla
        System.out.println("\nPrimera fecha, inicializada con el primer constructor");
        System.out.println("La fecha es: " + objFecha1);
        System.out.println(objFecha1.isSummer() ? "Es verano." : "No es verano.\n");

    //Segunda prueba

      // Instanciamos un segundo objeto:
      Fecha objFecha2 = new Fecha(15, Fecha.enumMes.Julio, 2015);

      //Mostramos en pantalla
        System.out.println("\nSegunda fecha, inicializada con el segundo constructor");
        System.out.println("La fecha 2 contiene el año " + objFecha2.getAno());
        System.out.println("La fecha es: " + objFecha2);
        System.out.println(objFecha2.isSummer() ? "Es verano." : "No es verano.\n");
    }
}