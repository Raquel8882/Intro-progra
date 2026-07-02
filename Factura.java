/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Factura {
    //Crear los atributos de la clase 
    public int CédulaCliente;
    public String NombreCliente;
    public int CodigoFactura;
    public String sucursal;
    public int mes;
    public int electricos;
    public int construccion;
    public int automotrices;
    
    //Recibir los atributos de la clase
     public Factura() {
         String cedula = JOptionPane.showInputDialog(null, "Ingrese la Cédula: ");
         int CédulaCliente = Integer.parseInt(cedula);
         String NombreCliente = JOptionPane.showInputDialog(null, "Ingrese el nombre: ");
         String codigo = JOptionPane.showInputDialog(null, "Ingrese el Codigo: ");
         int CodigoFactura = Integer.parseInt(codigo);
         String sucursal = JOptionPane.showInputDialog(null, "Ingrese la sucursal: ");

         String mes = JOptionPane.showInputDialog(null, "Ingrese el Mes: ");
         int Mes = Integer.parseInt(mes);
         
         this.CédulaCliente = CédulaCliente;
         this.NombreCliente = NombreCliente;
         this.CodigoFactura = CodigoFactura;
         this.sucursal = sucursal;
         this.mes = Mes;
         this.electricos = electricos;
         this.construccion = construccion;
         this.automotrices = automotrices;


       
    }
    
}
