/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.epe2_arian_olea;

/**
 *
 * @author kripp
 */
public class Datos_Factura {
    private String nombreCliente[];
    private String apellidosCliente[];
    private String edadCliente[];
    private String rutCliente[];
    private String nombreEmpresa[];
    private String rutEmpresa[];
    private String giroEmpresa[];
    private String totalVentas[];
    private String montoTotal[];
    private String iva[];

    public Datos_Factura() {
    }

    public Datos_Factura(String[] nombreCliente, String[] apellidosCliente, String[] edadCliente, String[] rutCliente, String[] nombreEmpresa, String[] rutEmpresa, String[] giroEmpresa, String[] totalVentas, String[] montoTotal, String[] iva) {
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.edadCliente = edadCliente;
        this.rutCliente = rutCliente;
        this.nombreEmpresa = nombreEmpresa;
        this.rutEmpresa = rutEmpresa;
        this.giroEmpresa = giroEmpresa;
        this.totalVentas = totalVentas;
        this.montoTotal = montoTotal;
        this.iva = iva;
    }

    public String[] getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String[] nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String[] getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String[] apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String[] getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(String[] edadCliente) {
        this.edadCliente = edadCliente;
    }

    public String[] getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String[] rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String[] getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String[] nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String[] getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(String[] rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    public String[] getGiroEmpresa() {
        return giroEmpresa;
    }

    public void setGiroEmpresa(String[] giroEmpresa) {
        this.giroEmpresa = giroEmpresa;
    }

    public String[] getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(String[] totalVentas) {
        this.totalVentas = totalVentas;
    }

    public String[] getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(String[] montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String[] getIva() {
        return iva;
    }

    public void setIva(String[] iva) {
        this.iva = iva;
    }
    
    
}
