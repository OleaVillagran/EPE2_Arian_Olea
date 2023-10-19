/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//Linea que indica el package del proyecto
package com.mycompany.epe2_arian_olea;

//importando Scanner para usar en los input
import java.util.Scanner;

/**
 *
 * @author kripp
 */
//indica la clase
public class EPE2_Arian_Olea {

    //Metodo main, desde aca se ejecuta el programa
    public static void main(String[] args) {

        //Creo la instancia de Scanner
        Scanner scanner = new Scanner(System.in);

        //Menu de ingreso, contiene prints para pedir la info y Scanners para almacenar la info ingresada
        System.out.println("¡Bienvenido!");
        System.out.println("------------");
        System.out.println("MENU DE INGRESO DE FACTURAS");
        System.out.print("Ingrese nombre de cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Ingrese apellido de cliente: ");
        String apellidoCliente = scanner.nextLine();
        System.out.print("Ingrese edad de cliente: ");
        String edadCliente = scanner.nextLine();
        System.out.print("Ingrese RUT de cliente: ");
        String rutCliente = scanner.nextLine();
        System.out.print("Ingrese Nombre de empresa: ");
        String nombreEmpresa = scanner.nextLine();
        System.out.print("Ingrese RUT de empresa: ");
        String rutEmpresa = scanner.nextLine();
        System.out.print("Ingrese Giro de empresa: ");
        String giroEmpresa = scanner.nextLine();
        System.out.print("Ingrese total de ventas: ");
        Integer totalVentas = scanner.nextInt();
        System.out.print("Ingrese monto total: ");
        double montoVentas = scanner.nextDouble();

        //cierro Scanner para liberar memoria
        scanner.close();

        //creo las instancias u objetos para ingresar los input anteriores
        Datos_Factura factura = new Datos_Factura(nombreCliente, apellidoCliente, edadCliente, rutCliente, nombreEmpresa, rutEmpresa, giroEmpresa);
        Ventas ventas = new Ventas(totalVentas, montoVentas);

        // Calcular IVA y utilidades
        double montoIva = ventas.calcularIva();
        double montoUtilidades = ventas.calcularUtilidades();

        // Mostrar resultados
        System.out.println("Información del Cliente:");
        System.out.println("Nombre: " + factura.getNombreCliente());
        System.out.println("Apellido: " + factura.getApellidosCliente());
        System.out.println("Edad: " + factura.getEdadCliente());
        System.out.println("RUT del Cliente: " + factura.getRutCliente());
        System.out.println("Información de la Empresa:");
        System.out.println("Nombre de la Empresa: " + factura.getNombreEmpresa());
        System.out.println("RUT de la Empresa: " + factura.getRutEmpresa());
        System.out.println("Giro de la Empresa: " + factura.getGiroEmpresa());
        System.out.println("Monto en IVA a pagar: " + montoIva);
        System.out.println("Monto de utilidades: " + montoUtilidades);
    }
}
