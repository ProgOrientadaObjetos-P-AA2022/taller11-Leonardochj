/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author Usuario
 */
public class MenuNiños extends Menu {

    private double valorPorcionHelado;
    private double valorPorcionPastel;

    public MenuNiños(String a, double f, double b, double c) {
        super(a, f);
        valorPorcionHelado = b;
        valorPorcionPastel = c;
    }

    public void establecerPorcionHelado(double c) {
        valorPorcionHelado = c;
    }

    public void establecerPorcionPastel(double c) {
        valorPorcionPastel = c;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorPorcionHelado + valorPorcionPastel;
    }

    public double obtenerPorcionHelado() {
        return valorPorcionHelado;
    }

    public double obtenerPorcionPastel() {
        return valorPorcionPastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre del plato: %s\n"
                + "Valor inicial del menu: %.2f\n"
                + "Valor de la porcion del helado: %.2f\n"
                + "Valor de la porcion del pastel: %.2f\n"
                + "Valor del menu: %.2f\n",
                obtenerNombrePlato(),
                valorInicialMenu(),
                obtenerPorcionHelado(),
                obtenerPorcionPastel(),
                valorMenu());

        return cadena;
    }
}
