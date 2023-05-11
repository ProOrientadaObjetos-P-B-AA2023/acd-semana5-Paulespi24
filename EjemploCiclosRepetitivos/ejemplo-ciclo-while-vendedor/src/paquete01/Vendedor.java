/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Vendedor {

    private String nombres;
    private int edad;
    private double pagoMensual;
    private double salarioMinimo;
    private int numeroAutos;
    private double comisionPorAuto;

    public Vendedor(String nombres, int edad, double salarioMinimo, int numeroAutos, double comisionPorAuto) {
        this.nombres = nombres;
        this.edad = edad;
        this.salarioMinimo = salarioMinimo;
        this.numeroAutos = numeroAutos;
        this.comisionPorAuto = comisionPorAuto;
    }

    public void establecerNombres(String c) {
        this.nombres = c;
    }

    public void establecerEdad(int c) {
        this.edad = c;  
    }

    public void calcularPagoMensual() {
        pagoMensual = obtenerSalarioMinimo()
                + (obtenerComisionPorAuto() * obtenerNumeroAutos());
    }

    public void establecerSalarioMinimo(double s) {
        salarioMinimo = s;
    }

    public void establecerNumeroAutos(int s) {
        numeroAutos = s;
    }

    // comisionPorAuto;
    public void establecerComisionPorAuto(double s) {
        comisionPorAuto = s;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public int obtenerEdad() {
        return edad;
    }

    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    public double obtenerSalarioMinimo() {
        return salarioMinimo;
    }

    public int obtenerNumeroAutos() {
        return numeroAutos;
    }

    public double obtenerComisionPorAuto() {
        return comisionPorAuto;
    }
}
