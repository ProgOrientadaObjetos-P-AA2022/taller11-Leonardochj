/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Cuenta {

    private String nombreCliente;
    private double IVA;
    ArrayList<Menu> listadoCartas = new ArrayList<>();
    private double valorTotal;
    private double subTotal;

    public Cuenta(String a, double b, ArrayList<Menu> lista) {
        nombreCliente = a;
        IVA = b;
        listadoCartas = lista;
    }

    public void establecerNombreCliente(String c) {
        nombreCliente = c;
    }

    public void establecerIVA(double c) {
        IVA = c;
    }

    public void establecerListaMenu(ArrayList<Menu> c) {
        listadoCartas = c;
    }

    public void establecerValorTotal() {
        double suma = 0;
        for (int i = 0; i < obtenerListaMenu().size(); i++) {
            suma = suma + obtenerListaMenu().get(i).valorMenu();
        }
        subTotal = suma;
        valorTotal = suma + (subTotal * IVA);
    }

    public ArrayList<Menu> obtenerListaMenu() {
        return listadoCartas;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public double obtenerIVA() {
        return IVA;
    }

    public double obtenerSubTotal() {
        return subTotal;
    }

    public double obtenerValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        String cadena = "LISTADO DE MENUS\n";
        cadena = String.format("%sNombre cliente: %s\nIVA: %.2f\n",
                cadena,
                obtenerNombreCliente(),
                obtenerIVA());
        for (int i = 0; i < obtenerListaMenu().size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    obtenerListaMenu().get(i));
        }
        cadena = String.format("%sSubtotal: %.2f\nCosto total a pagar: %.2f\n",
                cadena,
                obtenerSubTotal(),
                obtenerValorTotal());
        return cadena;
    }

}
