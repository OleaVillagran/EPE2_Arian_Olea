/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.epe2_arian_olea;

/**
 *
 * @author kripp
 */
//creacion de la clase
public class Datos_Factura {

    //creo las variables de la clase
    private String nombreCliente;
    private String apellidosCliente;
    private String edadCliente;
    private String rutCliente;
    private String nombreEmpresa;
    private String rutEmpresa;
    private String giroEmpresa;

    //Constructor vacio
    public Datos_Factura() {
    }

    //creo el constructor y agrego try catch para validar que se ingresen todos los datos, en la excepcion pongo el mensaje a mostrar
      public Datos_Factura(String nombreCliente, String apellidosCliente, String edadCliente, String rutCliente, String nombreEmpresa, String rutEmpresa, String giroEmpresa) {
        try {
            //aqui valido que los datos no esten vacios con esta condicion
            if (nombreCliente.isEmpty() || apellidosCliente.isEmpty() || edadCliente.isEmpty() || rutCliente.isEmpty() || nombreEmpresa.isEmpty() || rutEmpresa.isEmpty() || giroEmpresa.isEmpty()) {
                throw new IllegalArgumentException("Todos los campos son obligatorios. Por favor, complete la información.");
            }
            
            this.nombreCliente = nombreCliente;
            this.apellidosCliente = apellidosCliente;
            this.edadCliente = edadCliente;
            this.rutCliente = rutCliente;
            this.nombreEmpresa = nombreEmpresa;
            this.rutEmpresa = rutEmpresa;
            this.giroEmpresa = giroEmpresa;
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

      //getters y setters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(String edadCliente) {
        this.edadCliente = edadCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    public String getGiroEmpresa() {
        return giroEmpresa;
    }

    public void setGiroEmpresa(String giroEmpresa) {
        this.giroEmpresa = giroEmpresa;
    }

}
