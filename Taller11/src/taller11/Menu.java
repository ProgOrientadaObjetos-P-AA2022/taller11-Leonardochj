/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author Usuario
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;

    public Menu(String a, double b) {
        nombrePlato = a;
        valorInicialMenu = b;
    }

    public void establecerNombrePlato(String c) {
        nombrePlato = c;
    }

    public abstract void establecerValorMenu();

    public void establecerValorInicialMenu(double c) {
        valorInicialMenu = c;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double valorMenu() {
        return valorMenu;
    }

    public double valorInicialMenu() {
        return valorInicialMenu;
    }
}
