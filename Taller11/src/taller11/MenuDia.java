/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author Usuario
 */
public class MenuDia extends Menu {

    private double valorPostre;
    private double valorBebida;

    public MenuDia(String f, double h, double b, double c) {
        super(f, h);
        valorPostre = b;
        valorBebida = c;
    }

    public void establecerPostre(double c) {
        valorPostre = c;
    }

    public void establecerValorBebida(double c) {
        valorBebida = c;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorPostre + valorBebida;
    }

    public double obtenerPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre del plato: %s\n"
                + "Valor inicial del menu: %.2f\n"
                + "Valor del postre: %.2f\n"
                + "Valor de la bebida: %.2f\n"
                + "Valor del menu: %.2f\n",
                obtenerNombrePlato(),
                valorInicialMenu(),
                obtenerPostre(),
                obtenerValorBebida(),
                valorMenu());

        return cadena;
    }
}
