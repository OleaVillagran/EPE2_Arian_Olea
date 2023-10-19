/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.epe2_arian_olea;

/**
 *
 * @author kripp
 */
public class Ventas extends Datos_Factura {

    private Integer totalVentas;
    private double montoVentas;

    public Ventas() {
    }

    public Ventas(Integer totalVentas, double montoVentas) {
        this.totalVentas = totalVentas;
        this.montoVentas = montoVentas;
    }

    public Ventas(Integer totalVentas, double montoVentas, String nombreCliente, String apellidosCliente, String edadCliente, String rutCliente, String nombreEmpresa, String rutEmpresa, String giroEmpresa) {
        super(nombreCliente, apellidosCliente, edadCliente, rutCliente, nombreEmpresa, rutEmpresa, giroEmpresa);
        this.totalVentas = totalVentas;
        this.montoVentas = montoVentas;
    }

    public Integer getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(Integer totalVentas) {
        this.totalVentas = totalVentas;
    }

    public double getMontoVentas() {
        return montoVentas;
    }

    public void setMontoVentas(double montoVentas) {
        this.montoVentas = montoVentas;
    }
    
    public double calcularIva() {
        return montoVentas * 0.19; // 19% de IVA
    }

    public double calcularUtilidades() {
        double montoIva = calcularIva();
        return montoVentas - montoIva;
    }

}
