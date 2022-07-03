/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        ArrayList<Menu> listadoCartas = new ArrayList<>();
        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingresa 1 para menú económico\n"
                    + "Ingresa 2 para menú del día\n"
                    + "Ingresa 3 para menú de los niños\n"
                    + "Ingresa 4 para menú de la carta\n");
            int n = entrada.nextInt();
            if (n == 1) {
                System.out.println("DATOS DEL MENU ECONOMICO\n");
                System.out.println("Ingresa el nombre del plato");
                entrada.nextLine();
                String nombrePlato = entrada.nextLine();
                System.out.println("Ingresa el valor del menú");
                double valorInicialMenu = entrada.nextDouble();
                System.out.println("Ingresa el porcentaje");
                int porcentaje = entrada.nextInt();

                MenuEconomico mE1 = new MenuEconomico(nombrePlato, valorInicialMenu,
                        porcentaje);

                listadoCartas.add(mE1);
            } else {
                if (n == 2) {
                    System.out.println("DATOS DEL MENU DIA\n");
                    System.out.println("Ingresa el nombre del plato");
                    entrada.nextLine();
                    String nombrePlato = entrada.nextLine();
                    System.out.println("Ingresa el valor del menú");
                    double valorInicialMenu = entrada.nextDouble();
                    System.out.println("Ingresa el valor del postre");
                    double valorPostre = entrada.nextDouble();
                    System.out.println("Ingresa el valor de la bebida");
                    double valorBebida = entrada.nextDouble();

                    MenuDia mD1 = new MenuDia(nombrePlato, valorInicialMenu,
                            valorPostre, valorBebida);

                    listadoCartas.add(mD1);
                } else {
                    if (n == 3) {
                        System.out.println("DATOS DEL MENU NIÑOS\n");
                        System.out.println("Ingresa el nombre del plato");
                        entrada.nextLine();
                        String nombrePlato = entrada.nextLine();
                        System.out.println("Ingresa el valor del menú");
                        double valorInicialMenu = entrada.nextDouble();
                        System.out.println("Ingresa el valor de la porcion del helado");
                        double valorPorcionHelado = entrada.nextDouble();
                        System.out.println("Ingresa el valor de la porcion del pastel");
                        double valorPorcionPastel = entrada.nextDouble();

                        System.out.println("Ingresa el nombre del plato");
                        entrada.nextLine();
                        String nombrePlato2 = entrada.nextLine();
                        System.out.println("Ingresa el valor del menú");
                        double valorInicialMenu2 = entrada.nextDouble();
                        System.out.println("Ingresa el valor de la porcion del helado");
                        double valorPorcionHelado2 = entrada.nextDouble();
                        System.out.println("Ingresa el valor de la porcion del pastel");
                        double valorPorcionPastel2 = entrada.nextDouble();

                        MenuDia mN1 = new MenuDia(nombrePlato, valorInicialMenu,
                                valorPorcionHelado, valorPorcionPastel);

                        MenuNiños mN2 = new MenuNiños(nombrePlato2, valorInicialMenu2,
                                valorPorcionHelado2, valorPorcionPastel2);

                        listadoCartas.add(mN1);
                        listadoCartas.add(mN2);
                    } else {
                        if (n == 4) {
                            System.out.println("DATOS DEL MENU CARTA\n");
                            System.out.println("Ingresa el nombre del plato");
                            entrada.nextLine();
                            String nombrePlato = entrada.nextLine();
                            System.out.println("Ingresa el valor del menú");
                            double valorInicialMenu = entrada.nextDouble();
                            System.out.println("Ingresa el valor de la porcion de guarnicion");
                            double valorPorcionGuarnicion = entrada.nextDouble();
                            System.out.println("Ingresa el valor de la bebida");
                            double valorBebida = entrada.nextDouble();
                            System.out.println("Ingresa el porcentaje adicional");
                            int porcentajeAdicional = entrada.nextInt();

                            MenuCarta mC1 = new MenuCarta(nombrePlato, valorInicialMenu,
                                    valorPorcionGuarnicion, valorBebida, porcentajeAdicional);

                            listadoCartas.add(mC1);
                        } else {
                            System.out.println("FUERA DE RANGO");
                        }
                    }
                }

            }

            System.out.println("Ingrese 10 si no desea ingresar más listados de menu");
            int numeroSalida = entrada.nextInt();
            if (numeroSalida == 10) {
                bandera = false;
            }
        }
        for (int i = 0; i < listadoCartas.size(); i++) {
            listadoCartas.get(i).establecerValorMenu();
        }
        Cuenta cuenta = new Cuenta("Leonardo Chuquimarca", 0.12, listadoCartas);
        cuenta.establecerValorTotal();
        System.out.println(cuenta);
    }
}
