/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author Usuario
 */
public class MenuEconomico extends Menu {

    private int porcentajeDescuento;

    public MenuEconomico(String a, double c, int b) {
        super(a, c);
        porcentajeDescuento = b;
    }

    public void establecerPorcentajeDescuento(int c) {
        porcentajeDescuento = c;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu
                - ((valorInicialMenu * porcentajeDescuento) / 100);
    }

    public int obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre del plato: %s\n"
                + "Valor inicial del menu: %.2f\n"
                + "Porcentaje: %d\n"
                + "Valor del menu: %.2f\n",
                obtenerNombrePlato(),
                valorInicialMenu(),
                obtenerPorcentajeDescuento(),
                valorMenu());

        return cadena;
    }
}
