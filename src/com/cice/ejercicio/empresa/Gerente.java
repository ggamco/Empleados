package com.cice.ejercicio.empresa;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(double salario, String nombre, String fechaNacimiento, String departamento) {
        super(salario, nombre, fechaNacimiento);
        this.departamento = departamento;
        this.incrementarSalario();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public void incrementarSalario(){
        this.setSalario(this.getSalario()*1.05);
    }

    /*
    public void incrementarSalarioOpcionB(double salario){
        this.setSalario(salario*1.05);
    }

    public double incrementoSalarioOpcionC(double salario) {
        return salario*0.05;
    }

    public double salarioIncrementadoOpcionD(double salario) {
        //return salario + (salario*0.05);
        return salario * 1.05;
    }
    */












}
