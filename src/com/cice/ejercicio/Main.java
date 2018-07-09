package com.cice.ejercicio;

import com.cice.ejercicio.empresa.Director;
import com.cice.ejercicio.empresa.Empleado;
import com.cice.ejercicio.empresa.Gerente;

public class Main {

    public static void main(String[] args) {



        Empleado empleado = new Empleado(1000, "Pedro", "04/05/1983");
        Gerente gerente = new Gerente(1000, "Antonio", "04/05/1983", "TIC");
        Director director = new Director(1000, "Gustavo", "04/05/1983", "TIC", "HSH1234");

        Empleado[] empleados = {empleado, gerente, director};

        for (Empleado emp : empleados) {
            System.out.println(emp.getNombre() + " " + emp.getSalario());
        }


        Empleado empleado1 = gerente;
        System.out.println(empleado1.getNombre());

        Gerente gerente1 = director;

        gerente1.incrementarSalario();






        /*
        System.out.println(empleado.getSalario());
        System.out.println(gerente.getSalario());
        System.out.println(director.getSalario());
*/
    }
}
