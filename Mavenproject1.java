/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Mavenproject1 {
   

    public static void main(String[] args) {
        //Menu 
        String opcion = JOptionPane.showInputDialog(null,"***********MENU************ /  + 1- Agregar vendedor  + 2- Agregar Factura  + 3- Salir");
        int opcion1=0;
        opcion1=Integer.parseInt(opcion);
        switch(opcion1){
            case 1:
                Vendedor();
            case 2:
                Factura();
            case 3:
                
                
         
        }
    }
}
