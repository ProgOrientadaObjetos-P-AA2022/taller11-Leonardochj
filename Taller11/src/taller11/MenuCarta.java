/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author Usuario
 */
public class MenuCarta extends Menu {

    private double valorPorcionGuarnicion;
    private double valorBebida;
    private int porcentajeAdicional;

    public MenuCarta(String f, double h, double b, double c, int e) {
        super(f, h);
        valorPorcionGuarnicion = b;
        valorBebida = c;
        porcentajeAdicional = e;
    }

    public void establecerPorcionGuarnicion(double c) {
        valorPorcionGuarnicion = c;
    }

    public void establecerValorBebida(double c) {
        valorBebida = c;
    }

    public void establecerPorcentajeAdicional(int c) {
        porcentajeAdicional = c;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = (valorPorcionGuarnicion + valorBebida)
                + ((valorInicialMenu * porcentajeAdicional) / 100);
    }

    public double obtenerPorcionGuarnicion() {
        return valorPorcionGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public int obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre del plato: %s\n"
                + "Valor inicial del menu: %.2f\n"
                + "Valor de la porcion guarnicion: %.2f\n"
                + "Valor de la bebida: %.2f\n"
                + "Porcentaje: %d\n"
                + "Valor del menu: %.2f\n",
                obtenerNombrePlato(),
                valorInicialMenu(),
                obtenerPorcionGuarnicion(),
                obtenerValorBebida(),
                obtenerPorcentajeAdicional(),
                valorMenu());

        return cadena;
    }
}
