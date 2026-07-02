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
public class Vendedor {
    //Crear los atributos de la clase 
    private int cedula;
    private String nombre;
    private int codigo;
    private String sucursal;
    private VehiculoPropio vehiculoPropio;
    
    //Recibir los atributos de la clase
    public Vendedor() {
     String cedula=JOptionPane.showInputDialog(null,"Ingrese la Cédula: ");
     int Cedula= Integer.parseInt(cedula);
     String nombre=JOptionPane.showInputDialog(null,"Ingrese el nombre: ");
     String codigo= JOptionPane.showInputDialog(null,"Ingrese el Codigo: ");
     int Codigo=Integer.parseInt(codigo);;
     String sucursal=JOptionPane.showInputDialog(null,"Ingrese la sucursal: ");
     String vehiculoPropio =JOptionPane.showInputDialog(null,"Ingrese si tiene vehiculo propio: 1.Si 2.No");
 
        
        this.cedula = Cedula;
        this.nombre = nombre;
        this.codigo = Codigo;
        this.sucursal = sucursal;
        
       if (vehiculoPropio=="1"){
           this.vehiculoPropio =VehiculoPropio.SiTiene;
       } else if (vehiculoPropio=="2")
           this.vehiculoPropio =VehiculoPropio.NoTiene;
       } else {
           JOptionPane.showMessageDialog(null,"No ingreso una opción valida");
        
    }
    
    public void agregarVendedor(){
        
    }
    
    public int getCedula(){
        return cedula;
    }
    
    public void setCedula(){
        this.cedula= cedula;
    }
      
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(){
        this.nombre= nombre;
    }
    
     public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(){
        this.codigo=codigo;
    }
    
     public String getSucursal(){
        return sucursal;
    }
    
    public void setSucursal(){
        this.sucursal= sucursal;
    }
    
    @Override
    public String toString() {
        return "Vendedor{" + "\ncedula=" + cedula + ", \nnombre=" + nombre + ", \nCodigo=" + codigo + ", \nsalarioClaseprivada=" + sucursal + ", \nSucursal=" + sucursal + '}';
    }
}
